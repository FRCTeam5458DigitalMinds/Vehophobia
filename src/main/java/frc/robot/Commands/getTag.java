package frc.robot.Commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CommandSwerveDrivetrain;
import frc.robot.subsystems.Limelight;

public class getTag extends Command 
{
    CommandSwerveDrivetrain driveTrain;

    public getTag (CommandSwerveDrivetrain driveTrain)
    {
        this.driveTrain = driveTrain;
        
        addRequirements(driveTrain);
    }

    public void execute()
    {
        //If see specfic tag, turn off LED
        if(driveTrain.getLastKnownTag() == 21){
            driveTrain.LEDoff();
        }
        else{
            driveTrain.LEDon();
        }
    }
}