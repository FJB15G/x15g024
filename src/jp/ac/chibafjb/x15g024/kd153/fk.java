package jp.ac.chibafjb.x15g024.kd153;

import java.util.Scanner;

public class fk {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("半径r -->");
		float r = sin.nextFloat();
		sin.close();
		System.out.println("円周　=　 "+Math.round(2*3.14*r*10)/10.0);
		System.out.println("面積　=　"+Math.round(3.14*r*r*10)/10.0);

	}

}
