package org.usfirst.frc5902.Driver2.commands;

import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

class GetGameData extends Command {
    private static String gameData;

	@Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
    	System.out.println("in GM");
    	gameData = Robot.ds.getGameSpecificMessage().substring(0, 1);
    	System.out.println(gameData);
    }

    public String getGD() {
    	return gameData;
    }
    
	@Override
	protected boolean isFinished() {
		return true;
	}
	
}
