import java.util.Scanner;
import java.util.Formatter;


public class Akcja{

    public void Walka(int hp, int iteracja){
        if(hp == 100 ){//tu hest BUG, bo pierwasz walka powinna zaczynać się od parametru
            // ..wybranego prze gracza, np; klasy postaci i odpowiadajcego mu hp
            // Oraz bład? z iteracą
            int hpGracza = NPC.Postac1("health");
        }
        int hpGracza = hp;
        //int hpGracza = NPC.Postac1("health");
        int hpPrzeciwnika = NPC.Postac1("health");
        Bron b = new Bron();
        Test r = new Test();
        int punkt;
        if(iteracja == 0){
             punkt = 0;

        }else{
            punkt = iteracja;
        }

        System.out.println("\n WALKA !!!!!\n");
        //int ktora = iteracja; jak punkt działa to ta linia do wywalenia
        while(hpGracza > 0 && hpPrzeciwnika > 0){

            int ciosGracza = b.Miecz(4, 10);//2 ciosy, +4 bonus dmg
            hpPrzeciwnika = hpPrzeciwnika - ciosGracza;
            System.out.printf("twoje zdrowie = %d%n",hpGracza) ;
            System.out.printf("gracz zadaja cios za: %d DMG%nprzeciwnik ma: %d hp%n",ciosGracza,hpPrzeciwnika);
            System.out.println("--------------");
                if( hpPrzeciwnika <= 0){
                    System.out.println("----victory----");
                    punkt++;
                    r.Rrr(punkt,hpGracza,true);// odesłanie do high score- nie ma jeszcze
                    break;
                }//if gracza

            int ciosPrzeciwnika = b.Miecz(7, 0);//1 ciosy, 0 bonus dmg
            hpGracza = hpGracza - ciosPrzeciwnika;
            System.out.printf("przeciwnik zadaja cios za: %d DMG%ngracz ma: %d hp%n",ciosPrzeciwnika,hpGracza);
            System.out.println("--------------");
                if(hpGracza <= 0){
                    System.out.println("-----loose-----");
                    r.Rrr(punkt,hpGracza,false);// odesłanie do high score- nie ma jeszcze
                    break;
                }//if przeciwnika


        }//petla while

    }//walka

}//akcja
