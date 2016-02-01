/**
 * 
 */
package creational.prototype;

/**
 * @author rkaranth
 *
 */
public class Employee implements PrototypeCapable {

	private String firstName;
	private String lastName;
	private String address;
	private int age;
	private int deptId;
	
	public Employee (String firstName, String lastName, String address, 
			int age, int deptId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		this.deptId = deptId;
	}
	
	public Employee () {
		
	}
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the deptId
	 */
	public int getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	@Override
	public PrototypeCapable clone() throws CloneNotSupportedException {
		return (Employee) super.clone();
	}
	
}
