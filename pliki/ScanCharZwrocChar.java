import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScanCharZwrocChar{//klasa gotowa do implementacji SKAN

    public char SkanInput(){// to bedzie klas uruchamiająca skaner i zwracajaca char

        Scanner s = new Scanner(System.in);
		char d ;
        //System.out.println("kilk");
        d = s.next().charAt(0);
        return d ;
    }



}
