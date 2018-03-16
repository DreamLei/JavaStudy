package com.google.javase.day3;

public class TwoLink {
	public static void find(int a[],int b[]) {
		int i=0,j=0;
		while(i<a.length&&j<b.length) {
			if(a[i]>b[j]) {
				j++;
			}
			else if(b[j]>a[i]) {
				i++;
			}
			else {
				System.out.println(a[i++]);
			}
		}
	}
	public static void main(String[] args) {
		int a[]= {1,2,3,6,9,10,11,99,99};
		int b[]= {3,6,9,10,99,99};
		find(a,b);
	}
}
