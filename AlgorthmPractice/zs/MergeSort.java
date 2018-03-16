package com.google.javase.zs;
//πÈ≤¢≈≈–Ú
public class MergeSort {
	static void metge(int []array,int p,int q,int r) {
   	 	int a[]=new int[q-p+1];
   	 	int cnt=0,zjz;
   	 	int j=r+1,i=p;
   	 	while(j<q+1||i<r+1) {
   	 		if(j==q+1||(i<r+1&&array[i]<array[j])) {
   	 			a[cnt++]=array[i++];
   	 		}else {
   	 			a[cnt++]=array[j++];
   	 		}
   	 	}
   	 	for(i=0;i<a.length;i++) {
   	 		array[i+p]=a[i];
   	 	}
    } 
	static void metgeSort(int []array,int p,int q) {
    	 if(p<q) {
    		 int r=(p+q)/2;
    		 metgeSort(array,p,r);
    		 metgeSort(array,r+1,q);
    		 metge(array,p,q,r);
    	 } 	 
	}
     
	public static void main(String[] args) {
		int array[]= {3,4,6,1,2,7,9};
		metgeSort(array,0,array.length-1);
		for(int i:array) {
			System.out.println(i);
		}
	}
}
