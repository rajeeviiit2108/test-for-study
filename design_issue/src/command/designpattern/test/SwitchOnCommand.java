package command.designpattern.test;

public class SwitchOnCommand implements Command{
	Light light;
	
	public SwitchOnCommand(Light light) {
		this.light=light;
	}

	@Override
	public void execute() {
		light.lightTurnOn();		
	}

}
