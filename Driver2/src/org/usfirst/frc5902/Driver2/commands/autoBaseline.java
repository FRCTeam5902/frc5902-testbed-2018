package org.usfirst.frc5902.Driver2.commands;



import edu.wpi.first.wpilibj.command.CommandGroup;



public class autoBaseline extends CommandGroup {


	public static autoBaseline instance;
	
	protected static String gameData;
	public static autoBaseline getInstance(int mode) {
		new Exception().printStackTrace();
		if (instance == null) {
			instance = new autoBaseline(mode);
		}
		return instance;
	}



//	public int mode; // will be 1, 2 or 3 when initialized

    public autoBaseline(int mode) {
    	//Comment out later
    	if ((mode <1 ) || (mode > 3)) {
    		throw new RuntimeException("Invalid mode");
    	}
    	//
    	addSequential(new GetGameData());
    	addSequential(new GameDataCommand("1R", mode, new autoPos1R()));
    	addSequential(new GameDataCommand("1L", mode, new autoPos1L()));

    }
    


}