//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.08.01 at 01:12:49 AM BRT 
//


package br.com.cvc.model.hotels;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="packageGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="rateToken" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="roomIndex" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="priceWithTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="priceWithoutTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pricePerDayWithTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="pricePerDayWithoutTax" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="loyalty" type="{http://cvc.com.br/model/hotels}Loyalty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="taxes" type="{http://cvc.com.br/model/hotels}Tax" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="contents" type="{http://cvc.com.br/model/hotels}Content" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate", propOrder = {
    "packageGroup",
    "rateToken",
    "roomIndex",
    "currency",
    "priceWithTax",
    "priceWithoutTax",
    "pricePerDayWithTax",
    "pricePerDayWithoutTax",
    "loyalty",
    "taxes",
    "contents"
})
public class Rate {

    protected String packageGroup;
    protected Object rateToken;
    protected BigInteger roomIndex;
    protected String currency;
    protected BigDecimal priceWithTax;
    protected BigDecimal priceWithoutTax;
    protected BigDecimal pricePerDayWithTax;
    protected BigDecimal pricePerDayWithoutTax;
    protected List<Loyalty> loyalty;
    protected List<Tax> taxes;
    protected List<Content> contents;

    /**
     * Gets the value of the packageGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageGroup() {
        return packageGroup;
    }

    /**
     * Sets the value of the packageGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageGroup(String value) {
        this.packageGroup = value;
    }

    /**
     * Gets the value of the rateToken property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRateToken() {
        return rateToken;
    }

    /**
     * Sets the value of the rateToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRateToken(Object value) {
        this.rateToken = value;
    }

    /**
     * Gets the value of the roomIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRoomIndex() {
        return roomIndex;
    }

    /**
     * Sets the value of the roomIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRoomIndex(BigInteger value) {
        this.roomIndex = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the priceWithTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceWithTax() {
        return priceWithTax;
    }

    /**
     * Sets the value of the priceWithTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceWithTax(BigDecimal value) {
        this.priceWithTax = value;
    }

    /**
     * Gets the value of the priceWithoutTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPriceWithoutTax() {
        return priceWithoutTax;
    }

    /**
     * Sets the value of the priceWithoutTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPriceWithoutTax(BigDecimal value) {
        this.priceWithoutTax = value;
    }

    /**
     * Gets the value of the pricePerDayWithTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricePerDayWithTax() {
        return pricePerDayWithTax;
    }

    /**
     * Sets the value of the pricePerDayWithTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricePerDayWithTax(BigDecimal value) {
        this.pricePerDayWithTax = value;
    }

    /**
     * Gets the value of the pricePerDayWithoutTax property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPricePerDayWithoutTax() {
        return pricePerDayWithoutTax;
    }

    /**
     * Sets the value of the pricePerDayWithoutTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPricePerDayWithoutTax(BigDecimal value) {
        this.pricePerDayWithoutTax = value;
    }

    /**
     * Gets the value of the loyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Loyalty }
     * 
     * 
     */
    public List<Loyalty> getLoyalty() {
        if (loyalty == null) {
            loyalty = new ArrayList<Loyalty>();
        }
        return this.loyalty;
    }

    /**
     * Gets the value of the taxes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax }
     * 
     * 
     */
    public List<Tax> getTaxes() {
        if (taxes == null) {
            taxes = new ArrayList<Tax>();
        }
        return this.taxes;
    }

    /**
     * Gets the value of the contents property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contents property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContents().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Content }
     * 
     * 
     */
    public List<Content> getContents() {
        if (contents == null) {
            contents = new ArrayList<Content>();
        }
        return this.contents;
    }

}
