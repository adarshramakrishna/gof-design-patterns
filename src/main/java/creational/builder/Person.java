/**
 * 
 */
package creational.builder;

import java.util.Date;

/**
 * @author rkaranth
 *
 */
public class Person {

	private String salutation;
	private String firstName;
	private String middleName;
	private String lastName;
	private Date dateOfBirth;
	private char gender;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String zipCode;
	private boolean isEmployed;
	private boolean isOwner;
	
	
	/**
	 * Parameterized private constructor to create a person 
	 * from PersonBuilder.
	 * 
	 * @param salutation
	 * @param firstName
	 * @param middleName
	 * @param lastName
	 * @param dateOfBirth
	 * @param gender
	 * @param addressLine1
	 * @param addressLine2
	 * @param city
	 * @param state
	 * @param zipCode
	 * @param isEmployed
	 * @param isOwner
	 */
	private Person(String salutation, String firstName, String middleName,
			String lastName, Date dateOfBirth, char gender,
			String addressLine1, String addressLine2, String city,
			String state, String zipCode, boolean isEmployed, boolean isOwner) {
		super();
		this.salutation = salutation;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.isEmployed = isEmployed;
		this.isOwner = isOwner;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [salutation=").append(salutation)
				.append(", firstName=").append(firstName)
				.append(", middleName=").append(middleName)
				.append(", lastName=").append(lastName)
				.append(", dateOfBirth=").append(dateOfBirth)
				.append(", gender=").append(gender).append(", addressLine1=")
				.append(addressLine1).append(", addressLine2=")
				.append(addressLine2).append(", city=").append(city)
				.append(", state=").append(state).append(", zipCode=")
				.append(zipCode).append(", isEmployed=").append(isEmployed)
				.append(", isOwner=").append(isOwner).append("]");
		return builder.toString();
	}

	/**
	 * Static class which acts a Builder for Person class
	 * This class also has a parameterized constructor which accepts
	 * the mandatory fields for Person object
	 */
	public static class PersonBuilder {
		private String salutation;
		private String firstName;
		private String middleName;
		private String lastName;
		private Date dateOfBirth;
		private char gender;
		private String addressLine1;
		private String addressLine2;
		private String city;
		private String state;
		private String zipCode;
		private boolean isEmployed;
		private boolean isOwner;
		
		/** Parameterized constructor for Person class */
		public PersonBuilder (String firstName, Date dateOfBirth,
				String addressLine1, String zipCode, String city,
				String state) {
			this.firstName = firstName;
			this.dateOfBirth = dateOfBirth;
			this.addressLine1 = addressLine1;
			this.zipCode = zipCode;
			this.city = city;
		}
		
		public PersonBuilder setSalutation (String salutation) {
			this.salutation = salutation;
			return this;
		}
		
		public PersonBuilder setMiddleName (String middleName) {
			this.middleName = middleName;
			return this;
		}
		
		public PersonBuilder setLastName (String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public PersonBuilder setGender (char gender) {
			this.gender = gender;
			return this;
		}
		
		public PersonBuilder setAddressLine2 (String addressLine2) {
			this.addressLine2 = addressLine2;
			return this;
		}
		
		public PersonBuilder setZipCode (String zipCode) {
			this.zipCode = zipCode;
			return this;
		}
		
		public PersonBuilder setIsEmployed (boolean isEmployed) {
			this.isEmployed = isEmployed;
			return this;
		}
		
		public PersonBuilder setIsOwner (boolean isOwner) {
			this.isOwner = isOwner;
			return this;
		}
		
		/** Method to return an instance of Person object using
		 * the parameters set from Builder
		 * @return {@link Person}
		 */
		public Person createPerson () {
			Person person = new Person(salutation, firstName, middleName, 
					lastName, dateOfBirth, gender, addressLine1, addressLine2, 
					city, state, zipCode, isEmployed, isOwner);
			return person;
		}
	}
}
