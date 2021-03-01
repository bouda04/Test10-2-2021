package q3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter a char");	
		char ch = in.next().charAt(0);
		System.out.println("enter a number");
		int size = in.nextInt();
		
		for(int i=0;i<size;i++) {
			for (int j=0; j<size-i;j++) {
				System.out.print((char)(ch + j) + "  ");
			}
			System.out.println();
		}

	}

}
