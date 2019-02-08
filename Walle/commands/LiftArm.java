
package org.usfirst.frc1537.Walle.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc1537.Walle.Robot;

public class LiftArm extends Command {

    public LiftArm() {
        requires(Robot.motor1_2);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
        Robot.motor1_2.LiftArm(Robot.oi.getJoystick1Y());
    }

    @Override
    protected boolean isFinished() {
        return isTimedOut();
    }

    @Override
    protected void end() {
        Robot.motor1_2.LiftArm(0.2);
    }

    @Override
    protected void interrupted() {
        end();
    }
}
