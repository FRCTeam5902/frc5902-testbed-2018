package org.usfirst.frc5902.Driver2.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5902.Driver2.Robot;
import org.usfirst.frc5902.Driver2.RobotMap;

import com.ctre.phoenix.motorcontrol.ControlMode;
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

	
	public double distance, speedLeft, speedRight;
    public DriveStraight(double d, double s, double s2) {
    	distance = d;
    	speedLeft = s;
    	speedRight = s2;
        // Use requires() here to declare subsystem dependencies

        // eg. requires(chassis);

    	requires(Robot.driveTrain);

    }



    // Called just before this Command runs the first time

    protected void initialize() {
    	Robot.driveTrain.leftDriveLead.setSelectedSensorPosition(0, 0, 10);
    	Robot.driveTrain.rightDriveLead.setSelectedSensorPosition(0, 0, 10);
    	Robot.driveTrain.leftDriveLead.set(speedLeft);
    	Robot.driveTrain.rightDriveLead.set(speedRight);
    }



    // Called repeatedly when this Command is scheduled to run

    protected void execute() {

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