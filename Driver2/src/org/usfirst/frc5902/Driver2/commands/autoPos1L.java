package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoPos1L extends CommandGroup {
	public autoPos1L() {
		System.out.println("1L");
		addSequential(new Reset());
		System.out.println("reset 1");
		addSequential(new DriveStraight(10));
		System.out.println("ds 1");
		addSequential(new Reset());
		System.out.println("reset 2");
		addSequential(new Rotation(80));
		System.out.println("ro 2");
		addSequential(new Reset());
		System.out.println("reset 3");
		addSequential(new DriveStraight(10));
		System.out.println("ds 2");
		addSequential(new Reset());
		System.out.println("reset 4");
	}
}