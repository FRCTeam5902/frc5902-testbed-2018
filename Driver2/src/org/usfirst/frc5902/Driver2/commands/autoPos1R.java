package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoPos1R extends CommandGroup {
	public autoPos1R() {
		System.out.println("1R");
		addSequential(new Reset());
		addSequential(new DriveStraight(-10));
		addSequential(new Reset());
		addSequential(new Rotation(80));
		addSequential(new Reset());
		addSequential(new DriveStraight(-10));
		addSequential(new Reset());
	}
}