import java.util.Random;

 public class Bron{

    public int Miecz(int i ,int b){//ile, i jaki bonus
        int bonus = b;
        int max = 10;
        Random rand = new Random();
        int x = rand.nextInt(max)+1;//losuej
        int dm = x * i;// dmg razy ile
        if(bonus > 0){
            dm += bonus;//jesli jest bonus to dmg+
        }
        return dm;
        //System.out.println("ile wylosowano: "+x+ "/"+max);
        //System.out.println("bonus: "+bonus+"\n ciosy: " +i +"\n DMG: "+ dm+"\n");

    }


}//Bron
