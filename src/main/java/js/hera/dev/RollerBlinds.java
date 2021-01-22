package js.hera.dev;

public interface RollerBlinds extends Device
{
  double open(double percent);
  
  int close();
  
  int position();
  
  double state();
  
  int move();
  
  int stop();
  
  int updateUpPosition();
  
  int updateDownPosition();
}
