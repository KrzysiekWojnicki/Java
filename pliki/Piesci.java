import java.util.Random;

 public class Piesci{
        int maxDmg = 5;
        int minDmg = 1;
        //w przyszłosci : stan i jakość
        // jakość to tempo degradacji stanu
        // stan to zmienna wpływajaca na dmg,
        // czyli im nizszy stan tym mniejsze maxDmg*
    public int Cios(int i){//ile ciosow
            // bonus tutaj to zbytek bo nie jest parametrem broni
            //..a atrybutu postaci, jej umiejestosci
        Random rand = new Random();
        int x = rand.nextInt(maxDmg)+minDmg;//losuej siłe uderzenia miecza
        int dm = x * i;// dmg = cios + ile razy
        return dm;

    }
}//dzikie pieści węża
