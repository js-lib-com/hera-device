package js.hera.dev;

public interface ThermostatSensor extends TemperatureSensor
{
  double getValue();
  
  double readValue();
}
