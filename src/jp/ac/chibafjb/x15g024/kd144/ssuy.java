package jp.ac.chibafjb.x15g024.kd144;

import java.util.Scanner;

public class ssuy {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("住所の入力-->");
		System.out.println("氏名の入力-->");
		System.out.println("電話番号の入力－>");
		String a = sin.next();
		String b = sin.next();
		String c = sin.next();
		sin.close();
		System.out.println("＜確認＞住    所："+a);
		System.out.println("        氏    名："+b);
		System.out.println("        電話番号："+c);

	}

}
