import java.util.Formatter;

public class Ja{

    private String name = "bezimienny" ;
    String klasa="wluczega";
    int hp = 10;
    int bonus= 0 ;
    int st = 10;
    //sety
    public void setName(String n){
        name = n;
    }
    public void setKlas(String n){
        klasa = n;
    }
    public void setPar(int h, int b, int s){
        hp = h;
        bonus = b;
        st = s;
    }
    public void stworzKlase(String s){
        if(s.equals("Wojownik") ){
            System.out.println("tworze wojownika");
            Wojownik w = new Wojownik();
            setPar(w.hp, w.bonus, w.st);
        }else if(s.equals("Czarodziej")){
            System.out.println("tworze czarodzieja");
            Czarodziej c = new Czarodziej();
            setPar(c.hp, c.bonus, c.st);
        }else{
            System.out.println("tworze nic");

        }
    }
    //pokarz atrybuty
    public void pokazAtrybuty(){
        System.out.printf("jestes: "+klasa+" "+name+"%ntwoje atrybuty to:%nhp-%d%nst-%d%nbonus-%d%n ",hp,st,bonus);
    }

}//Ja
