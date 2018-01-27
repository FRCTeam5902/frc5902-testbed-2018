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
    public Joystick arcadeControlller;
    public JoystickButton BA0;
    public JoystickButton BB1;
    public JoystickButton BX2;
    public JoystickButton BY3;
    public JoystickButton BLB;
    public JoystickButton BRB;
    public Joystick xbox;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        xbox = new Joystick(2);
        
        BX2 = new JoystickButton(xbox, 3);
        BX2.whileHeld(new testMotor());
        BLB = new JoystickButton(xbox, 5);
        //BLB.whileHeld(new intakeDrive());
        BRB = new JoystickButton(xbox, 6);
        
        arcadeControlller = new Joystick(1);
        
        joystickButton2 = new JoystickButton(arcadeControlller, 1);
        joystickButton2.whileHeld(new elevatorDrive(.5));
        joystickButton3 = new JoystickButton(arcadeControlller, 1);
        joystickButton3.whileHeld(new elevatorDrive(1));
        
        logitechJoy = new Joystick(0);
        
        joystickButton1 = new JoystickButton(logitechJoy, 1);
        joystickButton1.whileHeld(new arcadeDrive());


        // SmartDashboard Buttons
        SmartDashboard.putData("autoBaseline", new DriveStraight(0,0,0));
        SmartDashboard.putData("autoDoNothing", new autoDoNothing());
        SmartDashboard.putData("testMotor", new testMotor());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getlogitechJoy() {
        return logitechJoy;
    }

    public Joystick getarcadeControlller() {
        return arcadeControlller;
    }

    public Joystick getXbox() {
        return xbox;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

