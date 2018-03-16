package com.google.javase.day3;

import java.util.Stack;
//使用一个栈实现另一个栈的排序。
public class StackToStack {
	@SuppressWarnings("null")
	public static Stack <Integer> stackSort(Stack <Integer>stack) {
		Stack<Integer> s = new Stack<Integer>();
		int h;
		while(!stack.isEmpty()) {
			h=stack.pop();
			while(!(s.isEmpty())&&(h<s.peek())) {
				stack.push(s.pop());
			}
			s.push(h);
		}
		return s;
	}
	public static void main(String[] args) {
		Stack <Integer>stack=new Stack<Integer>();
		int a[]= {2,5,3,1,4,9,7,8,6};
		for(int i=0;i<a.length;++i) {
			stack.push(a[i]);
		}
		stack=stackSort(stack);
		for(int i=0;i<a.length;++i) {
			System.out.println(stack.get(i));
		}
	}
}
