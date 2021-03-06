package org.usfirst.frc.team4959.robot.subsystems;

import org.usfirst.frc.team4959.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BackFlipper extends Subsystem {
    
	SpeedController motor = RobotMap.flipperMotor;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void raiseFlippers(double speed) {
    	motor.set(speed);
    }
    
    public void lowerFlippers(double speed) {
    	motor.set(-speed);
    }
}

