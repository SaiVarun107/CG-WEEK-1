public class VolumeOfEarth {
	public static void main(String[] args) {
		double pi,radius,volumeinkm,volumeinmiles;
		pi = Math.PI;
		radius = 6378;
		volumeinkm = (4/3) * pi * radius * radius * radius;
		volumeinmiles = volumeinkm * 1.6 * 1.6 * 1.6;
		System.out.println("The volume of earth in cubic kilometers is " + volumeinkm + " and cubic miles is " + volumeinmiles);
	}
}