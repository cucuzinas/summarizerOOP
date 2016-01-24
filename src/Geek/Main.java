package Geek;

public class Main {

	public static void main(String[] args) {

		// create new instance geek called "rui" attribute values to instance properties
		Geek rui = new Geek();
		rui.geekKind = "Master Coder";
		rui.geekSuperPower = "vi & master of a bunch of other things";
		rui.geekAvatar = "rui_avatar.png";
		rui.geekStatus = true;

		// create new geek campelo and instance properties
		Geek nuno = new Geek();
		nuno.geekKind = "PadaWan Master Coder";
		nuno.geekSuperPower = "YA! & maze labyrinth's ";
		nuno.geekAvatar = "nuno_avatar.png";
		nuno.geekStatus = true;

		// create new geek antoninho and instance properties
		Geek antoninho = new Geek();
		antoninho.geekKind = "PadaWan Master Coder";
		antoninho.geekSuperPower = "ball's & a bunch of other things";
		antoninho.geekAvatar = "antoninho_avatar.png";
		antoninho.geekStatus = true;

		// create new geek catarina and instance properties
		Geek catarina = new Geek();
		catarina.geekKind = "Head of Detail";
		catarina.geekSuperPower = "Keep you quiet and give you courage";
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
