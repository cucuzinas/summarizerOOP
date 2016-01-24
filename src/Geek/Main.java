package Geek;

public class Main {

	public static void main(String[] args) {

		// Create a codeCadet instance
		CodeCadet paulo = new CodeCadet(); // we just create an instance of CodeCadet, instance paulo

		// assign values to the instance variables, in this case we use instance "paulo"
		paulo.age = 45;
		paulo.heigth = 1.75;
		paulo.gitMaster = false;

		System.out.println(paulo.age);
		System.out.println(paulo.heigth);
		System.out.println(paulo.gitMaster);

		// assign values to the instance variables
		CodeCadet.numberOfCadets = 16;


		/*// create new instance geek called "rui" attribute values to instance properties
		Geek rui = new Geek();
		rui.geekSuperPower = "vi & master of a bunch of other things";
		rui.geekAvatar = "rui_avatar.png";
		rui.geekStatus = true;

		// create new geek campelo and instance properties
		Geek nuno = new Geek();
		nuno.geekSuperPower = "YA! & maze labyrinth's ";
		nuno.geekAvatar = "nuno_avatar.png";
		nuno.geekStatus = true;

		// create new geek antoninho and instance properties
		Geek antoninho = new Geek();
		antoninho.geekSuperPower = "ball's & a bunch of other things";
		antoninho.geekAvatar = "antoninho_avatar.png";
		antoninho.geekStatus = true;

		// create new geek catarina and instance properties
		Geek catarina = new Geek();
		catarina.geekSuperPower = "May the force be with you";
		catarina.geekAvatar = "catarina_avatar.png";
		catarina.geekStatus = true;

		// calling a method of instance rui
		String output = rui.makeCode("While");
		System.out.println(output);

		rui.makeGit("Commit");
		//System.out.println("I'm in the mood: " + pedro.mood);

		/* System.out.println(pedro.need);

		System.out.println(myNeeds.class);

		System.out.println("Name: "+ tiago.toString());
		System.out.println(tiago);
		System.out.println(joana.need);
		tiago.makeCode();
		System.out.println(Cadet.numberOfCalculators);

		System.out.println(tiago.numberOfCalculators);
		// não utilizar este método para aceder a variável class através da instância
		*/



	}

}
