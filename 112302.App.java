package pac;

public class App {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		int arr[][]={
				{23,65},
				{125,487},
				{5,9},
				{12,12},
		};
		while (true) {
			Thread.sleep(1000);
			System.out.println("一秒的时间");
			int rdm = (int)(Math.random()*10%4);
			System.out.println(arr[rdm][0]+","+arr[rdm][1]);
		}
	}

}
