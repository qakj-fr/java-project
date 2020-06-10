package com.qakj.crm.utils;

import java.util.UUID;

public class UUIDUtils {
	public static String getUUID(){
		UUID uuid = UUID.randomUUID();
		String replaceAll = uuid.toString().replaceAll("-", "");
		return replaceAll;
	}
}
