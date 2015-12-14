package jp.ac.chibafjb.x15g024.kd142;

import java.util.Scanner;

public class dyll {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("整数aの入力 -->");
		System.out.println("整数bの入力 -->");
		int a = sin.nextInt();
		int b = sin.nextInt();
		sin.close();
		int c = a+b;
		int d = a-b;
		System.out.println(a+"+"+b+"="+c);
		System.out.println(a+"-"+b+"="+d);
		System.out.println(a+"*"+b+"="+a*b);
		System.out.println(a+"/"+b+"="+a/b);

	}

}
