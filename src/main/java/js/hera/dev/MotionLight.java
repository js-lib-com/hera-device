package js.hera.dev;

public interface MotionLight extends Device
{
  void turnON();

  void turnOFF();

  boolean getState();
}
