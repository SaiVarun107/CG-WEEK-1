import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double h,b,areainsquarecm,areainsquareinch;
		System.out.print("Height in cms :");
		h = input.nextDouble();
		System.out.print("Base in cms:");
		b = input.nextDouble();
		areainsquarecm = (0.5) * b * h;
		areainsquareinch = areainsquarecm / (2.54 * 2.54);
		System.out.printf("The Area of Triangle is %.4f square inches and %.4f square centimeters",areainsquareinch,areainsquarecm);
		input.close();
		
	}
}