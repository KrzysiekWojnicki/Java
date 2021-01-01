import java.util.Scanner;


public class  CzyKoniec{

	public void Rrr(int i, int hp,int bonus,int st, boolean co){
		Scanner skan = new Scanner(System.in);
		char c;
		if(co == true){
			System.out.printf("SCORE: %d %n",i);
			System.out.printf("--------%ndalej ?%n kotynuacja - y%n koniec - n%n");
			c = skan.next().charAt(0);
			switch(c){
				case 'y':
				Akcja d = new Akcja();
				d.Walka(hp,bonus,st,i);
				break;
				case 'n':
				Kkk(i);
				break;
				default :
				Kkk(i);

			}
			skan.close();
		}else{
			Kkk(i);
		}
	}//Rrr
	public void Kkk(int ileWalk){
			System.out.println("koniec gry");
			System.out.println("twoj wynik to: "+ ileWalk);

	}//Kkk


}//test
