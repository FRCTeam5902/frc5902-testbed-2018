package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class chooser extends CommandGroup {
	
	public chooser(String choose) {
		if (choose == "l") {
			Robot.position = 1;
		}
		else if (choose == "c") {
			Robot.position = 2;
		}
		else if (choose == "r") {
			Robot.position = 3;
		}
	}

	
}