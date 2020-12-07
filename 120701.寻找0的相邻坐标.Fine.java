package pacc;

public class FineZero {
	//R_zero(x,y)=(column,row)=R_zero(1,3);
	int x=0;
	int y=0;
	void arrayZero(int array2d[][]){
		for (int row = 0; row < array2d.length; row++) {
			for (int column = 0; column < array2d.length; column++) {
				if (array2d[row][column]==0) {
					System.out.println("R_zero("+column+","+row+")");
				}
			}
		}
	}
	
	void arrayLeft(int array2d[][]){
		for (int y = 0; y < array2d.length; y++) {
			for (int x = 0; x < array2d.length; x++) {
				if (array2d[x][y]==0) {
					System.out.println("R_left("+(y-1)+","+x+")");
				}
			}
		}
	}
	
	public void arrayRight(int array2d[][]){
		for (int y = 0; y < array2d.length; y++) {
			for (int x = 0; x < array2d.length; x++) {
				if (array2d[x][y]==0) {
					System.out.println("R_right("+(y+1)+","+(x)+")");
				}
			}
		}
	}
	public void arrayUp(int array2d[][]){
		for (int y = 0; y < array2d.length; y++) {
			for (int x = 0; x < array2d.length; x++) {
				if (array2d[x][y]==0) {
					System.out.println("R_up("+y+","+(x-1)+")");
				}
			}
		}
	}
	
	public void arrayDown(int array2d[][]){
		for (int y = 0; y < array2d.length; y++) {
			for (int x = 0; x < array2d.length; x++) {
				if (array2d[x][y]==0) {
					System.out.println("R_down("+y+","+(x+1)+")");
				}
			}
		}
	}
	
	
}
