package com.google.javase.findkey;

import java.util.Scanner;
/*
 *������Ŀ��
Tom׼��ת�п����꣬����������һ��ѻ����������װ�ɻ�����ÿ������Ҫ����m�ֲ�һ���Ļ���
ÿ�ֻ���Ҫ�� r �䡣��ô�������ˣ�Tomֻ����n�ֻ���ÿ�ֻ��ֱ��� zi �䡣������ܰ�װ�����ٸ�����
����
��һ������n����ΧΪ[0, 100000]����m����ΧΪ[0, 100000]����r����ΧΪ[0, 100000].
�ڶ�������n��������zi�����i�ֻ��� zi ��
���
Tom����ܰ�װ�����ٸ�����

��������
3 2 3
7 7 9
�������
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
