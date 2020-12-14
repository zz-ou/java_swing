package pac;

public class App {

	public static void main(String[] args) {
		long sum=0;
		for (int i = 0; i <= 2147483647; i=i+2) {
			sum=sum+i;
		}
		
		System.out.println("奇数之和为："+sum);
	}

}
