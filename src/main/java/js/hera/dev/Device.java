package js.hera.dev;

/**
 * Base interface for all HERA compatible devices. A device has an interface describing the list of operations that the
 * device supports and all device interfaces should extend this base device interface. A device instance is deployed on
 * a target host and is accessible at a device URL. Device manager creates a proxy that meditates device actions remote
 * invocation via {@link ProxyHandler}.
 * <p>
 * In order to invoke an action on a device, controller code should first acquire a device instance from
 * {@link DeviceManager}, see sample code.
 * 
 * <pre>
 * DeviceManager deviceManager = Factory.getInstance(DeviceManager.class);
 * . . .
 * BinaryLight light = deviceManager.getDeviceInstance(&quot;living-room&quot;, BinaryLight.class);
 * light.toggle();
 * </pre>
 * <p>
 * A device can be temporary not active, e.g. battery or network down, in which case user interface present it grayed.
 * Device has also an enabled state configurable by admin user; a not enabled device is not visible on regular user
 * interfaces.
 * 
 * @author Iulian Rotaru
 */
public interface Device
{
  /**
   * Test if device is active. Setters on not active device are discarded and condition recorded to supervisor. Getters
   * on not active device should return null values.
   * <p>
   * A device may be inactive if is not reachable via networking protocol perhaps because its battery is down.
   * 
   * @return
   */
  boolean isActive();

  void setEnabled(boolean enabled);

  boolean isEnabled();
}
