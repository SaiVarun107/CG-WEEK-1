public class UniversityFee {
	public static void main(String[] args) {
		double fee,discount,discountedfee;
		fee = 125000;
		discount = fee * 0.1;
		discountedfee = fee - discount;
		System.out.println("The discount amount is INR " + discount + " and final Discounted fee in INR " + discountedfee);
	}
}