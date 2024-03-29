/*******************************************************************************
 * Copyright (c) 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-558 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2008.08.13 at 04:13:48 PM PDT 
//


package org.openhealthtools.ihe.atna.auditor.models.rfc3881;

import org.apache.commons.lang3.StringEscapeUtils;
import org.openhealthtools.ihe.atna.auditor.utils.EventUtils;



/**
 * <p>Java class for TypeValuePairType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TypeValuePairType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="value" use="required" type="{http://www.w3.org/2001/XMLSchema}base64Binary" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "TypeValuePairType")
public class TypeValuePairType {

    //@XmlAttribute(required = true)
    protected String type;
    //@XmlAttribute(required = true)
    protected byte[] value;
    
    public String toString(String tagName, boolean useSpacing)
    {
    	StringBuilder sb = new StringBuilder();
    	sb.append("<").append(tagName);
    	//type
    	if (type != null) {
	    	sb.append(" type=\"");
	    	sb.append(StringEscapeUtils.escapeXml10(type));
	    	sb.append("\"");
    	}
    	//value
    	if (value != null) {
	    	sb.append(" value=\"");
	    	sb.append(StringEscapeUtils.escapeXml10(new String(value)));
	    	sb.append("\"");
    	}
    	sb.append("/>");
    	return sb.toString();
    }
    public String toString(String tagName)
    {
    	return toString(tagName, true);
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**O
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setValue(byte[] value) {
        this.value = EventUtils.encodeBase64(value);
    }

}
