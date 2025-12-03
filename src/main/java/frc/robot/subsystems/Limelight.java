package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.LimelightHelpers;

public class Limelight extends SubsystemBase{
    public int lastKnownTag;
    public int getLastTag(){
         int currentTag = (int)LimelightHelpers.getFiducialID("limelight-digital");
            if (currentTag > 0)
            {
                lastKnownTag = currentTag;
            }
            SmartDashboard.putNumber("cur id", currentTag);
            SmartDashboard.putNumber("last id", lastKnownTag);
    
            return lastKnownTag;
    }
}
