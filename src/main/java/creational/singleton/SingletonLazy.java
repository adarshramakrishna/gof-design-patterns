/**
 * 
 */
package creational.singleton;

/**
 * SingletonLazy class
 * 
 * @author rkaranth
 *
 */
public class SingletonLazy {

	private static SingletonLazy instance;
	
	/** Instance cannot be created by using "new" operator */
	private SingletonLazy() {
		System.out.println("SingletonLazy instance created ... ");
	}
	
	/**
	 * A static method that performs lazy initialization using double
	 * locking mechanism.<br>
	 * This along with private constructor ensures that the only way
	 * to get an instance of {@link SingletonLazy} is using this method
	 * 
	 * @return {@link SingletonLazy}
	 */
	public static SingletonLazy getInstance() {
		//If another thread has already created an instance we can 
		//check without synchronized block
		if (null == instance) {
			
			//Synchronized block to ensure thread safety
			synchronized (SingletonLazy.class) {
				//A previous thread might have instantiated the object, 
				//hence the second check
				if (null == instance) {
					System.out.println("I am "+Thread.currentThread().getName()+", I am creating an instance of SingletonLazy");
					instance = new SingletonLazy();
				}
			}
		}
		
		return instance;
	}
}
