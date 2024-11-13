// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.AryansMotorThingamiji;
import frc.robot.subsystems.BigMotor;
import frc.robot.subsystems.TacoCat;

/** An example command that uses an example subsystem. */
public class SpinMotor extends Command {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private AryansMotorThingamiji m_subsystem;
  private BigMotor mm_subsystem;
  private TacoCat mmm_subsystem;

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public SpinMotor(AryansMotorThingamiji subsystem, BigMotor bigMotor, TacoCat tomatoes) {
    m_subsystem = subsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);

    mm_subsystem = bigMotor;
    addRequirements(subsystem);

    mmm_subsystem = tomatoes;
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
m_subsystem.aryaNotor(0.7);
mm_subsystem.motorTwo(0.7);
mmm_subsystem.Salsa(0.7);

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_subsystem.aryaNotor(0);
    mm_subsystem.motorTwo(0);
    mmm_subsystem.Salsa(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
