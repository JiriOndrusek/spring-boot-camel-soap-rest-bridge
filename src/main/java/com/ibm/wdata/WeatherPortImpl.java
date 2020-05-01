
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package com.ibm.wdata;

import java.util.logging.Logger;


/**
 * This class was generated by Apache CXF 3.2.7.fuse-sb2-740016-redhat-00001
 * 2020-03-25T15:14:21.754-04:00
 * Generated source version: 3.2.7.fuse-sb2-740016-redhat-00001
 *
 */

@javax.jws.WebService(
                      serviceName = "weatherService",
                      portName = "WeatherPort",
                      targetNamespace = "http://ibm.com/wdata",
                      
                      endpointInterface = "com.ibm.wdata.WeatherPortType")

public class WeatherPortImpl implements WeatherPortType {

    private static final Logger LOG = Logger.getLogger(WeatherPortImpl.class.getName());

    /* (non-Javadoc)
     * @see com.ibm.wdata.WeatherPortType#weatherRequest(com.ibm.wdata.WeatherRequest weatherRequest)*
     */
    public com.ibm.wdata.WeatherResponse weatherRequest(WeatherRequest weatherRequest) {
        LOG.info("Executing operation weatherRequest");
        
        try {
            com.ibm.wdata.WeatherResponse _return = new com.ibm.wdata.WeatherResponse();
            _return.setZip(weatherRequest.getZipcode());
            _return.setCity("LA");
            _return.setState("CA");
            _return.setHumidity("95%");
            _return.setTemperature("28");
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
