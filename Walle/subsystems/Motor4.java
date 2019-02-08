
package org.usfirst.frc1537.Walle.subsystems;

import org.usfirst.frc1537.Walle.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.SpeedController;

public class Motor4 extends Subsystem {

    private final SpeedController motor4 = RobotMap.motor4motor4;

    @Override
    public void initDefaultCommand() {
    }
    public void vint(double power) {
        motor4.set(power);
    }
}

