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
 */



public class DriveStraight extends Command {



	public final double pulseToInches = (10*Math.PI)/4096.0;//I'm pretty sure that this n isn't big enough, can we try this with a bigger number, or use the reciprocal?

	static double dblFactor = .15;

	static double dblCommonSpeed = 0.3;

	static double dblLeftSpeed;

	static double dblRightSpeed;

	static double dblAngle;

	public double distance;

    public DriveStraight(double d) {
    	new Exception().printStackTrace();
    	distance = d*pulseToInches;

        // Use requires() here to declare subsystem dependencies



        // eg. requires(chassis);



    	requires(Robot.driveTrain);

    	requires(Robot.lights);

    }

    //String gameData = ds.getGameSpecificMessage();





    // Called just before this Command runs the first time


//
    protected void initialize() {
    	System.out.println("Im in init");
    	if (Robot.al.Red != null) {

    		Robot.lights.BeatBlue(); 

    	}

    	if (Robot.al.Blue != null) {

        	Robot.lights.BeatRed(); 

        }

    	else {Robot.lights.ScannerGray();}
    	Robot.driveTrain.gyro.reset();
    	Robot.driveTrain.gyro.calibrate();
    	Robot.driveTrain.leftDriveLead.setSelectedSensorPosition(0, 0, 0);
    	Robot.driveTrain.rightDriveLead.setSelectedSensorPosition(0, 0, 0);
    }


    //int count = 0;
    protected void execute() {
    	System.out.println("Running in DS |" + Robot.driveTrain.leftDriveLead.getSelectedSensorPosition(0) + " | " +

    			Robot.driveTrain.rightDriveLead.getSelectedSensorPosition(0));
    	//count ++;
    	//if (count %100 == 0) {
       	dblAngle = Robot.driveTrain.gyro.getAngle();
       	
       	double turnFactor = (dblAngle*dblFactor)/180.0;

    	dblLeftSpeed = dblCommonSpeed + turnFactor;


    	dblRightSpeed = dblCommonSpeed - turnFactor;
    	//}
    	
    	System.out.println("|" + dblAngle + "|" + "|" + dblRightSpeed + "|" + "|" + dblLeftSpeed + "|" );

    	Robot.driveTrain.autoDrive(dblLeftSpeed, dblRightSpeed);

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
    	System.out.println("IsFinished DriveStraight Command");
    }






    // Called when another command which requires one or more of the same



    // subsystems is scheduled to run



    protected void interrupted() {



    	System.out.println("I was interrupted in Nintendo DS");
    	end();



    }



}