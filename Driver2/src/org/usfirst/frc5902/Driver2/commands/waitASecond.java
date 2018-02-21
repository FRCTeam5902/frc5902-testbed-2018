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



import edu.wpi.first.wpilibj.command.Command;



/**

 *

 */



public class waitASecond extends Command {



    public waitASecond() {

        // Use requires() here to declare subsystem dependencies

        // eg. requires(chassis);

    	requires(Robot.driveTrain);

    }



    // Called just before this Command runs the first time

    protected void initialize() {

    }



    // Called repeatedly when this Command is scheduled to run

    protected void execute() {

    	Robot.driveTrain.autoDrive(0, 0);

    	setTimeout(1);

    }



    // Make this return true when this Command no longer needs to run execute()

    protected boolean isFinished() {

        return isTimedOut();

    }



    // Called once after isFinished returns true

    protected void end() {

    	Robot.driveTrain.autoDrive(0, 0);

    }



    // Called when another command which requires one or more of the same

    // subsystems is scheduled to run

    protected void interrupted() {

    	end();

    }

}