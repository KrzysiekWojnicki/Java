public class ProgramGłówny {

	public static void main(String[] args) {
		UserClass user = new UserClass();
		user.firstName = "Jan";
		user.lastName = "łokieć";
		System.out.println(usre.getFullName());
		}
	}
// tą klase można umieścić z odzielnym pliku?
public class UserClass {
	
	public String firstName;
	public String lastName;

	public String getFullName() {
		return firstName + " " + lastName;
		// zwraca stringa z spacją pomiędzy 
		}
	}
