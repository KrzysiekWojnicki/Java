
public class teraz{
	public static void main(String[] args) {
		UserClass user = new UserClass();
		user.firstName = "Jan";
		user.lastName = "łokieć";
		System.out.println(user.getFullName());
		System.out.print("dupa");
		Nowa zm = new Nowa();
		System.out.println(zm.lan);
		}
	}
	class Nowa{
		String lan ="\ngunwo \n jest pyszne";
	}
// tą klase można umieścić z odzielnym pliku?
/*public class UserClass {

	public String firstName;
	public String lastName;

	public String getFullName() {
		return firstName + " " + lastName;
		// zwraca stringa z spacją pomiędzy
		}
	}
*/
