package js.hera.dev;

/**
 * Thermostat with setpoint.
 * 
 * @author Iulian Rotaru
 */
public interface Thermostat extends Device
{
  void setSetpoint(Double setpoint);

  State updateSetpoint(Double setpoint);

  double getSetpoint();

  void setTemperature(double temperature);

  double getTemperature();

  State update();

  State getState();

  public static class State
  {
    private float setpoint;
    private float temperature;
    private boolean running;

    public float getSetpoint()
    {
      return setpoint;
    }

    public void setSetpoint(float setpoint)
    {
      this.setpoint = setpoint;
    }

    public float getTemperature()
    {
      return temperature;
    }

    public void setTemperature(float temperature)
    {
      this.temperature = temperature;
    }

    public boolean isRunning()
    {
      return running;
    }

    public void setRunning(boolean running)
    {
      this.running = running;
    }
  }
}
