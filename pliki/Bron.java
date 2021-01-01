import java.util.Random;

 public class Bron{

    public int Miecz(int i ,int b){//ile, i jaki bonus
            // bonus tutaj to zbytek bo nie jest parametrem broni
            //..a atrybutu postaci, jej umiejestosci
        //int bonus = b;
        int max = 10; //miecz moze udezyc za 1-10
        Random rand = new Random();
        int x = rand.nextInt(max)+1;//losuej siłe uderzenia miecza
        int dm = x * i;// ile razy uderza mieczem
        if(b > 0){
            dm += b;//jesli jest bonus to dmg+
        }
        return dm;
        //System.out.println("ile wylosowano: "+x+ "/"+max);
        //System.out.println("bonus: "+bonus+"\n ciosy: " +i +"\n DMG: "+ dm+"\n");

    }
}//Bron
