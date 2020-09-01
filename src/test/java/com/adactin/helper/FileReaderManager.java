package com.adactin.helper;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {   // static method
		FileReaderManager frm = new FileReaderManager();
		return frm;

	}
	
	public ConfigurationReader getCrInstance() throws IOException { // to use in configuration reader alone we assume it as non static method
	ConfigurationReader cr = new ConfigurationReader();
	return cr;

	}
	
}
