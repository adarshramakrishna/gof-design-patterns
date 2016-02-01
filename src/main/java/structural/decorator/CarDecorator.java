/**
 * 
 */
package structural.decorator;

/**
 * Decorator class implements the component interface and it 
 * has a HAS-A relationship with the component interface. 
 * The component variable should be accessible to the child 
 * decorator classes, so we will make this variable protected. 
 * 
 * @author rkaranth
 */
public abstract class CarDecorator implements Car {
	
	protected Car car;
	
	public CarDecorator(Car car) {
		this.car = car;
	}
	
	public void moveForward() {
		car.moveForward();
	}
	
	public void moveBackwards() {
		car.moveBackwards();
	}
	
	public void stop() {
		car.stop();
	}
}
