package com.google.javase.findkey;

import java.util.Scanner;

public class oneAndZroe {
	static int max(String s) {
		int max=1,cnt=1;
		char[]a=s.toCharArray();
		for(int i=0;i<a.length-1;++i) {
			if(a[i]!=a[i+1]) {
				cnt++;
			}
			else {
				if(cnt>max) {
					max=cnt;
				}
				cnt=1;
			}
		}
		if(cnt>max) {
			max=cnt;
		}
		return max;
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		scan.close();
		System.out.println(max(s));
	}
}
