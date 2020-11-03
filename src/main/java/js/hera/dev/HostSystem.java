package js.hera.dev;

import java.net.URL;

/**
 * Networked micro controller or micro system able to run device software and to respond to discovery requests and
 * device action invocation. Also target host implements support for device eventing.
 * 
 * @author Iulian Rotaru
 */
public interface HostSystem
{
  void subscribe(URL messageBrokerURL);
}
