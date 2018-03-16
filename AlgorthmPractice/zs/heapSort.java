package com.google.javase.zs;
/*
 * �������ϸ�ں͸��Ӷȷ���ʱ�临�Ӷ�O(N*logN)������ռ临�Ӷ�O(logN)
 * 1���ѽṹ��heapInsert��heapify
 * 2�ѽṹ������ͼ���
 *3�����ֻ�ǽ����ѵĹ��̣�ʱ�临�Ӷ�ΪO(N)
 *4���ȼ����нṹ�����Ƕ�
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