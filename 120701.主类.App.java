package pacc;

import pac.Arrays;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array2d[][] = {
				{1,2,3,4,5,6},
				{7,8,9,10,0,12},
				{8,8,9,10,11,12},
				{7,8,3,10,11,12},
				{88,66,92,102,151,999}
		};
//		for (int row = 0; row < array2d.length; row++) {
//			for (int column = 0; column < array2d[0].length; column++) {
//				System.out.print(array2d[row][column]+" ");
//			}
//			System.out.println();
//		}
		new FineZero().arrayZero(array2d);
		new FineZero().arrayLeft(array2d);
		new FineZero().arrayRight(array2d);
		new FineZero().arrayUp(array2d);
		new FineZero().arrayDown(array2d);
	}

}
