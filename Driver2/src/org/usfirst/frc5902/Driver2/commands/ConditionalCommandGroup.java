package org.usfirst.frc5902.Driver2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public abstract class  ConditionalCommandGroup extends CommandGroup {
//		public void _execute() {
//			if (condition()) {
//				super._execute();
//			}
//		}
		public abstract boolean condition();
	
}
