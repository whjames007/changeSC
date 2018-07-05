package com.wuhan.www.order.server;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderServerApplicationTests {

	@Test
	public void contextLoads() {
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
		String date2="26-May-2017 00:00:00";
		
		String sss = sdf2.format(new Date());
		System.out.println(sss);
	}
	
	

}
