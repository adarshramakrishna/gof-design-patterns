/**
 * 
 */
package creational.singleton;

/**
 * Singleton class
 * 
 * @author rkaranth
 *
 */
public class Singleton {

	private static Singleton instance;
	
	/** Instance cannot be created by using "new" operator */
	private Singleton() {
		System.out.println("Singleton instance created ... ");
	}
	
	/**
	 * A static method that performs lazy initialization using double
	 * locking mechanism.<br>
	 * This along with private constructor ensures that the only way
	 * to get an instance of {@link Singleton} is using this method
	 * 
	 * @return {@link Singleton}
	 */
	public static Singleton getInstance() {
		//If another thread has already created an instance we can 
		//check without synchronized block
		if (null == instance) {
			
			//Synchronized block to ensure thread safety
			synchronized (Singleton.class) {
				//A previous thread might have instantiated the object, 
				//hence the second check
				if (null == instance) {
					System.out.println("I am "+Thread.currentThread().getName()+", I am creating an instance of Singleton");
					instance = new Singleton();
				}
			}
		}
		
		return instance;
	}
}
