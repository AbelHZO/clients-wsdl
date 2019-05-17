package com.home.mexico.departamento;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.0
 * 2019-05-15T18:20:58.239-05:00
 * Generated source version: 3.3.0
 *
 */
@WebService(targetNamespace = "http://www.mexico.home.com/departamento/", name = "DepartamentoService")
@XmlSeeAlso({com.home.mexico.abelhzo.common.ObjectFactory.class, com.home.mexico.departamento.operaciones.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface DepartamentoService {

    @WebMethod(operationName = "DepartamentoListar", action = "http://www.mexico.home.com/departamento/")
    @WebResult(name = "DepartamentoListarRs", targetNamespace = "http://www.mexico.home.com/departamento/operaciones/", partName = "DepartamentoListarRs")
    public com.home.mexico.departamento.operaciones.DepartamentoListarRs departamentoListar(
        @WebParam(partName = "DepartamentoListarRq", name = "DepartamentoListarRq", targetNamespace = "http://www.mexico.home.com/departamento/operaciones/")
        com.home.mexico.departamento.operaciones.DepartamentoListarRq departamentoListarRq
    );
}
