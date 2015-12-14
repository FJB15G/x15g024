package jp.ac.chibafjb.x15g024.kd143;

import java.util.Scanner;

public class ote {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("住所の入力-->");
		System.out.println("氏名の入力-->");
		System.out.println("電話番号の入力－>");
		String a = sin.next();
		String b = sin.next();
		String c = sin.next();
		sin.close();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
