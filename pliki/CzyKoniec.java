import java.util.Scanner;


public class  CzyKoniec{// rezygnuje z tej klasy bo robi za mało

	public void Rrr(int hp, int i, boolean co){
		/*Scanner skan = new Scanner(System.in);
		char c;
		if(co == true){
			System.out.printf("SCORE: %d %n",i);
			System.out.printf("--------%ndalej ?%n kotynuacja - y%n koniec - n%n");
			c = skan.next().charAt(0);
			switch(c){
				case 'y':
				//Akcja d = new Akcja();//odznaczone na potrzeby testu12b
				//tb.Walka(hp,bonus,st,i);
				Akcja a = new Akcja();
				a.CoRobic(hp,i);
				break;
				case 'n':
				KoniecGry(i);
				break;
				default :
				KoniecGry(i);
			}*/
			if(co == true){
			Akcja a = new Akcja();
			a.CoRobic(hp,i);
			//skan.close();
		}else{
			KoniecGry(i);
		}
	}//Rrr
	public void KoniecGry(int ileWalk){
			System.out.println("koniec gry");
			System.out.println("twoj wynik to: "+ ileWalk);

	}//KoniecGry

}//CzyKoniec
