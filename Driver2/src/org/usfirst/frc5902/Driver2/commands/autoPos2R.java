package org.usfirst.frc5902.Driver2.commands;



import edu.wpi.first.wpilibj.command.CommandGroup;



public class autoPos2R extends CommandGroup {
//	public static autoPos2R instance;
//	
//	protected static String gameData;
//	public static autoPos2R getInstance() {
//		new Exception().printStackTrace();
//		if (instance == null) {
//			instance = new autoPos2R();
//		}
//		return instance;
//	}
    public autoPos2R() {
    	addSequential(new Reset());
    	addSequential(new DriveStraight(6));
		 
		addSequential(new Reset());
		 
    	addSequential(new Rotation(90));
		 
		addSequential(new Reset());
		 
    	addSequential(new DriveStraight(11));
		 
		addSequential(new Reset());
		 
    	addSequential(new Rotation(-90));
		 
		addSequential(new Reset());
		 
    	addSequential(new DriveStraight(13));
		 
		addSequential(new Reset());
		 
    	addSequential(new Rotation(-90));
		 
		addSequential(new Reset());
		 
    	addSequential(new DriveStraight(7));
		 
		addSequential(new Reset());
		 
    	addSequential(new Rotation(-90));
		 
		addSequential(new Reset());
		 
    	//addSequential(new CalculateStats());
    	 
    	addSequential(new DriveStraight(3));
    	addSequential(new Reset());
		//
		 
		addSequential(new DriveStraightBackwards(1));
		 
		addSequential(new DriveStraight(1));
		 
		addSequential(new IntakeAuto(1, true, false, 10));
		 
		addSequential(new elevatorAuto(true, false, 10));
    }
    


}