package pac;

import java.util.Scanner;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			int num = sc.nextInt();
			if (num==1) {
				System.out.println("x("+(int)(Math.random()*100)+","+(int)(Math.random()*100)+")");
			}
		}
	}

}
