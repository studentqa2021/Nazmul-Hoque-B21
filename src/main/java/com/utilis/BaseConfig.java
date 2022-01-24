package com.utilis;

import java.io.FileInputStream;
import java.util.Properties;

public class BaseConfig {
	public static String getValue(String key) throws Exception {
		String configFilePath = "/home/nazmul/Documents/WorkStation/orbitz-automation-framework/config.properties";
		FileInputStream fis = new FileInputStream(configFilePath);
		Properties props = new Properties();
		props.load(fis);
		return props.get(key).toString();
	}
}
