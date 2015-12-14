package jp.ac.chibafjb.x15g024.kd141;

import java.util.Scanner;

public class nf {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("整数を1つ入力してください。-->");
		int num = sin.nextInt();
		sin.close();
		System.out.println("あなたの入力した数は"+num+"です。");
	}

}
