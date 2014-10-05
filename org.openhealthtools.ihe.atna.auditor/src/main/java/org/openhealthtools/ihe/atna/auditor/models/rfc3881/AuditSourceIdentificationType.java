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

import org.apache.commons.lang.StringEscapeUtils;


/**
 * <p>Java class for AuditSourceIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuditSourceIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuditSourceTypeCode" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{}CodedValueType">
 *                 &lt;attribute name="code" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="1"/>
 *                       &lt;enumeration value="2"/>
 *                       &lt;enumeration value="3"/>
 *                       &lt;enumeration value="4"/>
 *                       &lt;enumeration value="5"/>
 *                       &lt;enumeration value="6"/>
 *                       &lt;enumeration value="7"/>
 *                       &lt;enumeration value="8"/>
 *                       &lt;enumeration value="9"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AuditEnterpriseSiteID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AuditSourceID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "AuditSourceIdentificationType", propOrder = { "auditSourceTypeCode" })
public class AuditSourceIdentificationType {

    //@XmlElement(name = "AuditSourceTypeCode")
    protected CodedValueType auditSourceTypeCode;
    //@XmlAttribute(name = "AuditEnterpriseSiteID")
    protected String auditEnterpriseSiteID;
    //@XmlAttribute(name = "AuditSourceID", required = true)
    protected String auditSourceID;

    public String toString(boolean useSpacing)
    {
    	StringBuilder sb = new StringBuilder();
    	if (useSpacing) {
    		sb.append("\n");
    	}
    	sb.append("<AuditSourceIdentification");
        if (auditSourceTypeCode == null) {
            sb.append(" code=\"9\"");       // use "other" as the default event source type
        } else {
            sb.append(" code=\"")
              .append(StringEscapeUtils.escapeXml(auditSourceTypeCode.getCode()))
              .append('"');
            if (auditSourceTypeCode.getCodeSystemName() != null) {
                sb.append(" codeSystemName=\"")
                  .append(StringEscapeUtils.escapeXml(auditSourceTypeCode.getCodeSystemName()))
                  .append('"');
            }
            if (auditSourceTypeCode.getOriginalText() != null) {
                sb.append(" originalText=\"")
                  .append(StringEscapeUtils.escapeXml(auditSourceTypeCode.getOriginalText()))
                  .append('"');
            }
        }

    	//AuditEnterpriseSiteID
    	if (auditEnterpriseSiteID != null) {
	    	sb.append(" AuditEnterpriseSiteID=\"");
	    	sb.append(StringEscapeUtils.escapeXml(auditEnterpriseSiteID));
	    	sb.append("\"");
    	}

    	//AuditSourceID
        sb.append(" AuditSourceID=\"");
        if ((auditSourceID != null) && ! auditSourceID.isEmpty()) {
            sb.append(StringEscapeUtils.escapeXml(auditSourceID));
        } else {
            sb.append("unknown");
        }
        sb.append("\"");

        sb.append("/>");
    	return sb.toString();
    }
    
    public String toString()
    {
    	return toString(true);
    }

    /**
     * Gets the value of the auditSourceTypeCode property.
     */
    public CodedValueType getAuditSourceTypeCode() {
        return this.auditSourceTypeCode;
    }

    /**
     * Sets the value of the auditSourceTypeCode property.
     */
    public void setAuditSourceTypeCode(CodedValueType auditSourceTypeCode) {
        this.auditSourceTypeCode = auditSourceTypeCode;
    }

    /**
     * Gets the value of the auditEnterpriseSiteID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditEnterpriseSiteID() {
        return auditEnterpriseSiteID;
    }

    /**
     * Sets the value of the auditEnterpriseSiteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditEnterpriseSiteID(String value) {
        this.auditEnterpriseSiteID = value;
    }

    /**
     * Gets the value of the auditSourceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuditSourceID() {
        return auditSourceID;
    }

    /**
     * Sets the value of the auditSourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuditSourceID(String value) {
        this.auditSourceID = value;
    }

}
