package com.prototype.controller;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClient {
    private Socket s;
    private BufferedReader br;
    private PrintWriter out;
    private boolean flag = true;

    public static void main(String[] args) {
        new SocketClient().stratUp();
    }

    private void stratUp() {
        BufferedReader sbr = null;
        try {
            s = new Socket("127.0.0.1", 5858);
            out = new PrintWriter(s.getOutputStream(), true);
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
//            out.println("老林");
            out.println("老周");
            sbr = new BufferedReader(new InputStreamReader(System.in));

            new Thread(new ClientThread()).start();
            String str = null;
            while (flag && (str=sbr.readLine())!=null) {
                if (!flag) break;
                out.println(str);
            }
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (s != null) s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (sbr != null) s.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void receive() {
        try {
            String rs = br.readLine();
            System.out.println(rs);
            System.out.println(rs.equalsIgnoreCase("disconnect"));
            if (rs.equalsIgnoreCase("disconnect")) {
                System.out.println(123);
                flag = false;
                System.out.println("点击回车退出");
            }
            System.out.println(rs);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private class ClientThread implements Runnable {

        @Override
        public void run() {
            System.out.println(123);
            while (true) {
                if (!flag) break;
                receive();
            }
        }

    }
}
