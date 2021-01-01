import java.util.Scanner;
import java.util.Formatter;

public class Gra {

	public static void main(String args[]) {


	Menu m = new Menu();
	//m.pokazMenu();
	//Bron b = new Bron();
	//System.out.println(b.Miecz(2,10));
	//Bron.miecz(3);
	//int d = Bron.miecz();
	//Kreator p = new Kreator();
	//p.Postac();
	//Kreator.Postac();
	//Test11 t = new Test11();
	//Test8.Hhh("health")t.Nnn(2,0);
	//System.out.println(Test11.Nnn(1, 0));
	//Kreator.Wojownik("marian");
	//t.Kto();

	Kreator k =new Kreator();
 	Ja j = new Ja();
	 j.setName(k.podajImie());
	 String x = k.wybierzKlase();
	 j.setKlas(x);
	 j.stworzKlase(x);
	 j.pokazAtrybuty();

	 Akcja a = new Akcja();
	a.Walka(j.hp,j.bonus,j.st, 0);//hp,bonus,stamina na poczatek/start i iteraca walki


	//System.out.printf("jeden %d %ni dwa %d",a,f);
	//t.Dwa();
	//String x = Test5.Mmm();
	//int d = Test5.Yyy();
	//int u = Test6.Ob(2);
	//System.out.println(u);
	//Test6 t = new Test6();
	//t.jeden(4444);

	//t.Pentala();



	}
}
