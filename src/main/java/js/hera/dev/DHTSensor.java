package js.hera.dev;

public interface DHTSensor extends Device
{
  Value getValue();

  public static class Value
  {
    private float humidity;
    private float temperature;

    public float getHumidity()
    {
      return humidity;
    }

    public void setHumidity(float humidity)
    {
      this.humidity = humidity;
    }

    public float getTemperature()
    {
      return temperature;
    }

    public void setTemperature(float temperature)
    {
      this.temperature = temperature;
    }
  }
}
