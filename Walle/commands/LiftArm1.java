
package org.usfirst.frc1537.Walle.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1537.Walle.Robot;

public class LiftArm1 extends Command {

    public LiftArm1() {
        requires(Robot.motor3);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.motor3.LiftArm1(Robot.oi.getJoystick1Y(5));
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

    @Override
    protected void end() {
        Robot.motor3.LiftArm1(0.01);
    }

    @Override
    protected void interrupted() {
        end();
    }
}
