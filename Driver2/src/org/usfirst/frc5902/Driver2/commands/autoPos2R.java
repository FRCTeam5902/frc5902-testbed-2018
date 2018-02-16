package org.usfirst.frc5902.Driver2.commands;



import org.usfirst.frc5902.Driver2.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;



public class autoPos2R extends ConditionalCommandGroup {

    public autoPos2R() {
    	addSequential(new waitASecond());
        addSequential(new DriveStraight(12));
    	addSequential(new waitASecond());
        addSequential(new Rotation(90));
    }
    
    public boolean condition() {
    	return autoBaseline.gameData.equals("LR");
    }


}