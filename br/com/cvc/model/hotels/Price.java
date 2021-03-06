//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.01 at 01:12:49 AM BRT 
//


package br.com.cvc.model.hotels;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Price complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Price">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minWithTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="minWithoutTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maxWithTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="maxWithoutTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price", propOrder = {
    "minWithTax",
    "minWithoutTax",
    "maxWithTax",
    "maxWithoutTax"
})
public class Price {

    protected BigDecimal minWithTax;
    protected BigDecimal minWithoutTax;
    protected BigDecimal maxWithTax;
    protected BigDecimal maxWithoutTax;

    /**
     * Gets the value of the minWithTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinWithTax() {
        return minWithTax;
    }

    /**
     * Sets the value of the minWithTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinWithTax(BigDecimal value) {
        this.minWithTax = value;
    }

    /**
     * Gets the value of the minWithoutTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMinWithoutTax() {
        return minWithoutTax;
    }

    /**
     * Sets the value of the minWithoutTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMinWithoutTax(BigDecimal value) {
        this.minWithoutTax = value;
    }

    /**
     * Gets the value of the maxWithTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWithTax() {
        return maxWithTax;
    }

    /**
     * Sets the value of the maxWithTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxWithTax(BigDecimal value) {
        this.maxWithTax = value;
    }

    /**
     * Gets the value of the maxWithoutTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxWithoutTax() {
        return maxWithoutTax;
    }

    /**
     * Sets the value of the maxWithoutTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxWithoutTax(BigDecimal value) {
        this.maxWithoutTax = value;
    }

}
