package js.hera.dev;

public interface ColorLED extends Device
{
  int setColor(int color);
  
  int getColor();
  
  double setBrightness(double brightness);
  
  double getBrightness();
  
  boolean turnON();

  boolean turnOFF();
  
  boolean setState(boolean state);
  
  boolean getState();
}
