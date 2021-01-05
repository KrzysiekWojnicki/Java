import java.util.ArrayList;
import java.util.List;
public class Inventory{
    //lista objetów np; miecz(), apteczka()
    //oraz list z każdymjednym wystąpieniem

    //pola
    List<String> l1 = new ArrayList<>();//lista
    List<String> l2 = new ArrayList<>();//kazdy jeden item
    String o = "NUL";

    //sety
    public void AddDoListy(String s,boolean b,int i){//dodaj, pozniej polacz z ta nizej
        if(b == true){
            l1.add(s);
        }else{
            for(int x=0;x<i;x++){
                l2.add(s);
            }
        }
    }
    public void CzyJestWLiscie(String s,int i){//druga funkcja dodaj z dodatkowoa weryfikacja
        if(l1.contains(s)){
            System.out.println("jest " + s +" dodaje kolejny(e) "+i);
            AddDoListy(s,false, i);
        }else{
            System.out.println("ni ma "+s+" dodaje nowy(e) "+i);
            AddDoListy(s,true, i);
            AddDoListy(s,false, i);
        }
    }
    public void UsunZListy(String s,int i){//co i ile usunac
            int z = ilejetstego(s);
            if(l1.contains(s)){//jesli jest przynajmniej 1 to dzialaj, jak nie to..
                if(z>=i){//jesli tru to usuwaj, jesli nie to..
                    for(int x=0;x<z;x++){//usun tyle ile ci podano
                        l2.remove(s);//usun z sakfy
                        if(!l2.contains(s)){//jesli nie ma juz w sakfie to usun z listy
                            l1.remove(s);//usun ostatni z listy
                        }
                    }
                    System.out.println("usunieto "+i+" "+s);
                }
                else{//..za duzo chcesz usunac
                    System.out.println("chcesz usunąć "+i+" ale -");
                    System.out.println("masz tylko "+z);//za mało
                    }
            }
            else{
                System.out.println("nie masz "+s+" w inwentory");
                }
    }
    //gety
    public void ShowListe(){// pokazuje liste itemow oraz ich ilos
        System.out.println("");
        System.out.println("lista inwentory: ");
        for(String x :l1){
            int u = ilejetstego(x);;
            System.out.println(x+" masz "+ u);
        }
        System.out.println("");
    }
    public void IleJestCzego(){//pokazuje wszysko
        System.out.println("############");
        System.out.println("cały inwentory: " +l2);
        System.out.println("############");
    }
    public int ilejetstego(String s){//zwraca int liczby itemu w inwentory
        int x =0;
        for(String y :l2){
            if(y == s){
            x++;
            }
        }
        return x;
    }

}//test12
