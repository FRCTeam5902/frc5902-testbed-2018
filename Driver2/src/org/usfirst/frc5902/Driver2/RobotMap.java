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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static AnalogAccelerometer sensorBaseAAccelerometer;
    public static WPI_TalonSRX driveTrainleftDriveLead;
    public static WPI_TalonSRX driveTrainrightDriveLead;
    public static WPI_TalonSRX driveTrainleftDriveFollow;
    public static WPI_TalonSRX driveTrainrightDriveFollow;
    public static Solenoid pneumaticSystemCompressor;
    public static DoubleSolenoid pneumaticSystemdoubleSolenoidClaw;
    public static SpeedController elevatorUpDown;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static RobotDrive driveTrainrobotDrive;
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        sensorBaseAAccelerometer = new AnalogAccelerometer(0);
        LiveWindow.addSensor("sensorBase", "AAccelerometer", sensorBaseAAccelerometer);
        sensorBaseAAccelerometer.setSensitivity(0.0);
        sensorBaseAAccelerometer.setZero(2.5);
        driveTrainleftDriveLead = new WPI_TalonSRX(1);
        
        
        driveTrainrightDriveLead = new WPI_TalonSRX(3);
        
        driveTrainrobotDrive = new RobotDrive(driveTrainleftDriveLead, driveTrainrightDriveLead);

        

        driveTrainrobotDrive.setSafetyEnabled(true);

        driveTrainrobotDrive.setExpiration(0.1);

    	driveTrainrobotDrive.setSensitivity(0.5);

    	driveTrainrobotDrive.setMaxOutput(1.0);
        
        
        driveTrainleftDriveFollow = new WPI_TalonSRX(2);
        
        
        driveTrainrightDriveFollow = new WPI_TalonSRX(4);
        
        
        pneumaticSystemCompressor = new Solenoid(0, 0);
        LiveWindow.addActuator("pneumaticSystem", "Compressor", pneumaticSystemCompressor);
        
        pneumaticSystemdoubleSolenoidClaw = new DoubleSolenoid(0, 1, 2);
        LiveWindow.addActuator("pneumaticSystem", "doubleSolenoidClaw", pneumaticSystemdoubleSolenoidClaw);
        
        elevatorUpDown = new Spark(0);
        LiveWindow.addActuator("elevator", "UpDown", (Spark) elevatorUpDown);
        elevatorUpDown.setInverted(false);

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
