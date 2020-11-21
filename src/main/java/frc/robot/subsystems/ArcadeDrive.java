/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArcadeDrive extends SubsystemBase {
  
  private CANSparkMax frontLeft = new CANSparkMax(2 , MotorType.kBrushless);
  private CANSparkMax frontRight = new CANSparkMax(1 , MotorType.kBrushless);
  DifferentialDrive driveBase = new DifferentialDrive(frontLeft, frontRight);

  public ArcadeDrive() {

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void driveRobot(double xSpeed, double zRotation, boolean squareInputs){
    driveBase.arcadeDrive(xSpeed, zRotation, squareInputs);
  }
}
