// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5902.Driver2.commands;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5902.Driver2.Robot;

/**
 *
 */
public class arcadeDrive extends Command {

    public arcadeDrive() {
    	requires(Robot.driveTrain);
    	requires(Robot.lights);
    }

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    	if (Robot.al == Alliance.Red) {
			Robot.lights.BeatRed();
		} else if (Robot.al == Alliance.Blue) {

			Robot.lights.BeatBlue();
		} else {
			Robot.lights.ScannerGray();
		}
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	//System.out.println(Robot.driveTrain.leftDriveLead.getSelectedSensorPosition(0));
   
    	// The code below checks the throttle on the joystick and then adjusts the speed and direction of the drivers joystick
    	if (Robot.oi.getlogitechJoy().getThrottle() < 0) {

    		Robot.speed = Robot.oi.getlogitechJoy().getThrottle();	    	

    		Robot.driveTrain.arcadeDrive(Robot.oi.getlogitechJoy().getY(), Robot.oi.getlogitechJoy().getZ()*.75, Robot.speed);}

    	else {

    		Robot.speed = -Robot.oi.getlogitechJoy().getThrottle();	    	

    	    Robot.driveTrain.arcadeDrive(Robot.oi.getlogitechJoy().getY(), Robot.oi.getlogitechJoy().getZ()*-.75, Robot.speed);

    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	Robot.driveTrain.driveStraight(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	end();
    }
}
