package js.hera.dev;

public interface ColorLED extends Device
{
  State setColor(int color);

  int getColor();

  State setBrightness(double brightness);

  double getBrightness();

  State turnON();

  State turnOFF();

  State setState(boolean state);

  State getState();

  public static class State
  {
    private int red;
    private int green;
    private int blue;
    private int color;
    private double brightness;
    private boolean active;

    public int getRed()
    {
      return red;
    }

    public void setRed(int red)
    {
      this.red = red;
    }

    public int getGreen()
    {
      return green;
    }

    public void setGreen(int green)
    {
      this.green = green;
    }

    public int getBlue()
    {
      return blue;
    }

    public void setBlue(int blue)
    {
      this.blue = blue;
    }

    public int getColor()
    {
      return color;
    }

    public void setColor(int color)
    {
      this.color = color;
    }

    public double getBrightness()
    {
      return brightness;
    }

    public void setBrightness(double brightness)
    {
      this.brightness = brightness;
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
