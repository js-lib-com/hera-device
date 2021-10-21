package js.hera.dev;

public interface ThermostatSensor extends TemperatureSensor
{
  String[] getActions();

  double getValue();
  
  double readValue();
}
