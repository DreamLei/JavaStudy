package com.google.javase.findkey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TowFindKey {
/*
  题目：在给定n个数中找出两个数的和为固定值k。
输入n，再输入n个数，最后输入k
例输入：
9
2 3 5 4 6 12 15 13 4 
16
输出：3 13 
 */

	public static void main(String[] args) {
		int n,key,k=0,g = -1,cnt=0;
		Scanner  scan=new Scanner(System.in);
		n=scan.nextInt();
		int []array=new int[n];
		for(int i=0;i<n;++i) {
			array[i]=scan.nextInt();
		}
		key=scan.nextInt();
		Arrays.sort(array);
		
		for(int i=0,j=n-1;j!=i;) {
			if(array[i]+array[j]==key) {
				cnt++;
				System.out.println(array[i]+" "+array[j]+" ");
				if(array[j]==array[j-1]&&g==-1) {
					g=i;
				}
				i++;
				
			}
			else if(array[i]+array[j]>key) {
				if(g!=-1) {
					i=g;
					g=-1;
				}
				j--;
			}
			else {
				i++;
			}
		}
		scan.close();
		if(cnt==0) {
			System.out.println("没有找到");
		}
	}
} 