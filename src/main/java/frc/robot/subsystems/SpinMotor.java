// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import java.util.Random;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SpinMotor extends SubsystemBase {
  /** Creates a new SpinMotor. */
  CANSparkMax motorOne = new CANSparkMax(10, MotorType.kBrushless);

  public SpinMotor() {
    int x = (0);
    while (x < 100);
    while (x > 10) {

    String motor = "Spin motor clockwise at" + x + "speed"; 
    x++;
    System.out.println(motor);


    int  negativex = (0);
    // opposite of positive x (going forward)
    while (negativex > -100);
    while (negativex < -10) {

    String reverseMotor = "Spin motor counterclockwise at" + negativex + "speed"; {
    negativex --;
    System.out.println(reverseMotor); }

        }
     }

   }
      
  static void motorRunTime() {
    int s = (0);
    // s = seconds
    while (s < 20);
    while (s > 0) {

      System.out.println("Spin motor for" + s + "seconds"); }
    }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
