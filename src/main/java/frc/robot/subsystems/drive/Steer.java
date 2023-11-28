package frc.robot.subsystems.drive;

public abstract class Steer {
    protected static final class Constants {
        // TODO: create a double called dtSeconds and initialize to 0.020
        // TODO: create a double called gearing and initialize to -150.0 / 7.0
        // TODO: create a double called kV and initialize to 0.427607143
        // TODO: create a double called kA and initialize to 0.005493643
        // TODO: create a double called maxPositionErrorRadians and initialize to 0.125
        // TODO: create a double called maxVelocityErrorRadiansPerSec and initialize to
        // 1
        // TODO: create a LinearSystem<N2, N1, N1> called plant and initialize to
        // LinearSystemId.identifyPositionSystem(kV, kA)
        // TODO: create a Vector<N2> called qelms and initialize to
        // VecBuilder.fill(maxPositionErrorRadians, maxVelocityErrorRadiansPerSec)
        // TODO: create a Vector<N1> called relms and initialize to
        // VecBuilder.fill(RobotController.getBatteryVoltage())
        // TODO: create a LinearQuadraticRegular<N2, N1, N1> called controller and
        // initialize with appropriate constants
        // TODO: create a double called kP initialize to controller.getK().get(0, 0)
        // TODO: create a double called kI and initialize to 0.0
        // TODO: create a double called kD and initialize to controller.getK().get(0, 1)
        // TODO: create a double called tolerance and initialize to Math.abs(0.0239 * 2
        // * Math.PI / Constants.gearing)
    }

    // TODO: create a field of type TrapezoidProfile called trapezoidProfile
    // TODO: create a field of type PIDController called pidController
    // TODO: create a field of type SimpleMotorFeedforward called

    public Steer(double kS) {
        // TODO: initialize simpleMotorFeedforward with appropriate constants
        // TODO: initialize pidController with appropriate constants
        // TODO: create a double called maxVelocity and initialize to simpleMotorFeedforward.maxachievableVelocity(12, 0)
        // TODO: create a double called maxAcceleration and intialize to simpleMotorFeedforward.maxAchievableAcceleration(12, 0)
        // TODO: create a Constraints object called contraints and intialize with maxVelocity and maxAcceleration
        // TODO: initialize trapezoidProfile with appropriate constants
        // TODO: setTolerance for the pidController with appropriate constants
    }

    public abstract double getPositionDegrees();

    public abstract double getVelocityDegreesPerSecond();

    public abstract void setPositionDegrees(double degrees);

    public void turnToPosition(double degrees) {
        // TODO: create a double called measurementRadians and initialize to Math.toRadians(getPositionDegrees())
        // TODO: create a double called measurementRadiansPerSecond and initialize to Math.toRadians(getVelocityDegreesPerSecond())
        // TODO: create a double called setPointRadians and initialize to Math.toRadians(degrees)
        // TODO: create a double called errorBound and initialize to (pi - -pi) / 2.0
        // TODO: create a double called difference and intialize MathUtil.inputModulus(setpointRadians - measurementRadians, -errorBound, errorBound)
        // TODO: reassign setpointRadian to measurementRadians + difference;
        // TODO: create a State called goal and initialize to setpointRadians and 0.0
        // TODO: create a State called current and initialize to measurementRadians and measurementRadiansPerSecond
        // TODO: create a State called achievableSetpoint and initliaze from trapezoidProfile.calculate
        // TODO: create a double called feedbackVoltage and calculate from pidController
        // TODO: create a double called feedforwardVoltage and calculate from simpleMotorFeedforward.calculate(measurementRadiansPerSecond, achievableSetpoint.velocity, dtSeconds)
        // TODO: create a double called voltage and initialize to the sum of the two previous voltages
        // TODO: voltage = MathUtil.clamp(voltage, -12.0, 12.0);
        // TODO: setInputVoltage to voltage
    }
    
    public abstract void setInputVoltage(double voltage);

}
