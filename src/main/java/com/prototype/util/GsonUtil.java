package com.prototype.util;

import java.util.HashMap;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.data.domain.Page;

public class GsonUtil {

	public static Gson gson = buildGson();
	
	public static String build() {
		return build(0, "ok", null);
	}

	public static String buildPage (Page page) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("list", page.getContent());
		map.put("totalCount", page.getTotalElements());
		map.put("totalPages", page.getTotalPages());
		return build(map);
	}
	
	public static String build(Object result) {
		return build(0, "ok", result);
	}	
	
	public static String build(int code, String message, Object result) {
		HashMap<String, Object> map = new HashMap<>();
		map.put("resCode", code);
		map.put("resMsg", message);
		if (result != null) {
			map.put("result", result);
		}
		return gson.toJson(map);
	}
	
	private static Gson buildGson() {
		Gson gson = new GsonBuilder().create();
		return gson;
	}
}
