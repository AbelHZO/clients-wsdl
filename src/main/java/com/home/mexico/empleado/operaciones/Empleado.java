
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
 *         &lt;element name="EmpleadoGuardar"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoGuardarRq"/&gt;
 *                   &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoGuardarRs"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EmpleadoBuscar"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoBuscarRq"/&gt;
 *                   &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoBuscarRs"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EmpleadoListar"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoListarRq"/&gt;
 *                   &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoListarRs"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="EmpleadoModificar"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoModificarRq"/&gt;
 *                   &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoModificarRs"/&gt;
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
    "empleadoGuardar",
    "empleadoBuscar",
    "empleadoListar",
    "empleadoModificar"
})
@XmlRootElement(name = "Empleado")
public class Empleado {

    @XmlElement(name = "EmpleadoGuardar", namespace = "", required = true)
    protected Empleado.EmpleadoGuardar empleadoGuardar;
    @XmlElement(name = "EmpleadoBuscar", namespace = "", required = true)
    protected Empleado.EmpleadoBuscar empleadoBuscar;
    @XmlElement(name = "EmpleadoListar", namespace = "", required = true)
    protected Empleado.EmpleadoListar empleadoListar;
    @XmlElement(name = "EmpleadoModificar", namespace = "", required = true)
    protected Empleado.EmpleadoModificar empleadoModificar;

    /**
     * Obtiene el valor de la propiedad empleadoGuardar.
     * 
     * @return
     *     possible object is
     *     {@link Empleado.EmpleadoGuardar }
     *     
     */
    public Empleado.EmpleadoGuardar getEmpleadoGuardar() {
        return empleadoGuardar;
    }

    /**
     * Define el valor de la propiedad empleadoGuardar.
     * 
     * @param value
     *     allowed object is
     *     {@link Empleado.EmpleadoGuardar }
     *     
     */
    public void setEmpleadoGuardar(Empleado.EmpleadoGuardar value) {
        this.empleadoGuardar = value;
    }

    /**
     * Obtiene el valor de la propiedad empleadoBuscar.
     * 
     * @return
     *     possible object is
     *     {@link Empleado.EmpleadoBuscar }
     *     
     */
    public Empleado.EmpleadoBuscar getEmpleadoBuscar() {
        return empleadoBuscar;
    }

    /**
     * Define el valor de la propiedad empleadoBuscar.
     * 
     * @param value
     *     allowed object is
     *     {@link Empleado.EmpleadoBuscar }
     *     
     */
    public void setEmpleadoBuscar(Empleado.EmpleadoBuscar value) {
        this.empleadoBuscar = value;
    }

    /**
     * Obtiene el valor de la propiedad empleadoListar.
     * 
     * @return
     *     possible object is
     *     {@link Empleado.EmpleadoListar }
     *     
     */
    public Empleado.EmpleadoListar getEmpleadoListar() {
        return empleadoListar;
    }

    /**
     * Define el valor de la propiedad empleadoListar.
     * 
     * @param value
     *     allowed object is
     *     {@link Empleado.EmpleadoListar }
     *     
     */
    public void setEmpleadoListar(Empleado.EmpleadoListar value) {
        this.empleadoListar = value;
    }

    /**
     * Obtiene el valor de la propiedad empleadoModificar.
     * 
     * @return
     *     possible object is
     *     {@link Empleado.EmpleadoModificar }
     *     
     */
    public Empleado.EmpleadoModificar getEmpleadoModificar() {
        return empleadoModificar;
    }

    /**
     * Define el valor de la propiedad empleadoModificar.
     * 
     * @param value
     *     allowed object is
     *     {@link Empleado.EmpleadoModificar }
     *     
     */
    public void setEmpleadoModificar(Empleado.EmpleadoModificar value) {
        this.empleadoModificar = value;
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
     *         &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoBuscarRq"/&gt;
     *         &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoBuscarRs"/&gt;
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
        "empleadoBuscarRq",
        "empleadoBuscarRs"
    })
    public static class EmpleadoBuscar {

        @XmlElement(name = "EmpleadoBuscarRq", required = true)
        protected EmpleadoBuscarRq empleadoBuscarRq;
        @XmlElement(name = "EmpleadoBuscarRs", required = true)
        protected EmpleadoBuscarRs empleadoBuscarRs;

        /**
         * Obtiene el valor de la propiedad empleadoBuscarRq.
         * 
         * @return
         *     possible object is
         *     {@link EmpleadoBuscarRq }
         *     
         */
        public EmpleadoBuscarRq getEmpleadoBuscarRq() {
            return empleadoBuscarRq;
        }

        /**
         * Define el valor de la propiedad empleadoBuscarRq.
         * 
         * @param value
         *     allowed object is
         *     {@link EmpleadoBuscarRq }
         *     
         */
        public void setEmpleadoBuscarRq(EmpleadoBuscarRq value) {
            this.empleadoBuscarRq = value;
        }

        /**
         * Obtiene el valor de la propiedad empleadoBuscarRs.
         * 
         * @return
         *     possible object is
         *     {@link EmpleadoBuscarRs }
         *     
         */
        public EmpleadoBuscarRs getEmpleadoBuscarRs() {
            return empleadoBuscarRs;
        }

        /**
         * Define el valor de la propiedad empleadoBuscarRs.
         * 
         * @param value
         *     allowed object is
         *     {@link EmpleadoBuscarRs }
         *     
         */
        public void setEmpleadoBuscarRs(EmpleadoBuscarRs value) {
            this.empleadoBuscarRs = value;
        }

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
     *         &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoGuardarRq"/&gt;
     *         &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoGuardarRs"/&gt;
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
        "empleadoGuardarRq",
        "empleadoGuardarRs"
    })
    public static class EmpleadoGuardar {

        @XmlElement(name = "EmpleadoGuardarRq", required = true)
        protected EmpleadoGuardarRq empleadoGuardarRq;
        @XmlElement(name = "EmpleadoGuardarRs", required = true)
        protected EmpleadoGuardarRs empleadoGuardarRs;

        /**
         * Obtiene el valor de la propiedad empleadoGuardarRq.
         * 
         * @return
         *     possible object is
         *     {@link EmpleadoGuardarRq }
         *     
         */
        public EmpleadoGuardarRq getEmpleadoGuardarRq() {
            return empleadoGuardarRq;
        }

        /**
         * Define el valor de la propiedad empleadoGuardarRq.
         * 
         * @param value
         *     allowed object is
         *     {@link EmpleadoGuardarRq }
         *     
         */
        public void setEmpleadoGuardarRq(EmpleadoGuardarRq value) {
            this.empleadoGuardarRq = value;
        }

        /**
         * Obtiene el valor de la propiedad empleadoGuardarRs.
         * 
         * @return
         *     possible object is
         *     {@link EmpleadoGuardarRs }
         *     
         */
        public EmpleadoGuardarRs getEmpleadoGuardarRs() {
            return empleadoGuardarRs;
        }

        /**
         * Define el valor de la propiedad empleadoGuardarRs.
         * 
         * @param value
         *     allowed object is
         *     {@link EmpleadoGuardarRs }
         *     
         */
        public void setEmpleadoGuardarRs(EmpleadoGuardarRs value) {
            this.empleadoGuardarRs = value;
        }

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
     *         &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoListarRq"/&gt;
     *         &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoListarRs"/&gt;
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
        "empleadoListarRq",
        "empleadoListarRs"
    })
    public static class EmpleadoListar {

        @XmlElement(name = "EmpleadoListarRq", required = true)
        protected EmpleadoListarRq empleadoListarRq;
        @XmlElement(name = "EmpleadoListarRs", required = true)
        protected EmpleadoListarRs empleadoListarRs;

        /**
         * Obtiene el valor de la propiedad empleadoListarRq.
         * 
         * @return
         *     possible object is
         *     {@link EmpleadoListarRq }
         *     
         */
        public EmpleadoListarRq getEmpleadoListarRq() {
            return empleadoListarRq;
        }

        /**
         * Define el valor de la propiedad empleadoListarRq.
         * 
         * @param value
         *     allowed object is
         *     {@link EmpleadoListarRq }
         *     
         */
        public void setEmpleadoListarRq(EmpleadoListarRq value) {
            this.empleadoListarRq = value;
        }

        /**
         * Obtiene el valor de la propiedad empleadoListarRs.
         * 
         * @return
         *     possible object is
         *     {@link EmpleadoListarRs }
         *     
         */
        public EmpleadoListarRs getEmpleadoListarRs() {
            return empleadoListarRs;
        }

        /**
         * Define el valor de la propiedad empleadoListarRs.
         * 
         * @param value
         *     allowed object is
         *     {@link EmpleadoListarRs }
         *     
         */
        public void setEmpleadoListarRs(EmpleadoListarRs value) {
            this.empleadoListarRs = value;
        }

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
     *         &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoModificarRq"/&gt;
     *         &lt;element ref="{http://www.mexico.home.com/empleado/operaciones/}EmpleadoModificarRs"/&gt;
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
        "empleadoModificarRq",
        "empleadoModificarRs"
    })
    public static class EmpleadoModificar {

        @XmlElement(name = "EmpleadoModificarRq", required = true)
        protected EmpleadoModificarRq empleadoModificarRq;
        @XmlElement(name = "EmpleadoModificarRs", required = true)
        protected EmpleadoModificarRs empleadoModificarRs;

        /**
         * Obtiene el valor de la propiedad empleadoModificarRq.
         * 
         * @return
         *     possible object is
         *     {@link EmpleadoModificarRq }
         *     
         */
        public EmpleadoModificarRq getEmpleadoModificarRq() {
            return empleadoModificarRq;
        }

        /**
         * Define el valor de la propiedad empleadoModificarRq.
         * 
         * @param value
         *     allowed object is
         *     {@link EmpleadoModificarRq }
         *     
         */
        public void setEmpleadoModificarRq(EmpleadoModificarRq value) {
            this.empleadoModificarRq = value;
        }

        /**
         * Obtiene el valor de la propiedad empleadoModificarRs.
         * 
         * @return
         *     possible object is
         *     {@link EmpleadoModificarRs }
         *     
         */
        public EmpleadoModificarRs getEmpleadoModificarRs() {
            return empleadoModificarRs;
        }

        /**
         * Define el valor de la propiedad empleadoModificarRs.
         * 
         * @param value
         *     allowed object is
         *     {@link EmpleadoModificarRs }
         *     
         */
        public void setEmpleadoModificarRs(EmpleadoModificarRs value) {
            this.empleadoModificarRs = value;
        }

    }

}
