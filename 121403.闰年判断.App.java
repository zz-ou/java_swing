package pac;

import java.util.Scanner;

public class App4 {

	public static void main(String[] args) {
		String str;
		String str2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("请输入公元前3200年至公元后3200年内要判断的年份：");
		
		
		while(true) {
			int year=scanner.nextInt();
			if(year<0) {
				str="公元前";
				//Math.abs()该函数是求绝对值
				int year2=Math.abs(year);
				if(year2%4==1&&year2%100!=0) {
					str2="是闰年";
					System.out.println(str+year2+str2);
				}else {
					str2="是平年";
					System.out.println(str+year2+str2);
				}
			}else {
				str="公元后";
				if(year%4==0&&year%100!=0) {
					str2="是闰年";
					System.out.println(str+year+str2);
				}else {
					str2="是平年";
					System.out.println(str+year+str2);
				}		
				
			}
		}
		
	}
}
