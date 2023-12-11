package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.subsystems.claw.ClawSubsystem;

public class Manipulator {

    public static final class State {

        public State(

        ) {

        }
    }

    
    private final ClawSubsystem clawSubsystem;
    // TODO: KEITH: create a private final field for tiltSubsystem of type
    // TiltSubsystem

    public Manipulator() {
        clawSubsystem = new ClawSubsystem();

        // TODO: KEITH: initialize tiltSubsystem to new TiltSubsystem();
    }

    public void addToDashboard() {
        SmartDashboard.putData(clawSubsystem);
        // TODO: KEITH: use the SmartDashboard.putData() method to put tiltSubsystem to
        // the Dashboard

    }

    public void setDefaultCommands() {

    }

    public void addMechanism2dWidget() {
        // TODO:
    }

    public void addTestingCommandsToDashboard() {
        Command testOPENCommand = clawSubsystem.createSetStateCommand(ClawSubsystem.State.OPEN);
        Command testCLOSEDCommamd = clawSubsystem.createSetStateCommand(ClawSubsystem.State.CLOSED);

        // TODO: KEITH create a Command called testFULLcommand using tiltSubsystem's
        // createSetStateCommand()
        // TODO: KEITH create a Command called testLONGcommand using tiltSubsystem's
        // createSetStateCommand()
        // TODO: KEITH create a Command called testSHORTcommand using tiltSubsystem's
        // createSetStateCommand()
        // TODO: KEITH create a Command called testNONEcommand using tiltSubsystem's
        // createSetStateCommand()

    }

    public void bindArmManualControlToController(
            CommandXboxController controller,
            XboxController.Axis axis,
            double deadband) {
        // TODO:

    }

    public void bindElevatorManualControlToController(
            CommandXboxController controller,
            XboxController.Axis axis,
            double deadband) {
        // TODO:

    }

    public void bindGrabberManualControlToController(
            CommandXboxController controller,
            double deadband) {
        // TODO:

    }

    public void bindTiltManualControlToControllerPOV(
            CommandXboxController controller) {
        // TODO: KEITH: create a Trigger called fullTrigger and initialize with
        // controller.povUp();
        // TODO: KEITH: create a Trigger called longTrigger and initialize with
        // controller.povUp();
        // TODO: KEITH: create a Trigger called shortTrigger and initialize with
        // controller.povRight();
        // TODO: KEITH: create a Trigger called NoneTrigger and initialize with
        // controller.povDown();
        // TODO: KEITH: create a Command called fullCommand and initialize with the
        // createSetStateCommand from tiltSubsystem;
        // TODO: KEITH: create a Command called longCommand and initialize with the
        // createSetStateCommand from tiltSubsystem;
        // TODO: KEITH: create a Command called shortCommand and initialize with the
        // createSetStateCommand from tiltSubsystem;
        // TODO: KEITH: create a Command called noneCommand and initialize with the
        // createSetStateCommand from tiltSubsystem;
        // TODO: KEITH: bind the fullTrigger to the fullCommand with fullTrigger's onTrue method


    }

    public void bindClawManualControlToController(
            CommandXboxController controller, 
            XboxController.Button button) {
        
        Command toggleCommand = clawSubsystem.createToggleCommand();
        Trigger trigger = controller.button(button.value);
        trigger.onTrue(toggleCommand);

    }

    public void bindManipulatorStateToController(
            CommandXboxController controller,
            XboxController.Button button) {
        // TODO:

    }

    public void addManipulatorStateToNamedCommands(
            String stateName,
            Manipulator.State state) {
        // TODO:

    }

}
