package frc.robot.commands;

import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.swerve.DriveSubsystem;

public class ResetOdometerCommand extends Command{
    private final DriveSubsystem drive;

    public ResetOdometerCommand(DriveSubsystem driveSubsystem){
        drive = driveSubsystem;

        addRequirements(driveSubsystem);
    }

    public void initialize(){
        drive.resetOdometry(new Pose2d());
    }

    public boolean isFinished(){
        return true;
    }
}
