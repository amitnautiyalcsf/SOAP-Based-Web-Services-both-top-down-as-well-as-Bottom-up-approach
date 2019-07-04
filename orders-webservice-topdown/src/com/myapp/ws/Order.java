
package com.myapp.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.joda.time.LocalDate;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Java class for Order complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Order"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="productId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *           &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *           &lt;element name="imageUrl" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *           &lt;element name="availability" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Order", propOrder = {
    "productId",
    "productName",
    "description",
    "price",
    "imageUrl",
    "availability",
    "rating"
})
public class Order {

    protected int productId;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected String description;
    protected double price;
    @XmlElement(required = true)
    protected String imageUrl;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate availability;
    protected double rating;

    
    public Order() {
		// TODO Auto-generated constructor stub
	}
    
    
    
    
    public Order(int productId, String productName, String description, double price, String imageUrl,
			LocalDate availability, double rating) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.imageUrl = imageUrl;
		this.availability = availability;
		this.rating = rating;
	}




	/**
     * Gets the value of the productId property.
     * 
     */
    public int getProductId() {
        return productId;
    }

    /**
     * Sets the value of the productId property.
     * 
     */
    public void setProductId(int value) {
        this.productId = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the price property.
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * Gets the value of the imageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     * Sets the value of the imageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImageUrl(String value) {
        this.imageUrl = value;
    }

    /**
     * Gets the value of the availability property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getAvailability() {
        return availability;
    }

    /**
     * Sets the value of the availability property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAvailability(LocalDate value) {
        this.availability = value;
    }

    /**
     * Gets the value of the rating property.
     * 
     */
    public double getRating() {
        return rating;
    }

    /**
     * Sets the value of the rating property.
     * 
     */
    public void setRating(double value) {
        this.rating = value;
    }

}
