import java.util.Scanner;
import java.util.Formatter;


public class Kreator{
    //OPIS
    //definiuje imie i klase hpGracza
    // umieszcza infornacje w klasie Ja()
    Scanner skan = new Scanner(System.in);
    Wojownik w = new Wojownik();
    Ja j = new Ja();
        public String podajImie(){

            System.out.println("podaj imie: ");
            String x = skan.nextLine();
            return x;
        }
        public String wybierzKlase(){
            Ja j = new Ja();
            String r = "dupa";
            System.out.println("podaj klase (W)ojownik - (C)zarodziej : ");
            char x = skan.next().charAt(0);
    		switch(Character.toLowerCase(x)){
    			case 'w':
                r ="Wojownik";
                break;
                case 'c':
                r = "Czarodziej";
                break;
            }
            //skan.close();
            return r;
        }

    }//Kreator
