package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

class GetGameData extends Command {
    @Override
    protected void initialize() {
//
    	}

    @Override
    protected void execute() {
    	autoBaseline.gameData = Robot.ds.getGameSpecificMessage();
    }

	@Override
	protected boolean isFinished() {
		return true;
	}
	
}
