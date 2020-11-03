package js.hera.dev;

/**
 * Temperature sensor.
 * 
 * @author Iulian Rotaru
 */
public interface TemperatureSensor extends Device
{
  double getValue();
  
  double readValue();
}
