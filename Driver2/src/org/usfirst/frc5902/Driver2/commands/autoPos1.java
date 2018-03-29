package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoPos1 extends CommandGroup {
	public autoPos1() {
		addSequential(new Reset());
		addSequential(new DriveStraight(10));
		addSequential(new Reset());
		addSequential(new Rotation(65));
	}
}