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

public class IntakeAuto extends Command {

	static double dblCommonSpeed = 0.5;

	double adjust;
	int count, time;
	public boolean OOE, OOI;
    public IntakeAuto(double adjust, boolean OOE, boolean OOI, int time) {
    	this.adjust = adjust;
    	this.OOE = OOE;
    	this.OOI = OOI;
    	this.time = time*1000;
        // Use requires() here to declare subsystem dependencies

        // eg. requires(chassis);

    	requires(Robot.wheelA);
    	requires(Robot.wheelB);
    }
    //String gameData = ds.getGameSpecificMessage();


    // Called just before this Command runs the first time

    protected void initialize() {
    	
    }

    protected void execute() {
    	//GyroCode HG
       	if (adjust > 0) Robot.intake.AdjustIn(dblCommonSpeed);
       	if (adjust < 0) Robot.intake.AdjustOut(dblCommonSpeed);
       	else Robot.intake.StopAdjust();
       	if (OOE) { Robot.wheelA.Eject(dblCommonSpeed); Robot.wheelB.Eject(dblCommonSpeed); }
       	if (OOI) { Robot.wheelA.Intake(dblCommonSpeed); Robot.wheelB.Intake(dblCommonSpeed); }
       	else { Robot.wheelA.Stop();Robot.wheelB.Stop(); }
       	count++;
    }



    // Make this return true when this Command no longer needs to run execute()

    protected boolean isFinished() {

		if (count < time) {
			Robot.wheelA.Stop();Robot.wheelB.Stop();
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