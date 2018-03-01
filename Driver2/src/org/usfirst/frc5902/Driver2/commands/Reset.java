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

public class Reset extends Command {
	
	public double distance;
    public Reset() {
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }
    //String gameData = ds.getGameSpecificMessage();


    // Called just before this Command runs the first time

    protected void initialize() {
    	System.out.println("Reset!");
    	Robot.driveTrain.gyro.reset();
    	Robot.driveTrain.leftDriveLead.setSelectedSensorPosition(0, 0, 0);
    	Robot.driveTrain.rightDriveLead.setSelectedSensorPosition(0, 0, 0);
    }

    protected void execute() {
    	
    }



    // Make this return true when this Command no longer needs to run execute()

    protected boolean isFinished() {
    	//return false;
    	
    	return true;

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