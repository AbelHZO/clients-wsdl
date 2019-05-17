package com.home.mexico.empleado;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-05-15T18:20:57.257-05:00
 * Generated source version: 3.3.0
 *
 */
@WebServiceClient(name = "EmpleadoServiceClient",
                  wsdlLocation = "src/main/resources/empleados/empleados.wsdl",
                  targetNamespace = "http://www.mexico.home.com/empleado/")
public class EmpleadoServiceClient extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.mexico.home.com/empleado/", "EmpleadoServiceClient");
    public final static QName EmpleadoListarSOAP = new QName("http://www.mexico.home.com/empleado/", "empleadoListarSOAP");
    public final static QName EempleadoModificarSOAP = new QName("http://www.mexico.home.com/empleado/", "eempleadoModificarSOAP");
    public final static QName EmpleadoGuardarSOAP = new QName("http://www.mexico.home.com/empleado/", "empleadoGuardarSOAP");
    public final static QName EmpleadoBuscarSOAP = new QName("http://www.mexico.home.com/empleado/", "empleadoBuscarSOAP");
    static {
        URL url = EmpleadoServiceClient.class.getResource("src/main/resources/empleados/empleados.wsdl");
        if (url == null) {
            url = EmpleadoServiceClient.class.getClassLoader().getResource("src/main/resources/empleados/empleados.wsdl");
        }
        if (url == null) {
            java.util.logging.Logger.getLogger(EmpleadoServiceClient.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "src/main/resources/empleados/empleados.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EmpleadoServiceClient(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EmpleadoServiceClient(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmpleadoServiceClient() {
        super(WSDL_LOCATION, SERVICE);
    }

    public EmpleadoServiceClient(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EmpleadoServiceClient(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EmpleadoServiceClient(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns EmpleadoService
     */
    @WebEndpoint(name = "empleadoListarSOAP")
    public EmpleadoService getEmpleadoListarSOAP() {
        return super.getPort(EmpleadoListarSOAP, EmpleadoService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmpleadoService
     */
    @WebEndpoint(name = "empleadoListarSOAP")
    public EmpleadoService getEmpleadoListarSOAP(WebServiceFeature... features) {
        return super.getPort(EmpleadoListarSOAP, EmpleadoService.class, features);
    }


    /**
     *
     * @return
     *     returns EmpleadoService
     */
    @WebEndpoint(name = "eempleadoModificarSOAP")
    public EmpleadoService getEempleadoModificarSOAP() {
        return super.getPort(EempleadoModificarSOAP, EmpleadoService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmpleadoService
     */
    @WebEndpoint(name = "eempleadoModificarSOAP")
    public EmpleadoService getEempleadoModificarSOAP(WebServiceFeature... features) {
        return super.getPort(EempleadoModificarSOAP, EmpleadoService.class, features);
    }


    /**
     *
     * @return
     *     returns EmpleadoService
     */
    @WebEndpoint(name = "empleadoGuardarSOAP")
    public EmpleadoService getEmpleadoGuardarSOAP() {
        return super.getPort(EmpleadoGuardarSOAP, EmpleadoService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmpleadoService
     */
    @WebEndpoint(name = "empleadoGuardarSOAP")
    public EmpleadoService getEmpleadoGuardarSOAP(WebServiceFeature... features) {
        return super.getPort(EmpleadoGuardarSOAP, EmpleadoService.class, features);
    }


    /**
     *
     * @return
     *     returns EmpleadoService
     */
    @WebEndpoint(name = "empleadoBuscarSOAP")
    public EmpleadoService getEmpleadoBuscarSOAP() {
        return super.getPort(EmpleadoBuscarSOAP, EmpleadoService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmpleadoService
     */
    @WebEndpoint(name = "empleadoBuscarSOAP")
    public EmpleadoService getEmpleadoBuscarSOAP(WebServiceFeature... features) {
        return super.getPort(EmpleadoBuscarSOAP, EmpleadoService.class, features);
    }

}
