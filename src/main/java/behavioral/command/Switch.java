/**
 * 
 */
package behavioral.command;

/**
 * This class acts as the invoker
 * 
 * @author rkaranth
 */
public class Switch {

	//Registry of concrete commands that this Invoker will use
	private Command onComand;
	private Command offCommand;
	
	public Switch (Command onCommand, Command offCommand) {
		this.onComand = onCommand;
		this.offCommand = offCommand;
	}
	
	/**
	 * Calls the execute method of the concrete "OnCommand"
	 */
	public void flipUp () {
		System.out.println("Switch is flipped up ... ");
		onComand.execute();
	}
	
	/**
	 * Calls the execute method of the concrete "OffCommand"
	 */
	public void flipDown () {
		System.out.println("Switch is flipped down ... ");
		offCommand.execute();
	}
}
