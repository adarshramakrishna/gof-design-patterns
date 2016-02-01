/**
 * 
 */
package creational.builder;

import java.util.Calendar;
import java.util.Date;

/**
 * @author rkaranth
 *
 */
public class BuilderClient {

	public static void main(String[] args) {
		String firstName = "Santhosh";
		Calendar calendarDob = Calendar.getInstance();
		calendarDob.set(1987, 12, 12);
		Date dateOfBirth = calendarDob.getTime();
		String addressLine1 = "#123, AB Residence, 3rd main";
		String city = "Bangalore";
		String zipCode = "45343094";
		String state = "Karnataka";
		
		
		Person person1 = new Person.PersonBuilder(firstName, dateOfBirth, addressLine1, 
				zipCode, city, state).createPerson();
		
		Person person2 = new Person.PersonBuilder(firstName, dateOfBirth, addressLine1, 
				zipCode, city, state).setMiddleName("M").setLastName("Kalla").
				setAddressLine2("3rd stage, 6th cross, Langford town").
				setGender('M').setIsEmployed(true).setIsOwner(false).
				setSalutation("MR. ").createPerson();
		
		System.out.println("Person 1 : "+person1);
		System.out.println("Person 2 : "+person2);
	}
}
