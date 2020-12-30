public class NPC{

    public static int Postac1(String s){
        int co = 0;
        switch(s){
			case "health":
			co = 100;
			break;
			case "bonus":
			co = 10;
			break;
		}
	    return co;


    }

}
