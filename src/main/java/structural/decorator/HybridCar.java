/**
 * 
 */
package structural.decorator;

/**
 * @author rkaranth
 *
 */
public class HybridCar extends CarDecorator {

	public HybridCar(Car car) {
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
	
	public void useBattery() {
		System.out.println("Hybrid car using battery ... ");
	}
	
	public void useFuel() {
		System.out.println("Hybrid car using fuel ... ");
	}
}
