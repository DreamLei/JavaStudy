package com.google.javase.findkey;

import java.util.Scanner;
import java.util.Stack;

/*��Ŀ��
��֤�����Ƿ��������պϡ����� () [] {}��
���磺 {[()]}{}()[] ������������պϵġ�(})]{ ����ǲ��������պϵġ�
���룺�ַ���s��
�����YES����NO��
 * */
public class Brackets {
	
	static boolean bracket(String s,Stack <Character>stack) {
		
		char []c=s.toCharArray();
		char d;
		for(int i=0;i<c.length;++i) {
			if(c[i]=='('||c[i]=='['||c[i]=='{') {
				stack.push(c[i]);
			}
			else if(c[i]==')'||c[i]=='}'||c[i]==']') {
				if(stack.isEmpty()) {
					return false;
				}
				d=stack.pop();
				if(c[i]-d!=')'-'('&&c[i]-d!=']'-'['&&c[i]-d!='}'-'{') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Stack <Character>stack=new Stack();
		String s;
		Scanner scan=new Scanner(System.in);
		s=scan.next();
		scan.close();
		System.out.println(bracket(s,stack));
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		
	}

}
