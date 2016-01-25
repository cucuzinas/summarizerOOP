package Geek;

public class MicroWave {

	// fields or instance variables: unique to each single instance
	int time;  // return 0 >> value in seconds
	String typeOfFood;  // return null
	Boolean on;  // return null

	// class variables: common to all instances
	private static int numberOfMicroWaves = 0;  // magic word "static"
	public static String manufacturer = "ABC";

	// setup instance methods
	public void heatUp() {
		System.out.println("Set up high temperature");
	}

	public void deFrost() {
		System.out.println("Set up low temperature");
	}

	// use void if you don't want to return anything

	public String setTime(int time) {
		int minutes = time / 60;
		int seconds = time % 60;
		String display = minutes + ":" + seconds;
		return display;
	}

	// class method: get total number of calculators
	public static int getNumberOfMicroWaves() {
		return numberOfMicroWaves;
	}
}
