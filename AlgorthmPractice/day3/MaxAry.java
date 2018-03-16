package com.google.javase.day3;

public class MaxAry {
	private  int i=7;
	public void maina() {
		System.out.println(i);
	}
//	3、给定一个数组arr，返回子数组的最大累加和。
//	例如，arr=[1,-2,3,5,-2,6,-1]，[3,5,-2,6]可以累加出最大的和12，所以返回12。
	public static int findMax(int arr[]) {
		int max=arr[0];
		int sum=arr[0];
		for(int i=0,j=0;i<arr.length&&j<arr.length;) {
			if(sum>max) {
				max=sum;
			}
			sum+=arr[j++];
			if(sum<0) {
				i=j+1;
				j=i;
				sum=arr[i];
			}
			else if(sum==0) {
				i++;
			}
		}
		return max;
	}
//	public static void main(String[] args) {
//		int arr[]= {1,-2,3,5,-2,6,-1};
//		System.out.println(findMax(arr));
//	}
}
