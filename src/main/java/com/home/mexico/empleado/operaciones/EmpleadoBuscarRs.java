
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
 *         &lt;element name="Out_CommonHeader" type="{http://www.mexico.home.com/abelhzo/common/}Out_CommonHeader"/&gt;
 *         &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}Out_EmpleadoBuscar"/&gt;
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
    "outCommonHeader",
    "outEmpleadoBuscar"
})
@XmlRootElement(name = "EmpleadoBuscarRs")
public class EmpleadoBuscarRs {

    @XmlElement(name = "Out_CommonHeader", required = true)
    protected OutCommonHeader outCommonHeader;
    @XmlElement(name = "Out_EmpleadoBuscar", required = true)
    protected OutEmpleadoBuscar outEmpleadoBuscar;

    /**
     * Obtiene el valor de la propiedad outCommonHeader.
     * 
     * @return
     *     possible object is
     *     {@link OutCommonHeader }
     *     
     */
    public OutCommonHeader getOutCommonHeader() {
        return outCommonHeader;
    }

    /**
     * Define el valor de la propiedad outCommonHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link OutCommonHeader }
     *     
     */
    public void setOutCommonHeader(OutCommonHeader value) {
        this.outCommonHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad outEmpleadoBuscar.
     * 
     * @return
     *     possible object is
     *     {@link OutEmpleadoBuscar }
     *     
     */
    public OutEmpleadoBuscar getOutEmpleadoBuscar() {
        return outEmpleadoBuscar;
    }

    /**
     * Define el valor de la propiedad outEmpleadoBuscar.
     * 
     * @param value
     *     allowed object is
     *     {@link OutEmpleadoBuscar }
     *     
     */
    public void setOutEmpleadoBuscar(OutEmpleadoBuscar value) {
        this.outEmpleadoBuscar = value;
    }

}
