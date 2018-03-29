package org.usfirst.frc5902.Driver2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoBaselineStraight extends CommandGroup {

//	public static autoBaselineStraight instance;
//	
//	protected static String gameData;
//	public static autoBaselineStraight getInstance() {
//		new Exception().printStackTrace();
//		if (instance == null) {
//			instance = new autoBaselineStraight();
//		}
//		return instance;
//	}
	public autoBaselineStraight() {
		addSequential(new Reset());
		addSequential(new DriveStraight(15));
		addSequential(new Reset());
	}

}