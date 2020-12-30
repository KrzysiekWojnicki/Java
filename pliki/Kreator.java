import java.util.Scanner;

public class Kreator{

    public void Postac(){
        System.out.println("podaj imie: ");
        Scanner skan = new Scanner(System.in);
        String imie = skan.nextLine();
        skan.close();
        System.out.println("jeste "+imie);


    }//Postac

}//Kreator
