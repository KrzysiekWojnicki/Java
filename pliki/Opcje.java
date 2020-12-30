
import java.util.Scanner;

public class Opcje {


	Menu m = new Menu();

	public void jezyk() {
	boolean t = false;
	char d;

	do{

		String l = "pl";
		System.out.println("LANG:" + l);
		System.out.println("zmiana(z)\npowrot(b)");
		Scanner s = new Scanner(System.in);
		d = s.next().charAt(0);
		switch(d){
			case 'z':
			t = true;
			break;
			case 'b':
			t = true;
			break;
		}

	} while (!t == true);
		switch(d){
			case 'z':
			System.out.println("zzzzz");
			break;
			case 'b':
			m.pokazMenu();
			break;
	

			}
		}

}
