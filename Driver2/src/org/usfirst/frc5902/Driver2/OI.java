// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5902.Driver2;

import org.usfirst.frc5902.Driver2.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc5902.Driver2.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton joystickButton1;
    public Joystick logitechJoy;
    public JoystickButton joystickButton2;
    public JoystickButton joystickButton3;
    public JoystickButton joystickButton4;
    public JoystickButton joystickButton5;
    public JoystickButton joystickButton6;
    public JoystickButton joystickButton7;
    public JoystickButton joystickButton8;
    public JoystickButton joystickButton9;
    //public String gameData = Robot.ds.getGameSpecificMessage().substring(0, 1);
    public Joystick logitech2;
    public Joystick AC;
	private JoystickButton joystickButton1L;
	private JoystickButton joystickButton1R;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // new Reset().start();
    	// Arcade Controller Buttons
    	logitechJoy = new Joystick(0);
    	AC = new Joystick(1);
    	logitech2 = new Joystick(2);
    	
    	//
    	
        joystickButton1 = new JoystickButton(AC, 1);
        joystickButton1.whileHeld(new IntakeAdjust(.5));
        joystickButton2 = new JoystickButton(AC, 2);
        joystickButton2.whileHeld(new IntakeAdjust(-.5));
        joystickButton4 = new JoystickButton(AC, 4);
        joystickButton4.whileHeld(new IntakeWheel(.25));
        joystickButton5 = new JoystickButton(AC, 5);
        joystickButton5.whileHeld(new EjectWheel(.75));
        joystickButton7 = new JoystickButton(AC, 6);
        joystickButton7.whenPressed(new Reset());
        joystickButton8 = new JoystickButton(AC, 8);
        joystickButton8.whileHeld(new autoBaselineStraight());
        joystickButton9 = new JoystickButton(AC, 9);
        joystickButton9.whileHeld(new randomLights());
               
        joystickButton1L = new JoystickButton(logitechJoy, 1);
        joystickButton1L.whileHeld(new arcadeDrive());

    	joystickButton1R = new JoystickButton(logitech2, 1);
        joystickButton1R.whileHeld(new elevatorDriveVar());


        // SmartDashboard Buttons
//        SmartDashboard.putData("Base", new autoBaselineStraight());
//        SmartDashboard.putData("Position 1: Left", new autoPos1L());
//        SmartDashboard.putData("Position 1: Right", new autoPos1R());
//        SmartDashboard.putData("Position 2: Left", new autoPos2L());
//        SmartDashboard.putData("Position 2: Right", new autoPos2R());
//        SmartDashboard.putData("Position 3: Left", new autoPos3L());
//        SmartDashboard.putData("Position 3: Right", new autoPos3R());
    }

    public Joystick getlogitechJoy() {
        return logitechJoy;
    }

    public Joystick getlogitechJoy2() {
        return logitech2;
    }
    
    public Joystick getarcadeControlller() {
        return AC;
    }


}