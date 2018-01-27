
package org.usfirst.frc5902.Driver2.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class autoBaseline extends CommandGroup {



    public autoBaseline() {
    	//1: Distance in encoder rotations, 2: speed left, 3: speed right
        addSequential(new DriveStraight(0, 0, 0));

    }

}