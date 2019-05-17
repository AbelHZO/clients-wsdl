
package com.home.mexico.departamento.operaciones;

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
 *         &lt;element name="DepartamentoListar"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.mexico.home.com/departamento/operaciones/}DepartamentoListarRq"/&gt;
 *                   &lt;element ref="{http://www.mexico.home.com/departamento/operaciones/}DepartamentoListarRs"/&gt;
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
    "departamentoListar"
})
@XmlRootElement(name = "Departamento")
public class Departamento {

    @XmlElement(name = "DepartamentoListar", namespace = "", required = true)
    protected Departamento.DepartamentoListar departamentoListar;

    /**
     * Obtiene el valor de la propiedad departamentoListar.
     * 
     * @return
     *     possible object is
     *     {@link Departamento.DepartamentoListar }
     *     
     */
    public Departamento.DepartamentoListar getDepartamentoListar() {
        return departamentoListar;
    }

    /**
     * Define el valor de la propiedad departamentoListar.
     * 
     * @param value
     *     allowed object is
     *     {@link Departamento.DepartamentoListar }
     *     
     */
    public void setDepartamentoListar(Departamento.DepartamentoListar value) {
        this.departamentoListar = value;
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
     *         &lt;element ref="{http://www.mexico.home.com/departamento/operaciones/}DepartamentoListarRq"/&gt;
     *         &lt;element ref="{http://www.mexico.home.com/departamento/operaciones/}DepartamentoListarRs"/&gt;
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
        "departamentoListarRq",
        "departamentoListarRs"
    })
    public static class DepartamentoListar {

        @XmlElement(name = "DepartamentoListarRq", required = true)
        protected DepartamentoListarRq departamentoListarRq;
        @XmlElement(name = "DepartamentoListarRs", required = true)
        protected DepartamentoListarRs departamentoListarRs;

        /**
         * Obtiene el valor de la propiedad departamentoListarRq.
         * 
         * @return
         *     possible object is
         *     {@link DepartamentoListarRq }
         *     
         */
        public DepartamentoListarRq getDepartamentoListarRq() {
            return departamentoListarRq;
        }

        /**
         * Define el valor de la propiedad departamentoListarRq.
         * 
         * @param value
         *     allowed object is
         *     {@link DepartamentoListarRq }
         *     
         */
        public void setDepartamentoListarRq(DepartamentoListarRq value) {
            this.departamentoListarRq = value;
        }

        /**
         * Obtiene el valor de la propiedad departamentoListarRs.
         * 
         * @return
         *     possible object is
         *     {@link DepartamentoListarRs }
         *     
         */
        public DepartamentoListarRs getDepartamentoListarRs() {
            return departamentoListarRs;
        }

        /**
         * Define el valor de la propiedad departamentoListarRs.
         * 
         * @param value
         *     allowed object is
         *     {@link DepartamentoListarRs }
         *     
         */
        public void setDepartamentoListarRs(DepartamentoListarRs value) {
            this.departamentoListarRs = value;
        }

    }

}
