package js.hera.dev;

public interface LightDimmer extends Device
{
  int updateValue(int value);
  
  int setValue(int value);

  int getValue();
}
