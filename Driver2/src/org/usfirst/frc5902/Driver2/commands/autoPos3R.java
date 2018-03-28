package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoPos3R extends CommandGroup {
	public autoPos3R() {
		System.out.println("3R");
		addSequential(new Reset());
		addSequential(new DriveStraight(10));
		addSequential(new Reset());
		addSequential(new Rotation(-80));
		addSequential(new Reset());
		addSequential(new DriveStraight(10));
		addSequential(new Reset());
	}
}