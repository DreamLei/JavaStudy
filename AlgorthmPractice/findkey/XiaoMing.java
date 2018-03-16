package com.google.javase.findkey;

import java.util.Scanner;
import java.util.Stack;

public class XiaoMing {
/*
 *题目描述：
小明去游乐园玩耍，他的票一共可以玩t分钟。
游乐场一共有n个项目，编号1到n，第i个项目需要a[i]的时间。游乐场规定，在票没有到期前，拥有者都可以入场，无论完成项目出场时该票是否已经过期。
小明可以任意决定玩项目的顺序，但是每个项目他只想玩一次。问小明最长可以玩多久？
输入
第一行两个整数n，t，含义如题面，1≤n≤100，1≤t≤10000000；
接下来一行n个整数，第i个整数a[i]表示第i个项目所需的时间，1≤a[i]≤100。
输出
输出一个整数，表示小明最长可以玩多久。
样例输入
4 12
5 5 5 5
样例输出
15
Hint
补充样例：
输入样例：
4 20
10 10 10 10
输出样例：
20 
 * 
 */
	
	
	static int maxTime(int []array,int []a,int t) {
		if(t<=0) {
			return 0;
		}
		int n=t;
		int maxt=0,cnt=0;
		for(int i=0;i<array.length;++i) {
			if(a[i]!=-1) {
				a[i]=-1;
				cnt=maxTime(array,a,t-array[i])+array[i];
			}
			if(maxt<cnt) {
				maxt=cnt;
			}
			
		}
		return maxt;
	}		
	public static void main(String[] args) {
		int n,t;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		t=scan.nextInt();
		int array[]=new int [n];
		for(int i=0;i<n;++i) {
			array[i]=scan.nextInt();
		}
		int a[]=new int[n];
		System.out.println(maxTime(array,a,t));
	}

}
