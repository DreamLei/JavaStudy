package com.google.javase.findkey;

import java.util.Arrays;
import java.util.Scanner;

public class Increase {
/*今天算法：求一个整数序列的最长递增子序列。
输入：第一行为序列长度，第二行给出整数序列。
输出：第一行为最长递增子序列的长度，第二行为最长递增子序列。
例输入：
5 
3 1 4 2 3 
输出：
3
1 2 3
*/
	static void increaseArray(int []array) {
		int [][]maxArray=new int[array.length][array.length];
		int []k=new int[array.length];
		int max,maxi = 0;
		for(int i=0;i<array.length;++i) {
			k[i]=1;
			for(int j=0;j<i;++j) {
				
				if(array[i]>array[j]&&k[i]<k[j]+1 ) {
					k[i]=k[j]+1;
						maxArray[i]=maxArray[j].clone();
					maxArray[i][k[i]-1]=array[i];
				}
				
				if(k[i]==1) {
					maxArray[i][0]=array[i];
				}
			}
			if(i==0) {
				maxArray[i][0]=array[i];
			}
		}
			max=k[0];
			for(int i=1;i<array.length;++i) {
				if(k[i]>max) {
					max=k[i];
					maxi=i;
				}
			}
			System.out.println(max);
		for(int i=0;i<max;i++)
			System.out.println(maxArray[maxi][i]);
	}
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in); 
		n=scan.nextInt();
		int []array=new int[n];
		for(int i=0;i<n;++i) {
			array[i]=scan.nextInt();
		}
		increaseArray(array);
		
	}
}
