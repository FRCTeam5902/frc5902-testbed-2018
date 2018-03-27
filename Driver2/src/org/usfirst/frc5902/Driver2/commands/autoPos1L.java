package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoPos1L extends CommandGroup {
	public autoPos1L() {
		System.out.println("1L");
		addSequential(new DriveStraight(10));
		addSequential(new Rotation(80));
		addSequential(new DriveStraight(10));
	}
}