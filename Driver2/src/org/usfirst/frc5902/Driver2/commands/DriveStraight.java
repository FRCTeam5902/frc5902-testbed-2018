package org.usfirst.frc5902.Driver2.commands;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5902.Driver2.Robot;
import org.usfirst.frc5902.Driver2.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.StatusFrameEnhanced;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Command;



/**

 * driveForward.java

 * Written for NE District Granite State District Event by Brennan Macaig (FRC-1721)

 * 3/2/2017

 * 

 * Notes:

 * This doesn't implement a gyro. A gyro is really unneccessary for this purpose.

 * 

 */

public class DriveStraight extends Command {

	public final double pulseToInches = (10*Math.PI)/4096.0;

	static double dblFactor = .5;

	static double dblCommonSpeed = 0.5;

	static double dblLeftSpeed;

	static double dblRightSpeed;

	static double dblAngle;
	
	public double distance;
    public DriveStraight(double d) {
    	distance = d*pulseToInches;
        // Use requires() here to declare subsystem dependencies

        // eg. requires(chassis);

    	requires(Robot.driveTrain);
    	requires(Robot.lights);
    }
    //String gameData = ds.getGameSpecificMessage();


    // Called just before this Command runs the first time

    protected void initialize() {
    	if (Robot.al.Red != null) {
    		Robot.lights.BeatBlue(); 
    	}
    	if (Robot.al.Blue != null) {
        	Robot.lights.BeatRed(); 
        }
    	else {Robot.lights.ScannerGray();}
    }

    protected void execute() {
    	//Network Table Stuff
    	//Robot.driveTrain.leftDriveLead.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1, 10);
    	//Robot.driveTrain.leftDriveLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
    	//Robot.driveTrain.rightDriveLead.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1, 10);
    	//Robot.driveTrain.rightDriveLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
    	//MAG ENC Code
    	//Can plot later to monitor robot magnetic encoder functionality
    	//Favors LPos too little, increase speed by percent difference
    	//Favors RPos too little, increase speed by percent difference
    	//Same will set to 50%, 50%
//    	double LPos = Robot.driveTrain.leftDriveLead.getSelectedSensorPosition(0);
//    	double RPos = Robot.driveTrain.rightDriveLead.getSelectedSensorPosition(0); 
//    	System.out.println("Lpos : " + LPos + " Rpos : " + RPos); 
//    	double c = 1;
//    	double PercentFavoredL = LPos/RPos;
//    	double PercentFavoredR = RPos/LPos;
//    	if (PercentFavoredL < 0) {Robot.driveTrain.autoDrive(.5+.5*PercentFavoredL*c, .5-.5*PercentFavoredL*c);
//    	//System.out.println("L");
//    	}
//    	if (PercentFavoredR < 0) {Robot.driveTrain.autoDrive(.5-.5*PercentFavoredR*c, .5+.5*PercentFavoredR*c);
//    	//System.out.println("R");
//    	}
//    	else {Robot.driveTrain.autoDrive(.5, .5);
//    	//System.out.println("YIKES");
//    	}
    	//GyroCode HG
    	System.out.println("Running in DS |" + Robot.driveTrain.leftDriveLead.getSelectedSensorPosition(0) + " | " +
    			Robot.driveTrain.rightDriveLead.getSelectedSensorPosition(0));
       	dblAngle = Robot.driveTrain.gyro.getAngle();

    	dblLeftSpeed = dblCommonSpeed + (dblAngle*dblFactor);

    	dblRightSpeed = dblCommonSpeed - (dblAngle*dblFactor);

    	Robot.driveTrain.arcadeDrive(dblLeftSpeed, dblRightSpeed, dblCommonSpeed);
    }



    // Make this return true when this Command no longer needs to run execute()

    protected boolean isFinished() {
//		return false;

		if (Robot.driveTrain.leftDriveLead.getSelectedSensorPosition(0) <= distance &&
	   			Robot.driveTrain.rightDriveLead.getSelectedSensorPosition(0) <= distance) {
	    		return true;

	    }
	    else {

	    		return false;

	    }

    }



    // Called once after isFinished returns true

    protected void end() {

    	

    }



    // Called when another command which requires one or more of the same

    // subsystems is scheduled to run

    protected void interrupted() {

    	end();

    }

}