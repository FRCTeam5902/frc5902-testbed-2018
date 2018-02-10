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

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc5902.Driver2.commands.*;
import org.usfirst.frc5902.Driver2.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in 
 * the project.
 */
public class Robot extends TimedRobot {

    Command autonomousCommand;
    SendableChooser<Command> chooser = new SendableChooser<>();

    public static OI oi;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static sensorBase sensorBase;
    public static driveTrain driveTrain;
    public static elevator elevator;
    public static lights lights;
    public static DriverStation ds;
    public static Alliance al;
    public static double speed;
    public static double elevatorSpeed = .25;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    @Override
    public void robotInit() {
        RobotMap.init();
        sensorBase = new sensorBase();
        driveTrain = new driveTrain();
        elevator = new elevator();
        lights = new lights();
        //Camera
        UsbCamera elevatorCamera = CameraServer.getInstance().startAutomaticCapture();
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();

        chooser.addDefault("Autonomous Nothing-", new autoDoNothing());
        chooser.addDefault("Autonomous Baseline", new autoBaseline());
        chooser.addDefault("Autonomous Baseline", new elevatorAuto(20.0));
        SmartDashboard.putData("Auto mode", chooser);
        
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    @Override
    public void disabledInit(){

    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {
        autonomousCommand = chooser.getSelected();
        al = ds.getAlliance();
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleoperated starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    @Override
    public void teleopPeriodic() {
    	Scheduler.getInstance().run();

        SmartDashboard.putNumber("Throttle Reading", oi.logitechJoy.getThrottle());
        
        SmartDashboard.putNumber("Left Encoder", driveTrain.leftDriveLead.getSelectedSensorPosition(0)); 
        
        SmartDashboard.putNumber("Right Encoder", driveTrain.rightDriveLead.getSelectedSensorPosition(0)); 
        
        SmartDashboard.putNumber("Gyro angle", driveTrain.gyro.getAngle());
        
        SmartDashboard.putString("Light Color", lights.getLightcolor());
    }
}
