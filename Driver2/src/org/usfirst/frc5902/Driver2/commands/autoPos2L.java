package org.usfirst.frc5902.Driver2.commands;



import edu.wpi.first.wpilibj.command.CommandGroup;



public class autoPos2L extends CommandGroup {

//	public static autoPos2L instance;
//	
//	protected static String gameData;
//	public static autoPos2L getInstance() {
//		new Exception().printStackTrace();
//		if (instance == null) {
//			instance = new autoPos2L();
//		}
//		return instance;
//	}
    public autoPos2L() {
    	addSequential(new waitASecond());
    	addSequential(new DriveStraight(6));
		addSequential(new waitASecond());
		addSequential(new Reset());
		addSequential(new waitASecond());
    	addSequential(new Rotation(-90));
		addSequential(new waitASecond());
		addSequential(new Reset());
		addSequential(new waitASecond());
    	addSequential(new DriveStraight(15));
		addSequential(new waitASecond());
		addSequential(new Reset());
		addSequential(new waitASecond());
    	addSequential(new Rotation(90));
		addSequential(new waitASecond());
		addSequential(new Reset());
		addSequential(new waitASecond());
    	addSequential(new DriveStraight(13));
		addSequential(new waitASecond());
		addSequential(new Reset());
		addSequential(new waitASecond());
    	addSequential(new Rotation(90));
		addSequential(new waitASecond());
		addSequential(new Reset());
		addSequential(new waitASecond());
    	addSequential(new DriveStraight(7));
		addSequential(new waitASecond());
		addSequential(new Reset());
		addSequential(new waitASecond());
    	addSequential(new Rotation(90));
		addSequential(new waitASecond());
		addSequential(new Reset());
		addSequential(new waitASecond());
    	addSequential(new DriveStraight(3));
		addSequential(new waitASecond());
		addSequential(new Reset());
		addSequential(new waitASecond());
    	//addSequential(new CalculateStats());
		//
		addSequential(new waitASecond());
		addSequential(new DriveStraightBackwards(1));
		addSequential(new waitASecond());
		addSequential(new DriveStraight(1));
		addSequential(new waitASecond());
		addSequential(new IntakeAuto(1, true, false, 10));
		addSequential(new waitASecond());
		addSequential(new elevatorAuto(true, false, 10));
    }
    


}