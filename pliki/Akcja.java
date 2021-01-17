import java.util.Scanner;
import java.util.Formatter;
//import java.util.ArrayList;
//import java.util.List;

public class Akcja{//prototyp klasy Pojedynek
    //..w obecnej formie zastepuje Akcja()
    //wybór działania
    //Walka
    //ucieczka

    ScanCharZwrocChar skan = new ScanCharZwrocChar();//klasa skaner, jedna funcja skanujaca, zwraca wybrany char
    Ja ja = new Ja();
    Lobuz on = new Lobuz();
    Noz noz = new Noz();
    CzyKoniec r = new CzyKoniec();//to moge urzyc lokalnie patrz nizej

    //int mojehp = ja.hp;//tylko raz w CoRobic na init
    //int punkt = ja.iter;//tylko raz w CoRobic, bo kolejnym razem idzie przez petle, bo te wartosci sie zmieniaja
    int mojDmg = noz.Cios(ja.st);
    int jegohp = on.hp;
    int jegoDmg = noz.Cios(on.st);
    int hil = 10;
    String bron = noz.nazwa;
    int mojaSt = ja.st;
    int jegoSt = on.st;

    public void CoRobic(int h,int p){
        System.out.println("---- POTYCZKA -----");
        System.out.printf("%nCo robic?:%nwalcz (w)%nuciekaj (u)%nwyjdz z gry(dowolny znak)%n");
        char x = skan.SkanInput();
        switch(x){
			case 'w':
            //System.out.println("twoja tura:");
            Fight(h,p);
			break;
			case 'u':
            //System.out.println("run away!");
            Run(h,p);
            //r.Kkk(punkt);
			break;
            default:
            System.out.println("do widzenia");
            r.KoniecGry(p);
        }//Swich

    }//CoRobic

    public void Fight(int mojehp2,int punkt2){//jeszcze jeden parametr do walki determinujacy z kim i ilu ich w przyszłości
        while(mojehp2 > 0 && jegohp > 0){
            //MojaTura();
            //System.out.printf("----------%ntwoja postac%nzycie[%d]%n",mojehp2);
            //tu wybierasz bron z ekwipunku broni
            System.out.println("\n####   TWOJA TURA   ####");
            System.out.printf("%nwybierz dzilanie:%n");
            System.out.println("cios przy pomocy "+bron+"(c)\nleczenie +"+hil+"hp (l)\n");
            char x = skan.SkanInput();
            switch(x){//bug. -nie ma kontroli bledu inputu
    			case 'c':
                System.out.println("------atak------");
                System.out.printf("liczba ciosow[%d]%nbronia["+bron+"]%n",mojaSt);
                System.out.printf("cios za[%d]%n",mojDmg);
                jegohp = jegohp - mojDmg;//walidacja(wygrana lub tura przeciwnika)
                //Fight(mojehp2, punkt2);
    			break;
    			case 'l':
                System.out.println("------leczysz sie-----");
                mojehp2 = mojehp2+ hil;//cios przeciwnika
                System.out.printf("leczysz sie za[%d]%n",hil);
                System.out.printf("twoje zycie to[%d]%n",mojehp2);
    			break;
                default:
                System.out.println("\n!!!!  potkniecie  !!!");
    			jegohp =jegohp+ hil;//tura gracza
                System.out.println("przeciwnik leczy sie za "+hil+"hp\n");

            }//Swich
            if( jegohp <= 0){ // czy go zabilem?
                //to tez mogła by byc metoda
                System.out.println("\n\n----victory----");
                System.out.println("dostajesz 1 punkt\n");
                punkt2++;
                System.out.println("cos? "+punkt2+" "+mojehp2);
                //CoRobic(mojehp2, puu);

                r.Rrr(mojehp2,punkt2,true);// odesłanie do high score- nie ma jeszcze
                break;
            }

                System.out.println("\n#### TURA PRZECIWNIKA ####");
                mojehp2 =mojehp2- jegoDmg;
                System.out.println("------atak------");
                System.out.printf("liczba ciosow[%d]%nbronia["+bron+"]%n",jegoSt);
                System.out.printf("cios za[%d]%n",jegoDmg);
                //System.out.printf("ON:stamina[%d]%nbron["+bron+"]%n",jegoSt);
                //System.out.printf("%nzycie[%d]%n",mojehp2);
                //System.out.println("pierdolniecie za "+jegoDmg);


                if(mojehp2 <= 0){// czy mnie zabil?
                    System.out.println("\n\n\n-----loose-----");
                    r.Rrr(mojehp2,punkt2,false);// odesłanie do high score- nie ma jeszcze
                    r.KoniecGry(punkt2);
                    break;
                }


        }
    }
    public void Run(int h,int p){
		System.out.println("------ usiekasz -------");
		if(p>0){
			p -= 1;
			System.out.println("tracisz 1 punkt\npozostalo ["+p+"]");
			CoRobic(h,p);
		}else{
		System.out.println("nie masz wiecej punktow :( ");
		//KoniecGry(p);
		r.KoniecGry(p);
        }
	}


}//Akcja
