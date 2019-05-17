
package com.home.mexico.departamento.operaciones;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="departamento" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="idDepto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                   &lt;element name="departamento"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="30"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "departamento"
})
@XmlRootElement(name = "Out_DepartamentoListar")
public class OutDepartamentoListar {

    @XmlElement(required = true)
    protected List<OutDepartamentoListar.Departamento> departamento;

    /**
     * Gets the value of the departamento property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departamento property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartamento().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OutDepartamentoListar.Departamento }
     * 
     * 
     */
    public List<OutDepartamentoListar.Departamento> getDepartamento() {
        if (departamento == null) {
            departamento = new ArrayList<OutDepartamentoListar.Departamento>();
        }
        return this.departamento;
    }


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
     *         &lt;element name="idDepto" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *         &lt;element name="departamento"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="30"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
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
        "idDepto",
        "departamento"
    })
    public static class Departamento {

        protected int idDepto;
        @XmlElement(required = true)
        protected String departamento;

        /**
         * Obtiene el valor de la propiedad idDepto.
         * 
         */
        public int getIdDepto() {
            return idDepto;
        }

        /**
         * Define el valor de la propiedad idDepto.
         * 
         */
        public void setIdDepto(int value) {
            this.idDepto = value;
        }

        /**
         * Obtiene el valor de la propiedad departamento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDepartamento() {
            return departamento;
        }

        /**
         * Define el valor de la propiedad departamento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDepartamento(String value) {
            this.departamento = value;
        }

    }

}
