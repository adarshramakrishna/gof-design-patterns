/**
 * 
 */
package structural.decorator;

/**
 * @author rkaranth
 *
 */
public class BasicCar implements Car {
	public void moveForward() {
		System.out.println("Moving ahead ... ");
	}

	public void moveBackwards() {
		System.out.println("In reverse gear, moving in opposite direction ... ");
	}

	public void stop() {
		System.out.println("Stopping the car ... ");
	}
}
