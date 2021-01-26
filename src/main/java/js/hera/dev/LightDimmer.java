package js.hera.dev;

public interface LightDimmer extends Device
{
  State updateValue(int value);

  State setValue(int value);

  int getValue();

  State getState();

  public static class State
  {
    private boolean running;
    private Integer value;

    public boolean isRunning()
    {
      return running;
    }

    public void setRunning(boolean running)
    {
      this.running = running;
    }

    public Integer getValue()
    {
      return value;
    }

    public void setValue(Integer value)
    {
      this.value = value;
    }
  }
}
