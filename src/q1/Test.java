package q1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		final int LIMIT=5;
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter " + LIMIT + " integers");	
		int prev = in.nextInt();
		int num = in.nextInt();
		int difference = num-prev;
		boolean flag =true;
		for(int i=2;i<LIMIT;i++) {
			prev = num;
			num = in.nextInt();
			if (num-prev != difference) {
				flag=false;
				break;
			}		
		}
		if (flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
