
package com.home.mexico.empleado.operaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listaEmpleados" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "listaEmpleados"
})
@XmlRootElement(name = "In_EmpleadoListar")
public class InEmpleadoListar {

    @XmlElement(required = true)
    protected String listaEmpleados;

    /**
     * Obtiene el valor de la propiedad listaEmpleados.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getListaEmpleados() {
        return listaEmpleados;
    }

    /**
     * Define el valor de la propiedad listaEmpleados.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setListaEmpleados(String value) {
        this.listaEmpleados = value;
    }

}
