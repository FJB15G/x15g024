package jp.ac.chibafjb.x15g024.kd151;

import java.util.Scanner;

public class oih {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("aの入力-->");
		System.out.println("bの入力-->");
		float a = sin.nextFloat();
		float b = sin.nextFloat();
		sin.close();
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
	}

}
