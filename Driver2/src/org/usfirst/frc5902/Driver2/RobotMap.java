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

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.DigitalOutput;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.GyroBase;
import edu.wpi.first.wpilibj.Sendable;
import edu.wpi.first.wpilibj.SendableBase;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    public static AnalogAccelerometer sensorBaseAAccelerometer;
    public static WPI_TalonSRX driveTrainleftDriveLead;
    public static WPI_TalonSRX driveTrainrightDriveLead;
    public static WPI_TalonSRX driveTrainleftDriveFollow;
    public static WPI_TalonSRX driveTrainrightDriveFollow;
    public static SpeedController elevatorUpDown;
    public static SpeedController wheelA;
    public static SpeedController wheelB;
    public static SpeedController pole;
    public static SpeedController lights;
    public static DifferentialDrive driveTrainrobotDrive;
    public static Servo cameraControlpanServo;
    public static DigitalOutput limSwitch;
    public static void init() {
        sensorBaseAAccelerometer = new AnalogAccelerometer(0);
        sensorBaseAAccelerometer.setSensitivity(0.0);
        sensorBaseAAccelerometer.setZero(2.5);
        
        //Create Left Motors
        driveTrainleftDriveLead = new WPI_TalonSRX(1);
        driveTrainleftDriveFollow = new WPI_TalonSRX(2);
        
        //Create Right Motors
        driveTrainrightDriveLead = new WPI_TalonSRX(3);
        driveTrainrightDriveFollow = new WPI_TalonSRX(4);
        
        // Create Drive Train
        driveTrainrobotDrive = new DifferentialDrive(driveTrainleftDriveLead, driveTrainrightDriveLead);
        driveTrainrobotDrive.setSafetyEnabled(true);
        driveTrainrobotDrive.setExpiration(0.1);
    	driveTrainrobotDrive.setMaxOutput(1.0);

    	// Assign Motor Controllers
        elevatorUpDown = new Spark(0);
        elevatorUpDown.setInverted(false);
        pole = new Spark(1);
        pole.setInverted(false);
        wheelB = new Spark(2);
        wheelB.setInverted(false);
        wheelA = new Spark(3);
        wheelA.setInverted(false);
        lights = new Spark(9);
        lights.setInverted(false);
        
      // Limit Switches (Currently not used)
        limSwitch = new DigitalOutput(8);
    }
}
