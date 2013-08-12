package com.livejournal.propertyreader;

import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
	private static final String Properties = "/file.properties";

	public static String loadProperty(String name) {
		Properties props = new Properties();
		try {
			props.load(PropertyReader.class.getResourceAsStream(Properties));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value = "";

		if (name != null) {
			value = props.getProperty(name);
		}
		return value;
	}

}
