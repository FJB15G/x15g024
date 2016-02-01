package jp.ac.chibafjb.x15g024.kd161;

public class fghj {

	public static void main(String[] args) {
		int [] test;
		test = new int[2];
		test [0] = 20;
		test [1] = 10;
		int work = test [0];
		test [0] = test [1];
		test [1] = work;
		for(int i=0;i<test.length;i++)
			System.out.println(test[i]);

	}

}
