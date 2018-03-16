package com.google.javase.day3;

import java.util.ArrayList;
import java.util.Date;

public class Test {

	public static void main(String[] args) {
		Main m=new Main();
		MaxAry n=new Main();
		m.maina();
		n.maina();
		Date dete=new Date();
		String str=dete.toString();
		System.out.println(str);
		Class c1=new ArrayList<String>().getClass();
		Class c2=new ArrayList<Integer>().getClass();
		System.out.println(c1==c2);
	}

}
