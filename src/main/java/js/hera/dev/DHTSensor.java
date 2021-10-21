package js.hera.dev;

public interface DHTSensor extends Device
{
  String[] getActions();

  double getHumidity();

  double getTemperature();

  double getHeatIndex();

  Value getValue();

  State getState();

  public static class Value
  {
    private double humidity;
    private double temperature;
    private double heatIndex;

    public double getHumidity()
    {
      return humidity;
    }

    public void setHumidity(double humidity)
    {
      this.humidity = humidity;
    }

    public double getTemperature()
    {
      return temperature;
    }

    public void setTemperature(double temperature)
    {
      this.temperature = temperature;
    }

    public double getHeatIndex()
    {
      return heatIndex;
    }

    public void setHeatIndex(double heatIndex)
    {
      this.heatIndex = heatIndex;
    }
  }

  public static class State
  {
    private int period;
    private long timestamp;
    private double humidityThreshold;
    private double temperatureThreshoold;
    private double humidity;
    private double temperature;

    public int getPeriod()
    {
      return period;
    }

    public void setPeriod(int period)
    {
      this.period = period;
    }

    public long getTimestamp()
    {
      return timestamp;
    }

    public void setTimestamp(long timestamp)
    {
      this.timestamp = timestamp;
    }

    public double getHumidityThreshold()
    {
      return humidityThreshold;
    }

    public void setHumidityThreshold(double humidityThreshold)
    {
      this.humidityThreshold = humidityThreshold;
    }

    public double getTemperatureThreshoold()
    {
      return temperatureThreshoold;
    }

    public void setTemperatureThreshoold(double temperatureThreshoold)
    {
      this.temperatureThreshoold = temperatureThreshoold;
    }

    public double getHumidity()
    {
      return humidity;
    }

    public void setHumidity(double humidity)
    {
      this.humidity = humidity;
    }

    public double getTemperature()
    {
      return temperature;
    }

    public void setTemperature(double temperature)
    {
      this.temperature = temperature;
    }
  }
}
