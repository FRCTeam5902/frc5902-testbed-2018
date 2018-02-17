package org.usfirst.frc5902.Driver2.commands;



import edu.wpi.first.wpilibj.command.CommandGroup;



public class autoPos3R extends CommandGroup {

    public autoPos3R() {
    	addSequential(new waitASecond());
        addSequential(new DriveStraight(12));
    	addSequential(new waitASecond());
        addSequential(new Rotation(90));
    }
    


}