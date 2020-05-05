package command.designpattern.test;

public class MainCommand {

	public static void main(String[] args) {
		Light light =new Light();
		
		Command turnOnCommand=new SwitchOnCommand(light);
		Command turnOffCommand=new SwitchOffCommand(light);
		
		Switch sw=new Switch();
		sw.register("turnOnCommand", turnOnCommand);
		sw.register("turnOffCommand", turnOffCommand);
		
		sw.execute("turnOnCommand");
		sw.execute("turnOffCommand");
	}
}
