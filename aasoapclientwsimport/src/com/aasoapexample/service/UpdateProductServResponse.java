
package com.aasoapexample.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateProductServResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateProductServResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Product" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateProductServResponse", propOrder = {
    "product"
})
public class UpdateProductServResponse {

    @XmlElement(name = "Product")
    protected boolean product;

    /**
     * Gets the value of the product property.
     * 
     */
    public boolean isProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     */
    public void setProduct(boolean value) {
        this.product = value;
    }

}
