package org.usfirst.frc5902.Driver2.commands;



import org.usfirst.frc5902.Driver2.Robot;



import edu.wpi.first.wpilibj.command.CommandGroup;



public class autoBaseline extends CommandGroup {


	public static autoBaseline instance;
	
	public static autoBaseline getInstance() {
		if (instance == null) {
			instance = new autoBaseline();
		}
		return instance;
	}




    public autoBaseline() {

    	//1: Distance in encoder rotations, 2: speed left, 3: speed right
    	//Drive Straight @param Distance in inches
    	//Drive Turn @param rotational degree
    	//Elevator @param height, direction*
    	//In-take on/off
    	//figure 8
//       	Robot.driveTrain.gyro.reset();
//    	Robot.driveTrain.gyro.calibrate();
//    	Robot.driveTrain.leftDriveLead.setSelectedSensorPosition(0, 0, 0);
//    	Robot.driveTrain.rightDriveLead.setSelectedSensorPosition(0, 0, 0);
    	addSequential(new waitASecond());
        addSequential(new DriveStraight(12));
        addSequential(new waitASecond());
        addSequential(new Rotation(90));

    }



}