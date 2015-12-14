package jp.ac.chibafjb.x15g024.kd152;

import java.util.Scanner;

public class jj {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("半径r -->");
		float r = sin.nextFloat();
		sin.close();
		System.out.println("円周　=　 "+2*3.14*r);
		System.out.println("面積　=　"+3.14*r*r);

	}

}
