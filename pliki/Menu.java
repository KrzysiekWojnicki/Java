import java.util.Scanner;

public class Menu {

	public void pokazMenu() {

	Opcje o = new Opcje();

	Scanner skan = new Scanner(System.in);
	char d;
	boolean t = false;
	
	do{
		System.out.print("\033[H\033[2J");
		System.out.println("----Witaj w grze! ---");
		System.out.println("start(p)\noptions(o)\nquit(q)");
		d = skan.next().charAt(0);
		switch(d){
			case 'p':
			t = true;
			break;
			case 'o':
			t = true;
			break;
			case 'q':
			t = true;
			break;
		}
	

	} while (!t == true );
	switch(d){
		case 'p':
		//klasa gra
		System.out.print("\033[H\033[2J");
		System.out.println("walka");
		break;
		case 'o':
		//klasa opcje
		System.out.print("\033[H\033[2J");
		System.out.println("opcje");
		o.jezyk();
		break;
		case 'q':
		System.out.print("\033[H\033[2J");
		System.out.println("quit");
		break;
		}
		
	
	}

}
