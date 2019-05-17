
package com.home.mexico.empleado.operaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.home.mexico.abelhzo.common.InCommonHeader;


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
 *         &lt;element name="In_CommonHeader" type="{http://www.mexico.home.com/abelhzo/common/}In_CommonHeader"/&gt;
 *         &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}In_EmpleadoBuscar"/&gt;
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
    "inCommonHeader",
    "inEmpleadoBuscar"
})
@XmlRootElement(name = "EmpleadoBuscarRq")
public class EmpleadoBuscarRq {

    @XmlElement(name = "In_CommonHeader", required = true)
    protected InCommonHeader inCommonHeader;
    @XmlElement(name = "In_EmpleadoBuscar", required = true)
    protected InEmpleadoBuscar inEmpleadoBuscar;

    /**
     * Obtiene el valor de la propiedad inCommonHeader.
     * 
     * @return
     *     possible object is
     *     {@link InCommonHeader }
     *     
     */
    public InCommonHeader getInCommonHeader() {
        return inCommonHeader;
    }

    /**
     * Define el valor de la propiedad inCommonHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link InCommonHeader }
     *     
     */
    public void setInCommonHeader(InCommonHeader value) {
        this.inCommonHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad inEmpleadoBuscar.
     * 
     * @return
     *     possible object is
     *     {@link InEmpleadoBuscar }
     *     
     */
    public InEmpleadoBuscar getInEmpleadoBuscar() {
        return inEmpleadoBuscar;
    }

    /**
     * Define el valor de la propiedad inEmpleadoBuscar.
     * 
     * @param value
     *     allowed object is
     *     {@link InEmpleadoBuscar }
     *     
     */
    public void setInEmpleadoBuscar(InEmpleadoBuscar value) {
        this.inEmpleadoBuscar = value;
    }

}
