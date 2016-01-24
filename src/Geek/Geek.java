package Geek;

public class Geek {

	// Properties of Object/Instance
	public String geekKind;
	public String geekSuperPower;
	public String geekAvatar;
	public Boolean geekStatus;

	// Properties of Class
	public static int numberOfGeeks;

	// Methods of this class
	public String makeCode(String textCode) {
		return ("Nice, let's do some code: " + textCode + ".......");
	}

	public String makeGit(String textCode) {
		System.out.println("Nice, let's do some Git stuff [" + textCode + "]:");
		System.out.println("commit");
		return("if "+textCode);
	}
	// lfjnsdjfgjklfsdgdfgfdgfdgfdgfdssfsffFFFFFDDDDD
	public static int numberOfCalculators;

	public void test (){
		System.out.println(numberOfCalculators);

	}
	public static void test2() {
		System.out.println(numberOfCalculators);
	}

}