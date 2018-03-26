package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoPos1 extends CommandGroup {
	public autoPos1() {
		  Robot.position = 1;
	}
}