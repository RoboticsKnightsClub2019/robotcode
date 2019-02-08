
package org.usfirst.frc1537.Walle.subsystems;

import org.usfirst.frc1537.Walle.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;

public class Motor5 extends Subsystem {

    private final SpeedController motor5 = RobotMap.motor5motor5;

    @Override
    public void initDefaultCommand() {
    }

    public void vint(double power) {
        motor5.set(power);
    }
}