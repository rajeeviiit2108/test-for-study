package command.designpattern.test;

import java.util.HashMap;
import java.util.Map;

public class Switch {

	private Map<String, Command> commandMap=new HashMap<>();
	
	public void register(String key, Command command) {
		commandMap.put(key, command);
	}
	
	public void execute(String Command) {
		Command commandName=commandMap.get(Command);
		if(commandName==null) {
			
		}
		commandName.execute();
	}
}
