package q2;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		int cntAll=0;
		int cnt6 = 0;
		int sum=0;
		int prev=1;
		
		do {
			int num = rnd.nextInt(6-prev+1) + prev;
			sum += num;
			cntAll++;
			if (num == 6) {
				cnt6++;
				prev = 1;
			}
			else prev = num;
			
			System.out.print(num + "  ");
		}while (cnt6<10 && sum<100);
		
		System.out.println(cntAll);

	}

}
