package com.google.javase.findkey;

import java.util.Scanner;
/*
 *今天题目：
Tom准备转行开花店，所以他进了一大堆花回来打算包装成花束。每个花束要求有m种不一样的花，
每种花需要放 r 朵。那么问题来了，Tom只进了n种花，每种花分别有 zi 朵。他最多能包装出多少个花束
输入
第一行输入n（范围为[0, 100000]）、m（范围为[0, 100000]）、r（范围为[0, 100000].
第二行输入n个整数，zi代表第i种花有 zi 朵
输出
Tom最多能包装出多少个花束

样例输入
3 2 3
7 7 9
样例输出
3
 
 */
public class Test03 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int r=scan.nextInt();
		int []a=new int[n];
		for(int i=0;i<a.length;++i) {
			a[i]=scan.nextInt();
		}
		int cnt=0;
		boolean bool=true;
		while(bool) {
			int t=n-1,i=0;
			for(;i<m;++i) {
				while(t!=-1&&a[t]<r) {
					t--;
					continue; 
				}
				if(t==-1) {
					bool=false;
					break;
				}
				else {
					a[i]-=r;
					t--;
				}
			}
			if(bool&&i==m) {
				cnt++;
			}
			else {
				break;
			}
		}
		System.out.println(cnt);
	}

}
