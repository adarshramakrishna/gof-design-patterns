/**
 * 
 */
package structural.decorator;

/**
 * @author rkaranth
 *
 */
public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);
	}

	@Override
	public void moveForward() {
		car.moveForward();
	}

	@Override
	public void moveBackwards() {
		car.moveBackwards();
	}

	@Override
	public void stop() {
		car.stop();
	}
	
	public void doSuperThrottle() {
		System.out.println("Doing a sports car super throttle ... ");
	}
}
