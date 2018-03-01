package org.usfirst.frc5902.Driver2.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc5902.Driver2.Robot;

public class Rotation extends Command {

	static double dblCommonSpeed = 0.5;

	static double dblAngle;
	
	public double angle;

	private double adjust = 10;
    public Rotation(double a) {
    	System.out.println("Working in rotation");
    	angle = a;
    	if (angle > 0) angle = angle-adjust;
    	if (angle < 0) angle = angle+adjust ;

    	requires(Robot.driveTrain);
    }


    // Called just before this Command runs the first time

    protected void initialize() {
    }

    protected void execute() {
    	//NetData
    	//Robot.gtable.putNumber("Gyro", gyro.getAngle());
    	//GyroCode HG
    	System.out.println("r in execute");
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