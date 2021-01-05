public class Apteczka{

    String name = "apteczka";
    int heal = 10; //za tyle leczy

    public int Lecz(int i){//pobiera hp gracza i zwraca wyleczone
        int x = i + heal;//bug, bo mozna wicej hp niz sie ma
        return x;
    }

}
