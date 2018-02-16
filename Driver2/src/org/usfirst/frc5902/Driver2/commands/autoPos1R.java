package org.usfirst.frc5902.Driver2.commands;



import edu.wpi.first.wpilibj.command.CommandGroup;


public class autoPos1R extends ConditionalCommandGroup {

    public autoPos1R() {
    	addSequential(new waitASecond());
        addSequential(new DriveStraight(12));
    	addSequential(new waitASecond());
        addSequential(new Rotation(90));
    }
    
    public boolean condition() {
    	return autoBaseline.gameData.equals("LR");
    }


}