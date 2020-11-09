package js.hera.dev;

/**
 * Switch the power supply on a not specified consumer.
 * 
 * @author Iulian Rotaru
 */
public interface Actuator extends Device
{
  void turnON();

  void turnOFF();

  void toggle();
  
  void setState(boolean state);
  
  /**
   * Get switch state. If switch is not active callback is not invoked and attempt to read is recorded to supervisor.
   * 
   * @return
   */
  boolean getState();
}
