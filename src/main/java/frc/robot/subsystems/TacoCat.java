// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TacoCat extends SubsystemBase {
  /** Creates a new TacoCat. */
  CANSparkMax motorThree = new CANSparkMax(7, MotorType.kBrushless);

  public TacoCat() {}

  public void Salsa (double speed) {
    motorThree.set(speed); 

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
