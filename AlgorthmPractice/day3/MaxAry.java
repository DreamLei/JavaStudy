package com.google.javase.day3;

public class MaxAry {
	private  int i=7;
	public void maina() {
		System.out.println(i);
	}
//	3������һ������arr�����������������ۼӺ͡�
//	���磬arr=[1,-2,3,5,-2,6,-1]��[3,5,-2,6]�����ۼӳ����ĺ�12�����Է���12��
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
