package com.prototype.controller;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.List;

public class SoketServer {

    private List<ServerThread> clients = null;

    public static void main(String[] args) {
        new SoketServer().startUp();
    }

    private void startUp() {
        ServerSocket ss = null;
        Socket s = null;
        try {
            ss = new ServerSocket(5858);
            clients = new ArrayList<ServerThread>();
            while (true) {
                s = ss.accept();
                System.out.println("服务器启动成功");
                ServerThread st = new ServerThread(s);
                new Thread(st).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ss != null)
                    ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private class ServerThread implements Runnable {
        private Socket s = null;
        private BufferedReader in;
        private PrintWriter out;
        private String name;
        private boolean flag = true;

        public ServerThread(Socket socket) throws IOException {
            this.s = socket;
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);
            String str = in.readLine();
            name = str+"["+socket.getInetAddress().getHostAddress()+":"+socket.getPort()+"]";
            clients.add(this);
            send(name+"上线了");
        }

        private void send(String msg) {
            for (ServerThread st : clients)
                st.out.println(msg);
        }

        private void receive() throws IOException {
            String str = null;
            while ((str=in.readLine()) != null) {
                if (str.equalsIgnoreCase("quit")) {
                    stop();
                    out.println("disconnect");
                    break;
                }
                send(name+":"+str);
            }
        }

        private void stop() {
            clients.remove(this);
            flag = false;
            send(name+"已经下线了");
        }

        @Override
        public void run() {
            try {
                while (true) {
                    if (!flag) break;
                    receive();
                }
            } catch (SocketException e) {
                stop();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (s != null)
                        s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
