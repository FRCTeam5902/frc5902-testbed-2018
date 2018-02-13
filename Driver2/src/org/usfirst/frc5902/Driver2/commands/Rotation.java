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

public class Rotation extends Command {

	static double dblCommonSpeed = 0.3;

	static double dblAngle;
	
	public double angle;
    public Rotation(double a) {
    	angle = a;
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
    	//GyroCode HG
       	dblAngle = Robot.driveTrain.gyro.getAngle();
    	if (angle < 0) {
    	Robot.driveTrain.autoDrive(-dblCommonSpeed, dblCommonSpeed);
    	}
    	if (angle > 0) {
        	Robot.driveTrain.autoDrive(dblCommonSpeed, -dblCommonSpeed);
        }
    	else {
    		Robot.driveTrain.autoDrive(0, 0);
    	}
    }



    // Make this return true when this Command no longer needs to run execute()

    protected boolean isFinished() {

		if (Math.abs(dblAngle) >= Math.abs(angle)) {
			
				Robot.driveTrain.gyro.reset();
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