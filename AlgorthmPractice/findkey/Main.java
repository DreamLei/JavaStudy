package com.google.javase.findkey;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n;
		n=scan.nextInt();
		int[]array=new int[n];
		for(int i=0;i<array.length;++i) {
			array[i]=scan.nextInt();
		}
		Arrays.sort(array);
		for(int i=0;i<array.length;++i) {
			System.out.print(array[i]+" ");
		}
	}
}
