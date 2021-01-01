import java.util.Scanner;
import java.util.Formatter;


public class Akcja{

    public void Walka(int hp,int bonus, int st, int iteracja){
        if(hp == 100 ){//tu hest BUG, bo pierwasz walka powinna zaczynać się od parametru
            // ..wybranego prze gracza, np; klasy postaci i odpowiadajcego mu hp
            // Oraz bład? z iteracą
            int hpGracza = NPC.Postac1("health");
        }
        int hpGracza = hp;
        //int hpGracza = NPC.Postac1("health");
        //int hpPrzeciwnika = NPC.Postac1("health");
        Lobuz l = new Lobuz();
        int hpPrzeciwnika = l.hp; //tutaj moze byc jakis mechanizm losujacy
        Bron b = new Bron();
        CzyKoniec r = new CzyKoniec();
        int punkt;//sprawdza ktora to iteracja walki
        if(iteracja == 0){
             punkt = 0;

        }else{
            punkt = iteracja;
        }

        System.out.println("\n WALKA !!!!!\n");

        while(hpGracza > 0 && hpPrzeciwnika > 0){
            
            int ciosGracza = b.Miecz(st, bonus);//ile ciosow(st) i jaki (bonus)
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

            int ciosPrzeciwnika = b.Miecz(l.st, l.bonus);//1 ciosy, 0 bonus dmg
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
