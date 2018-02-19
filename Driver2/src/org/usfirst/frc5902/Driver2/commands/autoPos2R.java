package org.usfirst.frc5902.Driver2.commands;



import edu.wpi.first.wpilibj.command.CommandGroup;



public class autoPos2R extends CommandGroup {
	public static autoPos2R instance;
	
	protected static String gameData;
	public static autoPos2R getInstance() {
		new Exception().printStackTrace();
		if (instance == null) {
			instance = new autoPos2R();
		}
		return instance;
	}
    public autoPos2R() {
    	addSequential(new waitASecond());
    	addSequential(new DriveStraight(12*6));
    	addSequential(new waitASecond());
    	addSequential(new Rotation(90));
    	addSequential(new waitASecond());
    	addSequential(new DriveStraight(12*11));
    	addSequential(new waitASecond());
    	addSequential(new Rotation(-90));
    	addSequential(new waitASecond());
    	addSequential(new DriveStraight(12*13));
    	addSequential(new waitASecond());
    	addSequential(new Rotation(-90));
    	addSequential(new waitASecond());
    	addSequential(new DriveStraight(12*7));
    	addSequential(new waitASecond());
    	addSequential(new Rotation(-90));
    	addSequential(new waitASecond());
    	addSequential(new DriveStraight(12*3));
		//
		addSequential(new waitASecond());
		addSequential(new DriveStraightBackwards(12*1));
		addSequential(new waitASecond());
		addSequential(new DriveStraight(12*1));
		addSequential(new waitASecond());
		addSequential(new IntakeAuto(1, true, false, 10));
		addSequential(new waitASecond());
		addSequential(new elevatorAuto(true, false, 10));
    }
    


}