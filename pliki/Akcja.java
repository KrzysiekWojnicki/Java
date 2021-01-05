import java.util.Scanner;
import java.util.Formatter;


public class Akcja{

    public void Walka(int hp,int bonus, int st, int iteracja){
        //if(hp == 100 ){//tu hest BUG, bo pierwasz walka powinna zaczynać się od parametru
            // ..wybranego prze gracza, np; klasy postaci i odpowiadajcego mu hp
            // Oraz bład? z iteracą
        //    int hpGracza = NPC.Postac1("health");
        //}
        Noz noz = new Noz();
        CzyKoniec r = new CzyKoniec();
        Lobuz l = new Lobuz(); //klasa przeciwnika. W przyszłosci losowana lub zalezna od exp.
        int hpPrzeciwnika = l.hp; //inicjacja
        int hpGracza = hp;//inicjacja
        int punkt;//sprawdza ktora to iteracja walki
        if(iteracja == 0){
             punkt = 0;

        }else{
            punkt = iteracja;
        }

        System.out.println("\n WALKA !!!!!\n");

        while(hpGracza > 0 && hpPrzeciwnika > 0){
            //tu powinien byc jakis wybór np: apteczka czy atak
            int ciosGracza = noz.Cios(st)+bonus;//dmg = cios nozem + bonus postaci
            hpPrzeciwnika = hpPrzeciwnika - ciosGracza;
            System.out.printf("twoje zdrowie = %d%n",hpGracza) ;
            System.out.printf("gracz zadaja cios za: %d DMG%nprzeciwnik ma: %d hp%n",ciosGracza,hpPrzeciwnika);
            System.out.println("--------------");
                if( hpPrzeciwnika <= 0){
                    System.out.println("----victory----");
                    punkt++;
                    r.Rrr(punkt,hpGracza,bonus,st,true);// odesłanie do high score- nie ma jeszcze
                    break;
                }//if gracza
            int ciosPrzeciwnika = noz.Cios(l.st)+l.bonus;//dmg = cios nozem + bonus postaci
            hpGracza = hpGracza - ciosPrzeciwnika;
            System.out.printf("przeciwnik zadaja cios za: %d DMG%ngracz ma: %d hp%n",ciosPrzeciwnika,hpGracza);
            System.out.println("--------------");
                if(hpGracza <= 0){
                    System.out.println("-----loose-----");
                    r.Rrr(punkt,hpGracza,bonus,st,false);// odesłanie do high score- nie ma jeszcze
                    break;
                }//if przeciwnika


        }//petla while

    }//walka

}//akcja
