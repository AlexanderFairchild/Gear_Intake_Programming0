package frc.robot;

public class RoboClasses {
    public int ticks = 0;

    public double Accelerate(double desired)
    {
        ticks++;
        return desired*ticks*0.0001;
    }
}