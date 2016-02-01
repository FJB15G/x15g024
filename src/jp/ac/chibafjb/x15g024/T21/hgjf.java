package jp.ac.chibafjb.x15g024.T21;

import java.util.Scanner;

public class hgjf {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("ハンバーガーの個数-->");
		System.out.println("フライドポテトの個数-->");
		int a = sin.nextInt();
		int b = sin.nextInt();
		int h = 100;
		int p = a*h;
		System.out.println("ハンバーガーの代金="+p);
		int f = 180;
		int m = b*f;
		System.out.println("フライドポテトの代金="+m);
		int l = p+m;
		System.out.println("小計="+l);
		int z = (l*8)/100;
		System.out.println("消費税="+z);
		int g = l+z;
		System.out.println("合計金額="+g);
		System.out.println("受取金額-->");
		int u = sin.nextInt();
		sin.close();
		int q = u-g;
		System.out.println("つり銭="+q);

	}

}
