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
		System.out.println(1);
		addSequential(new waitASecond());
		System.out.println(2);
		addSequential(new waitASecond());
		System.out.println(3);
		addSequential(new DriveStraight(10));
		System.out.println(4);
		addSequential(new waitASecond());
		System.out.println(5);
		addSequential(new Reset());
		System.out.println(6);
		addSequential(new waitASecond());
	}

}