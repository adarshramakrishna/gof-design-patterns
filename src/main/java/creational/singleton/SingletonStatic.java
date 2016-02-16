/**
 * 
 */
package creational.singleton;

/**
 * SingletonLazy factory implementation using static block
 * 
 * @author rkaranth
 *
 */
public class SingletonStatic {

	private static SingletonStatic instance;
	
	/** Instance created when class is loaded */
	static {
		instance = new SingletonStatic();
		System.out.println("Classloader called me ...");
	}
	
	/** Instance cannot be created by using "new" operator */
	private SingletonStatic() {
		System.out.println("SingletonStatic instance created ... ");
	}
	
	/**
	 * A static method returns the instance of {@link SingletonStatic}.<br>
	 * The Static block along with private constructor ensures that the only way
	 * to get an instance of {@link SingletonStatic} is using this method
	 * 
	 * @return {@link SingletonStatic}
	 */
	public static SingletonStatic getInstance() {
		return instance;
	}
}
