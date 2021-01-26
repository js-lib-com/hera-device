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
    private boolean active;
    private Integer value;

    public boolean isActive()
    {
      return active;
    }

    public void setActive(boolean active)
    {
      this.active = active;
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
