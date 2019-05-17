
package com.home.mexico.departamento.operaciones;

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
 *         &lt;element ref="{http://www.mexico.home.com/departamento/operaciones/}Out_DepartamentoListar"/&gt;
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
    "outDepartamentoListar"
})
@XmlRootElement(name = "DepartamentoListarRs")
public class DepartamentoListarRs {

    @XmlElement(name = "Out_CommonHeader", required = true)
    protected OutCommonHeader outCommonHeader;
    @XmlElement(name = "Out_DepartamentoListar", required = true)
    protected OutDepartamentoListar outDepartamentoListar;

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
     * Obtiene el valor de la propiedad outDepartamentoListar.
     * 
     * @return
     *     possible object is
     *     {@link OutDepartamentoListar }
     *     
     */
    public OutDepartamentoListar getOutDepartamentoListar() {
        return outDepartamentoListar;
    }

    /**
     * Define el valor de la propiedad outDepartamentoListar.
     * 
     * @param value
     *     allowed object is
     *     {@link OutDepartamentoListar }
     *     
     */
    public void setOutDepartamentoListar(OutDepartamentoListar value) {
        this.outDepartamentoListar = value;
    }

}
