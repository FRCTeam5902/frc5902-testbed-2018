
package org.usfirst.frc5902.Driver2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoBaseline extends CommandGroup {



    public autoBaseline() {
    	//1: Distance in encoder rotations, 2: speed left, 3: speed right
    	//Drive Straight @param Distance in inches
    	//Drive Turn @param rotational degree
    	//Elevator @param height, direction*
    	//In-take on/off
        addSequential(new DriveStraight(4096));
        
    }

}