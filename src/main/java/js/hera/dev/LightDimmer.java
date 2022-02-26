package js.hera.dev;

public interface LightDimmer extends Device
{
  State updateValue(int value);

  State setValue(int value);

  int getValue();

  State turnON();

  State turnOFF();

  State setState(boolean state);

  State getState();

  public static class State
  {
    private int value;
    private boolean active;

    public int getValue()
    {
      return value;
    }

    public void setValue(int value)
    {
      this.value = value;
    }

    public boolean isActive()
    {
      return active;
    }

    public void setActive(boolean active)
    {
      this.active = active;
    }
  }
}
