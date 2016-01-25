package Geek;

public class Main {

	public static void main(String[] args) {

		// Create a MicroWave instance
		MicroWave blue = new MicroWave(); // we just create an instance of MicroWave, instance "blue"
		MicroWave red = new MicroWave(); // we just create an instance of MicroWave, instance "red"

		// assign values to the instance variables, in this case we want instance "blue"
		blue.time = 500;
		blue.typeOfFood = "Hamburguer";
		blue.on = true;

		// assign values to the instance variables, in this case we want instance "red"
		red.time = 300;
		red.typeOfFood = "Cake";
		red.on = false;

		System.out.println(blue.time);
		System.out.println(blue.typeOfFood);
		System.out.println(blue.on);

		// assign values to the class variables
		MicroWave.manufacturer = "XYZ";  // use the class name instead the instance name

		// call a method with no parameters
		// action, call de method deFrost, to act in my blue MicroWave
		blue.deFrost();

		// call a method with parameters
		// action, call de method setTime, to display in my red MicroWave the time in this format "minutes:seconds"
		String displayTime = red.setTime(650);
		System.out.println("DISPLAY TIME: " + displayTime);

		// not forget static methods  >>  private variable, cant see her in MicroWave Class
		System.out.println(MicroWave.numberOfMicroWaves);

		// class methods are invoked with the class name
		MicroWave.getNumberOfMicroWaves();

		// i want to know if my blue MicroWave are on

		// i want to know which microWave have the highest time setup
	}

}
