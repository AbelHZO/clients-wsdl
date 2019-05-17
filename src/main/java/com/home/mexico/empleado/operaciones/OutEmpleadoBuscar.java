
package com.home.mexico.empleado.operaciones;

import java.math.BigInteger;
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
 *         &lt;element name="IdEmpleado" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Nombre"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *               &lt;pattern value="[A-Z][a-z]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Edad" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Telefono" maxOccurs="unbounded"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="10"/&gt;
 *               &lt;pattern value="[0-9]*"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Departamento"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="IdDepto" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *                   &lt;element name="Departamento"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="SISTEMAS"/&gt;
 *                         &lt;enumeration value="VENTAS"/&gt;
 *                         &lt;enumeration value="MARKETING"/&gt;
 *                         &lt;enumeration value="RH"/&gt;
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
    "idEmpleado",
    "nombre",
    "edad",
    "telefono",
    "departamento"
})
@XmlRootElement(name = "Out_EmpleadoBuscar")
public class OutEmpleadoBuscar {

    @XmlElement(name = "IdEmpleado", required = true)
    protected BigInteger idEmpleado;
    @XmlElement(name = "Nombre", required = true)
    protected String nombre;
    @XmlElement(name = "Edad", required = true)
    protected BigInteger edad;
    @XmlElement(name = "Telefono", required = true)
    protected List<String> telefono;
    @XmlElement(name = "Departamento", required = true)
    protected OutEmpleadoBuscar.Departamento departamento;

    /**
     * Obtiene el valor de la propiedad idEmpleado.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Define el valor de la propiedad idEmpleado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdEmpleado(BigInteger value) {
        this.idEmpleado = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad edad.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEdad() {
        return edad;
    }

    /**
     * Define el valor de la propiedad edad.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEdad(BigInteger value) {
        this.edad = value;
    }

    /**
     * Gets the value of the telefono property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telefono property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelefono().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTelefono() {
        if (telefono == null) {
            telefono = new ArrayList<String>();
        }
        return this.telefono;
    }

    /**
     * Obtiene el valor de la propiedad departamento.
     * 
     * @return
     *     possible object is
     *     {@link OutEmpleadoBuscar.Departamento }
     *     
     */
    public OutEmpleadoBuscar.Departamento getDepartamento() {
        return departamento;
    }

    /**
     * Define el valor de la propiedad departamento.
     * 
     * @param value
     *     allowed object is
     *     {@link OutEmpleadoBuscar.Departamento }
     *     
     */
    public void setDepartamento(OutEmpleadoBuscar.Departamento value) {
        this.departamento = value;
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
     *         &lt;element name="IdDepto" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
     *         &lt;element name="Departamento"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="SISTEMAS"/&gt;
     *               &lt;enumeration value="VENTAS"/&gt;
     *               &lt;enumeration value="MARKETING"/&gt;
     *               &lt;enumeration value="RH"/&gt;
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

        @XmlElement(name = "IdDepto", required = true)
        protected BigInteger idDepto;
        @XmlElement(name = "Departamento", required = true)
        protected String departamento;

        /**
         * Obtiene el valor de la propiedad idDepto.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIdDepto() {
            return idDepto;
        }

        /**
         * Define el valor de la propiedad idDepto.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIdDepto(BigInteger value) {
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
