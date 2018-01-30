package org.usfirst.frc5902.Driver2.commands;
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
	
	public double distance, speedLeft, speedRight;
    public DriveStraight(double d, double s, double s2) {
    	distance = d;
    	speedLeft = s;
    	speedRight = s2;
        // Use requires() here to declare subsystem dependencies

        // eg. requires(chassis);

    	requires(Robot.driveTrain);
    	requires(Robot.lights);
    }



    // Called just before this Command runs the first time

    protected void initialize() {
    	Robot.lights.Gray();
    	/*

		 * new frame every 1ms, since this is a test project use up as much

		 * bandwidth as possible for the purpose of this test.

		 */

//		Robot.driveTrain.leftDriveLead.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1, 10);
	//	Robot.driveTrain.leftDriveLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		//Robot.driveTrain.rightDriveLead.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1, 10);
		//Robot.driveTrain.rightDriveLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
		
    	
		
    	//Gyro Code UNTESTED Feb 20 Harrison G

    	/**   	
    	double feet = 7.93;

    	double dblFactor = 1;

    	double dblCommonSpeed = 0.5;

    	double dblLeftSpeed;

    	double dblRightSpeed;

    	double dblAngle;



        double distance = (-feet * 12)/pulseToInches;

        while (Robot.leftDriveEncoder.pulseWidthPos >= distance) {

           	dblAngle = Robot.gyro.gyro.getAngle();

        	dblLeftSpeed = dblCommonSpeed + (dblAngle*dblFactor);

        	dblRightSpeed = dblCommonSpeed - (dblAngle*dblFactor);

        	Robot.driveTrain.arcadeDrive(dblLeftSpeed, dblRightSpeed, dblCommonSpeed);

        }

        end(); */
    }



    // Called repeatedly when this Command is scheduled to run

    protected void execute() {
    	//Network Table Stuff
//		Robot.driveTrain.leftDriveLead.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1, 10);
//		Robot.driveTrain.leftDriveLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
//		Robot.driveTrain.rightDriveLead.setStatusFramePeriod(StatusFrameEnhanced.Status_2_Feedback0, 1, 10);
//		Robot.driveTrain.rightDriveLead.configSelectedFeedbackSensor(FeedbackDevice.CTRE_MagEncoder_Relative, 0, 10);
    	//Can plot later to monitor robot magnetic encoder functionality
    	//Favors LPos too little, increase speed by percent difference
    	//Favors RPos too little, increase speed by percent difference
    	//Same will set to 50%, 50%
    	double LPos = Robot.driveTrain.leftDriveLead.getSelectedSensorPosition(0);
    	double RPos = Robot.driveTrain.rightDriveLead.getSelectedSensorPosition(0);
    	double c = 1;
    	double PercentFavoredL = LPos/RPos;
    	double PercentFavoredR = RPos/LPos;
    	if (PercentFavoredL < 0) {Robot.driveTrain.autoDrive(.5+.5*PercentFavoredL*c, .5-.5*PercentFavoredL*c);}
    	if (PercentFavoredL < 0) {Robot.driveTrain.autoDrive(.5-.5*PercentFavoredR*c, .5+.5*PercentFavoredR*c);}
    	else {Robot.driveTrain.autoDrive(.5, .5);}
    }



    // Make this return true when this Command no longer needs to run execute()

    protected boolean isFinished() {

    	if (Robot.driveTrain.leftDriveLead.getSelectedSensorPosition(0) <= distance &&
    			Robot.driveTrain.rightDriveLead.getSelectedSensorPosition(0) <= distance) {

    		return true;

    	} else {

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