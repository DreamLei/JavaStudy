package com.google.javase.findkey;

import java.util.Scanner;
import java.util.Stack;

public class XiaoMing {
/*
 *��Ŀ������
С��ȥ����԰��ˣ������Ʊһ��������t���ӡ�
���ֳ�һ����n����Ŀ�����1��n����i����Ŀ��Ҫa[i]��ʱ�䡣���ֳ��涨����Ʊû�е���ǰ��ӵ���߶������볡�����������Ŀ����ʱ��Ʊ�Ƿ��Ѿ����ڡ�
С�����������������Ŀ��˳�򣬵���ÿ����Ŀ��ֻ����һ�Ρ���С����������ã�
����
��һ����������n��t�����������棬1��n��100��1��t��10000000��
������һ��n����������i������a[i]��ʾ��i����Ŀ�����ʱ�䣬1��a[i]��100��
���
���һ����������ʾС����������á�
��������
4 12
5 5 5 5
�������
15
Hint
����������
����������
4 20
10 10 10 10
���������
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
