package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.command.Command;

/**
 * 
 * 
 * 
 * driveForward.java Written for NE District Granite State District Event by
 * Brennan Macaig (FRC-1721) 3/2/2017
 * 
 * Notes: This doesn't implement a gyro. A gyro is really unneccessary for this
 * purpose.
 */

public class DriveStraightBackwards extends Command {

	public final double pulsePerFeet = 2441.6;
												
	// 2344.2, 2472, 2508.5
	static double dblFactor = -.4;

	static double dblCommonSpeed = -0.60;

	static double dblLeftSpeed;

	static double dblRightSpeed;

	static double dblAngle;

	public double distance;

	public DriveStraightBackwards(double d) {
		new Exception().printStackTrace();
		distance = -d * pulsePerFeet * (10/16.7);
		System.out.println(distance);
		// Use requires() here to declare subsystem dependencies

		// eg. requires(chassis);

		requires(Robot.driveTrain);

	}

	// String gameData = ds.getGameSpecificMessage();

	// Called just before this Command runs the first time

	//
	protected void initialize() {
		
	}

	// int count = 0;
	protected void execute() {
		dblAngle = Robot.driveTrain.gyro.getAngle();

		double turnFactor = (dblAngle * dblFactor) / 180.0;

		dblLeftSpeed = dblCommonSpeed - turnFactor;

		dblRightSpeed = dblCommonSpeed + turnFactor;

		Robot.driveTrain.autoDrive(dblLeftSpeed, dblRightSpeed);

	}

	// Make this return true when this Command no longer needs to run execute()

	protected boolean isFinished() {
		
		if (Robot.driveTrain.leftDriveLead.getSelectedSensorPosition(0) >= distance && -Robot.driveTrain.rightDriveLead.getSelectedSensorPosition(0) >= distance) {
			Robot.driveTrain.autoDrive(-dblCommonSpeed, -dblCommonSpeed);
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