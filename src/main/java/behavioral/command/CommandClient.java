/**
 * 
 */
package behavioral.command;

/**
 * <p>4 Terms are associated with Command pattern <em>Command,
 * <em>Receiver, <em> Invoker and <em>Client
 * 
 * <p>A command object knows about the receiver and invokes a method 
 * of the receiver. Values for the parameters of the receiver method
 * are stored in command. The receiver then does the work. An invoker
 * object knows how to execute a command and optionally does book 
 * keeping about the execution. The invoker knows only about the 
 * command interface, thus implementing loose coupling between 
 * receiver and invoker<br>
 * 
 * <b>Definition from GoF</b> 
 * 		Encapsulate a request as an object, thereby letting you 
 * parameterize clients with different requests, queue or log requests, 
 * and support undoable operations
 * 
 * Command pattern uses
 * <li>A history of request is needed
 * <li>Requests need to be handled at variant times or in variant orders
 * <li>The invoker should be decoupled from the object handling invocation
 * 
 * JDK Example - Runnable interface uses Command pattern
 * 
 * @author rkaranth
 */
public class CommandClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Light light = new Light();
		Fan fan = new Fan();
		
		//Concrete commands to turn on and off light
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffComand lightOffComand = new LightOffComand(light);
		
		//Concrete commands to start and stop fan
		FanOnCommand fanOnCommand = new FanOnCommand(fan);
		FanOffCommand fanOffCommand = new FanOffCommand(fan);
		
		//Invoker created with knowledge of Commands
		Switch s1 = new Switch(lightOnCommand, lightOffComand);
		Switch s2 = new Switch(fanOnCommand, fanOffCommand);
		
		s1.flipUp();
		s1.flipDown();
		
		s2.flipUp();
		s2.flipDown();
	}

}
