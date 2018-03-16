package com.google.javase.zs;
//Ï£¶ûÅÅĞò
public class ShellSort {
	public static void shellSort(int[] data) {
		int zjz;
		if(data.length==1) {
			return ;
		}
		for(int h=data.length/2;h>0;h/=2) {
			for(int i=h;i<data.length;i++) {
				for(int j=i;j>=h&&(data[j]<data[j-h]);j-=h) {
					zjz=data[j];
					data[j]=data[j-h];
					data[j-h]=zjz;
				}
			}
		}	
	}
	public static void main(String[] args) {
		int []data= {3,4,1,2,6,4,5,7,8,0,9,43,98,88,5,7,1001};
		shellSort(data);
		for(int i=0;i<data.length;++i) {
			System.out.print(data[i]+"  ");	
		}
		System.out.println();
	}
}
