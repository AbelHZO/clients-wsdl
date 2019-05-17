
package com.home.mexico.empleado.operaciones;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.home.mexico.abelhzo.common.OutCommonHeader;


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
 *         &lt;element name="In_CommonHeader" type="{http://www.mexico.home.com/abelhzo/common/}Out_CommonHeader"/&gt;
 *         &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}Out_EmpleadoModificar"/&gt;
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
    "outEmpleadoModificar"
})
@XmlRootElement(name = "EmpleadoModificarRs")
public class EmpleadoModificarRs {

    @XmlElement(name = "In_CommonHeader", required = true)
    protected OutCommonHeader inCommonHeader;
    @XmlElement(name = "Out_EmpleadoModificar", required = true)
    protected OutEmpleadoModificar outEmpleadoModificar;

    /**
     * Obtiene el valor de la propiedad inCommonHeader.
     * 
     * @return
     *     possible object is
     *     {@link OutCommonHeader }
     *     
     */
    public OutCommonHeader getInCommonHeader() {
        return inCommonHeader;
    }

    /**
     * Define el valor de la propiedad inCommonHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link OutCommonHeader }
     *     
     */
    public void setInCommonHeader(OutCommonHeader value) {
        this.inCommonHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad outEmpleadoModificar.
     * 
     * @return
     *     possible object is
     *     {@link OutEmpleadoModificar }
     *     
     */
    public OutEmpleadoModificar getOutEmpleadoModificar() {
        return outEmpleadoModificar;
    }

    /**
     * Define el valor de la propiedad outEmpleadoModificar.
     * 
     * @param value
     *     allowed object is
     *     {@link OutEmpleadoModificar }
     *     
     */
    public void setOutEmpleadoModificar(OutEmpleadoModificar value) {
        this.outEmpleadoModificar = value;
    }

}
