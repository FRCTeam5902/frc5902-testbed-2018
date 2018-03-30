package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoPos2 extends CommandGroup {
	public autoPos2() {
		addSequential(new Reset());
		addSequential(new Rotation(20));
		addSequential(new Reset());
		addSequential(new DriveStraight(12));


	}
}