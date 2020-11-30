package pacc;

public class App implements R{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(R.boy_filePath);
		System.out.println(R.girl_filePath);
		
		for (int row = 0; row < array2d.length; row++) {
			for (int cloumn = 0; cloumn < array2d[0].length; cloumn++) {
				System.out.print(array2d[row][cloumn]+" ");
			}
			System.out.println();
		}
	}

}
