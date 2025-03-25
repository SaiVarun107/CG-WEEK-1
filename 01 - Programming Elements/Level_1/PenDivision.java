public class PenDivision {
	public static void main(String[] args) {
		int pens,students,penperstudent,remainingpens;
		pens = 14;
		students = 3;
		penperstudent = pens / students;
		remainingpens = pens%students;
		System.out.println("The Pen Per Student is " + penperstudent + " and the remaining pens not distributed is " + remainingpens + ".");
	}
}