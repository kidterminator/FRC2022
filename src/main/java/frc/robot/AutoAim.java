package frc.robot;

import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import com.revrobotics.CANSparkMax;

public class AutoAim extends Limelight {

    private static final int HORIZONTAL_AIM = 8;

    private CANSparkMax horizontalAimMotor;

    horizontalAimMotor=new CANSparkMax(PortMap.CAN.HORIZONTAL_AIM,MotorType.kBrushless);

    public void horizontalAim() {
        double horizOffset = getHorizontalOffset();
        if (horizOffset < 0) {
            horizontalAimMotor.set(10);
        } else if (horizOffset > 0) {
            horizontalAimMotor.setInverted(10);
        }
    }
}