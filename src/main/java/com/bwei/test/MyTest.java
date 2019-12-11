package com.bwei.test;

import java.text.ParseException;

import org.junit.Test;

import com.bawei.util.DateUtil;

public class MyTest {
	//根据传入的日期获取年龄
	@Test
	public void getage(){
		int age = DateUtil.getAge("1995-05-05");
		System.out.println(age);
	}
	//根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
	@Test
	public void getfirstdate() throws Exception{
		String date = DateUtil.getMonthFirstDate("2019-12-11");
		System.out.println(date);
	}
	
	//根据传入的参数获取该日期的月初日期，例如给定的日期为“2019-09-19 19:29:39”，返回“2019-09-01 00:00:00”
		@Test
		public void getlastdate() throws Exception{
			String date = DateUtil.getMonthLastDate("2019-12-11");
			System.out.println(date);
		}
		//求未来日期离今天还剩的天数
		@Test
		public void getfuture() throws ParseException{
			String i = DateUtil.testFurtherHasDay("2020-01-13");
			System.out.println(i);
		}
		//求过去日期离今天过去的天数
		@Test
		public void getbefore() throws ParseException{
			String i = DateUtil.testPast("2019-01-01");
			System.out.println(i);
		}
		
}
