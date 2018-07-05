package com.wuhan.www.order.server;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FirstMainTest {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss", Locale.ENGLISH);
		
		String date2 = "26-May-2017 00:00:00";
		Date aaa = sdf2.parse(date2);
		System.out.println(aaa);
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss", Locale.ENGLISH);
		String sss = sdf3.format(aaa);
		System.out.println(sss);
		
	}

}
