import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {
	    int si,principle,rate,time;
	    
		Scanner input = new Scanner(System.in);
		
		System.out.print("Principle = ");
		principle = input.nextInt();
		
		System.out.print("Rate = ");
		rate = input.nextInt();
		
		System.out.print("Time = ");
		time = input.nextInt();
		
		input.close();
		
		si = (principle * rate * time) / 100;
        System.out.println("The Simple Interest is " + si + " for Principle " + principle + ", Rate of Interest " + rate + " and Time " + time);	
    }
}	
		
	