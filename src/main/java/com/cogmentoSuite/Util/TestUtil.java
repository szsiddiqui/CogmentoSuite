package com.cogmentoSuite.Util;

import java.io.IOException;

import com.cogmentiSuite.base.TestBase;

public class TestUtil extends TestBase{
	public TestUtil() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 5;
	//public static String Test_Excel_Data_Path = "/CogmentoSuite/dataEngine/TestData.xlsx";
	
	// General method for wait...
	public static void sleep(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
