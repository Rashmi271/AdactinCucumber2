package com.adactin.helper;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties ps;

	public ConfigurationReader() throws IOException {
		File f = new File("src\\test\\java\\com\\adactin\\properties\\Adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		ps = new Properties();
		ps.load(fis);
	}

	public static String getBrowserName() {
		String browsername = ps.getProperty("BrowserName");
		return browsername;

	}

	public static String getUrl() {
		String url = ps.getProperty("Url");
		return url;
	}
	
	//for example--to check the property file is mentioned correctly
	/*
	 * public static void main(String[] args) throws IOException {
	 * ConfigurationReader c = new ConfigurationReader(); String browserName =
	 * c.getBrowserName(); System.out.println(browserName); String url = c.getUrl();
	 * System.out.println(url); }
	 */
	/*
	 * public static void main(String[] args) { FileReadManager f = new
	 * FileReadManager(); }
	 */
}
