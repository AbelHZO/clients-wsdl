
package com.home.mexico.departamento.operaciones;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.home.mexico.departamento.operaciones package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.home.mexico.departamento.operaciones
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link com.home.mexico.departamento.operaciones.Departamento }
     * 
     */
    public com.home.mexico.departamento.operaciones.Departamento createDepartamento() {
        return new com.home.mexico.departamento.operaciones.Departamento();
    }

    /**
     * Create an instance of {@link OutDepartamentoListar }
     * 
     */
    public OutDepartamentoListar createOutDepartamentoListar() {
        return new OutDepartamentoListar();
    }

    /**
     * Create an instance of {@link com.home.mexico.departamento.operaciones.Departamento.DepartamentoListar }
     * 
     */
    public com.home.mexico.departamento.operaciones.Departamento.DepartamentoListar createDepartamentoDepartamentoListar() {
        return new com.home.mexico.departamento.operaciones.Departamento.DepartamentoListar();
    }

    /**
     * Create an instance of {@link InDepartamentoListar }
     * 
     */
    public InDepartamentoListar createInDepartamentoListar() {
        return new InDepartamentoListar();
    }

    /**
     * Create an instance of {@link DepartamentoListarRq }
     * 
     */
    public DepartamentoListarRq createDepartamentoListarRq() {
        return new DepartamentoListarRq();
    }

    /**
     * Create an instance of {@link OutDepartamentoListar.Departamento }
     * 
     */
    public OutDepartamentoListar.Departamento createOutDepartamentoListarDepartamento() {
        return new OutDepartamentoListar.Departamento();
    }

    /**
     * Create an instance of {@link DepartamentoListarRs }
     * 
     */
    public DepartamentoListarRs createDepartamentoListarRs() {
        return new DepartamentoListarRs();
    }

}
