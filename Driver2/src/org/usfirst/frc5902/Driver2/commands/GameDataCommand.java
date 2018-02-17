package org.usfirst.frc5902.Driver2.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.ConditionalCommand;

public class  GameDataCommand extends ConditionalCommand {
	protected String value;
	protected int mode;
	public GameDataCommand(String value, int mode, Command command) {
		super(command);
		this.value = value;
		this.mode = mode;
		
	}
//		public void _execute() {
//			if (condition()) {
//				super._execute();
//			}
//	
		public boolean condition() {
			String tmp = mode + autoBaseline.gameData;
			System.out.println("Checking if can run command : " + Command.class.getSimpleName() + " based on whether gamedata: " + autoBaseline.gameData + " and mode: " + mode + " equals " + value);
			boolean ret = tmp.equals(value);
			System.out.println("Can run command : " + Command.class.getSimpleName() + " -> " + ret);
			return ret;
		}
	
}
