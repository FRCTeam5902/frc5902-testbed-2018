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
public class elevatorDrive extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
	public double speed;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public elevatorDrive(double speed) {
    	this.speed = speed;
    	requires(Robot.elevator);
    }
    
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // Called just before this Command runs the first time
    @Override
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    protected void execute() {
    	//Working Code Below
    	//A is default if Both buttons are pressed, RB is throttle 
    	System.out.println("Running Elevator Manual" + Robot.oi.getlogitechJoy2().getY());
    	
    	if (Robot.oi.getlogitechJoy2().getY() < 0) {	    	
    		System.out.println(1);
    		Robot.elevator.DownDrive(this.speed);
    	}
    	else if (Robot.oi.getlogitechJoy2().getY() > 0) {	    	
    		System.out.println(2);
    		Robot.elevator.UpDrive(this.speed);
    	}
    	else {	    	
    		System.out.println(3);
    	    Robot.elevator.Stop();

    	}
    }
    

    // Make this return true when this Command no longer needs to run execute()
    @Override
    protected boolean isFinished() {
        if (Robot.elevator.limSwitch.get()) {
        	return true;
        }
    	return false;
    }

    // Called once after isFinished returns true
    @Override
    protected void end() {
    	Robot.elevator.Stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    @Override
    protected void interrupted() {
    	end();
    }
}
