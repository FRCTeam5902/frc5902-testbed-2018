# The Wire Clippers - FRC 5902 Robot Code - 2018 Season
2018 is our 3rd year in the FIRST Robotics competition.

We used Robot builder, old code and followed along these videos from WPI 
https://www.youtube.com/playlist?list=PLYA9eZLlgz7t9Oleid2wtlgnvhGObeKzp
# 2018 Code Below

# Robot Subsystems

## DriveTrain - Robot Driving
Talon SRX Motor Controllers connected 
- Left Motor Lead - Front
- Left Motor Follow - Back

- Right Motor Lead - Front
- Right Motor Follow -Back

## (Not setup yet) - fuelIntake - Method to Intake and Eject the Power cubes
- (Not setup yet) IntakeMotor - powers the intake system to intake the cube. It does have encoders but not sure how to interact with it.

## (Not setup yet) - sensorBase
- Encoders
- Pixy Camera

## (Not setup yet) - cameraControl 
- panServo - Controls pan of camera
- tiltServo - Controls tilt of camera

# Autonomous Mode

Using an autonomous command chooser in the code drivers are able to select which code is run during the autnomous mode.
- AutonomousBaseLine
- AutonomousDoNothing
- ArcadeDrive
- Test Motor
- AutonomousLeft
- AutonomousStraight
- AutonomousRight

# Teleop Mode

During teleop mode our robot can run commands as well as having the driver drive around. On the drive station computer we have a SmartDashboard that will display information from the robot to the drivers. Future updates will implement the ShuffleBoard

## Driver Station SmartDashboard

On the smart dashboard we have the following
- 4 command


## 2017 Driver Controls


### Driver Logitech Joystick - Operator Interface Assignments

| Button  | Button # | Command |
| ------------- | ------------- | ------------- |
| Joystick  | NA | Regular ArcadeDrive  |



### Driver Xbox - Operator Interface Assignments

| Button  | Button # | Command |
| ------------- | ------------- | ------------- |
| A Button | 1 | Toggle - Test Motor |

