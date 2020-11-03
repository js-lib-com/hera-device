package js.hera.dev;

/**
 * Door and window sensors, also known as contact switches, monitor the open or close status of a window or door.
 * 
 * @author Iulian Rotaru
 */
public interface ContactSwitch extends Device
{
  boolean isOpened();
}
