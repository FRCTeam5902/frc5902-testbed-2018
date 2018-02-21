package org.usfirst.frc5902.Driver2.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc5902.Driver2.Robot;



import edu.wpi.first.wpilibj.command.Command;



public class CalculateStats extends Command {

    public CalculateStats() {

    }

    protected void initialize() {

//	double[] storage = new double[0];
//
//	double t = 0;
//
//	double h = 0;
//
//	double l = Integer.MAX_VALUE;
//
//	double[] gyroConclusion = Robot.gtable.getNumberArray("Gyro", storage);
//
//	for (double value : gyroConclusion) {
//
//		total += value;
//
//		if (value > h) h = value;
//
//		if (value < l) l = value;
//
//	}
//
//	Robot.total = total/gyroConclusion.length;
//
//	Robot.highest = h;
//
//	Robot.lowest = l;

    }

    protected void execute() {

    }

    protected boolean isFinished() {

    	return true;

    }

    protected void end() {

    }

    protected void interrupted() {

    	end();

    }

}