package com.google.javase.zs;
/*
 * 堆排序的细节和复杂度分析时间复杂度O(N*logN)，额外空间复杂度O(logN)
 * 1，堆结构的heapInsert与heapify
 * 2堆结构的增大和减少
 *3，如果只是建立堆的过程，时间复杂度为O(N)
 *4优先级队列结构，就是堆
 */
public class heapSort {
	public static void main(String[] args) {
	/*	int arr[]={5555,9,7,4,2,196,6,8,7,5,4,3,343,234,222,333};
		heapSort(arr);
		for(int i=0;i<arr.length;++i) {
			System.out.println(arr[i]);
		}*/
		String str="abc";
		str+="de";
	}
	public static void heapSort(int[] arr) {
		if(arr==null||arr.length<2) {
			return;
		}
		for(int i=0;i<arr.length;++i) {
			heapInsert(arr,i);
		}
		int i=arr.length;
		swap(arr,0,--i);
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		while(i>0) {
			heapIfy(arr,i);
			swap(arr,0,--i);
		}
	}
	private static void heapIfy(int[] arr, int index) {
		int i=0;
		int left=2*i+1;
		while(left<index) {
			int max=left+1<index&&arr[left+1]>arr[left]?left+1:left;
			max=arr[max]>arr[i]?max:i;
			if(max==i) {
				break;
			}
			swap(arr,max,i);
			i=max;
			left=2*i+1;
		}		
	}
	private static void heapInsert(int[] arr, int index) {
		while(arr[index]>arr[(index-1)/2]) {
			swap(arr,index,(index-1)/2);
			index=(index-1)>>1;
		}	
	}
	private static void swap(int[] arr, int i, int j) {
		int zjz;
		zjz=arr[j];
		arr[j]=arr[i];
		arr[i]=zjz;
	}
	

}