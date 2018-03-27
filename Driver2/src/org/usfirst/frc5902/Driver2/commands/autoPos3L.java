package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoPos3L extends CommandGroup {
	public autoPos3L() {
		System.out.println("3L");
		addSequential(new DriveStraight(-10));
		addSequential(new Rotation(-80));
		addSequential(new DriveStraight(-10));
	}
}