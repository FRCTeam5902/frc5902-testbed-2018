package org.usfirst.frc5902.Driver2.commands;



import edu.wpi.first.wpilibj.command.CommandGroup;



public class autoPos2L extends CommandGroup {

    public autoPos2L() {
    	addSequential(new waitASecond());
        addSequential(new DriveStraight(12));
    	addSequential(new waitASecond());
        addSequential(new Rotation(90));
    }
    


}