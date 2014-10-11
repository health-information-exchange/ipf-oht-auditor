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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringEscapeUtils;
import org.openhealthtools.ihe.atna.auditor.utils.EventUtils;


/**
 * <p>Java class for ParticipantObjectIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantObjectIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParticipantObjectIDTypeCode">
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
 *                       &lt;enumeration value="10"/>
 *                       &lt;enumeration value="11"/>
 *                       &lt;enumeration value="12"/>
 *                       &lt;enumeration value=""/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="ParticipantObjectName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *           &lt;element name="ParticipantObjectQuery" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="ParticipantObjectDetail" type="{}TypeValuePairType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ParticipantObjectID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ParticipantObjectTypeCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="4"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ParticipantObjectTypeCodeRole">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="4"/>
 *             &lt;enumeration value="5"/>
 *             &lt;enumeration value="6"/>
 *             &lt;enumeration value="7"/>
 *             &lt;enumeration value="8"/>
 *             &lt;enumeration value="9"/>
 *             &lt;enumeration value="10"/>
 *             &lt;enumeration value="11"/>
 *             &lt;enumeration value="12"/>
 *             &lt;enumeration value="13"/>
 *             &lt;enumeration value="14"/>
 *             &lt;enumeration value="15"/>
 *             &lt;enumeration value="16"/>
 *             &lt;enumeration value="17"/>
 *             &lt;enumeration value="18"/>
 *             &lt;enumeration value="19"/>
 *             &lt;enumeration value="20"/>
 *             &lt;enumeration value="21"/>
 *             &lt;enumeration value="22"/>
 *             &lt;enumeration value="23"/>
 *             &lt;enumeration value="24"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ParticipantObjectDataLifeCycle">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}unsignedByte">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="4"/>
 *             &lt;enumeration value="5"/>
 *             &lt;enumeration value="6"/>
 *             &lt;enumeration value="7"/>
 *             &lt;enumeration value="8"/>
 *             &lt;enumeration value="9"/>
 *             &lt;enumeration value="10"/>
 *             &lt;enumeration value="11"/>
 *             &lt;enumeration value="12"/>
 *             &lt;enumeration value="13"/>
 *             &lt;enumeration value="14"/>
 *             &lt;enumeration value="15"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ParticipantObjectSensitivity" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
//@XmlType(name = "ParticipantObjectIdentificationType", propOrder = {
//    "participantObjectIDTypeCode",
//    "participantObjectName",
//    "participantObjectQuery",
//    "participantObjectDetail"
//})
public class ParticipantObjectIdentificationType {

    //@XmlElement(name = "ParticipantObjectIDTypeCode", required = true)
    protected CodedValueType participantObjectIDTypeCode;
    //@XmlElement(name = "ParticipantObjectName")
    protected String participantObjectName;
    //@XmlElement(name = "ParticipantObjectQuery")
    protected byte[] participantObjectQuery;
    //@XmlElement(name = "ParticipantObjectDetail")
    protected List<TypeValuePairType> participantObjectDetail;
    //@XmlAttribute(name = "ParticipantObjectID", required = true)
    protected String participantObjectID;
    //@XmlAttribute(name = "ParticipantObjectTypeCode")
    protected Short participantObjectTypeCode;
    //@XmlAttribute(name = "ParticipantObjectTypeCodeRole")
    protected Short participantObjectTypeCodeRole;
    //@XmlAttribute(name = "ParticipantObjectDataLifeCycle")
    protected Short participantObjectDataLifeCycle;
    //@XmlAttribute(name = "ParticipantObjectSensitivity")
    protected String participantObjectSensitivity;

    
    public String toString(boolean useSpacing)
    {
    	boolean hasChildElement = false;
    	if (!EventUtils.isEmptyOrNull(participantObjectIDTypeCode)
    			|| !EventUtils.isEmptyOrNull(participantObjectName)
    			|| !EventUtils.isEmptyOrNull(participantObjectQuery)
    			|| !EventUtils.isEmptyOrNull(participantObjectDetail)) {
    		hasChildElement = true;
    	}
    	
    	StringBuffer sb = new StringBuffer();
    	if (useSpacing) {
    		sb.append("\n");
    	}
    	sb.append("<ParticipantObjectIdentification");
    	
    	//ParticipantObjectID
    	sb.append(" ParticipantObjectID=\"");
    	
    	if (!EventUtils.isEmptyOrNull(participantObjectID)) {
    		sb.append(StringEscapeUtils.escapeXml(participantObjectID));
    	}
    	sb.append("\"");
    	
    	//ParticipantObjectTypeCode
    	if (participantObjectTypeCode != null) {
	    	sb.append(" ParticipantObjectTypeCode=\"");
	    	sb.append(participantObjectTypeCode);
	    	sb.append("\"");
    	}
    	//ParticipantObjectTypeCodeRole
    	if (participantObjectTypeCodeRole != null) {
	    	sb.append(" ParticipantObjectTypeCodeRole=\"");
	    	sb.append(participantObjectTypeCodeRole);
	    	sb.append("\"");
    	}
    	//ParticipantObjectDataLifeCycle
    	if (participantObjectDataLifeCycle != null) {
	    	sb.append(" ParticipantObjectDataLifeCycle=\"");
	    	sb.append(participantObjectDataLifeCycle);
	    	sb.append("\"");
    	}
    	//ParticipantObjectSensitivity
    	if (participantObjectSensitivity != null) {
	    	sb.append(" ParticipantObjectSensitivity=\"");
	    	sb.append(StringEscapeUtils.escapeXml(participantObjectSensitivity));
	    	sb.append("\"");
    	}
    	
    	if (!hasChildElement) {
    		sb.append("/>");
    	} else {
    		sb.append(">");
    		if (!EventUtils.isEmptyOrNull(participantObjectIDTypeCode)) {
    	    	if (useSpacing) {
    	    		sb.append("\n");
    	    	}
    			sb.append(participantObjectIDTypeCode.toString("ParticipantObjectIDTypeCode"));
    		}
    		if (!EventUtils.isEmptyOrNull(participantObjectName)) {
    	    	if (useSpacing) {
    	    		sb.append("\n");
    	    	}
    			sb.append("<ParticipantObjectName>");
    			sb.append(StringEscapeUtils.escapeXml(participantObjectName));
    			sb.append("</ParticipantObjectName>");
    		}
    		if (!EventUtils.isEmptyOrNull(participantObjectQuery)) {
    	    	if (useSpacing) {
    	    		sb.append("\n");
    	    	}
    			sb.append("<ParticipantObjectQuery>");
    			sb.append(StringEscapeUtils.escapeXml(new String(EventUtils.encodeBase64(participantObjectQuery))));
    			sb.append("</ParticipantObjectQuery>");
    		}
//            if (EventUtils.isEmptyOrNull(participantObjectName) && EventUtils.isEmptyOrNull(participantObjectQuery)) {
//                sb.append("<ParticipantObjectName/>");
//            }
    		if (!EventUtils.isEmptyOrNull(participantObjectDetail)) {
        		Iterator<TypeValuePairType> i = participantObjectDetail.iterator();
        		while (i.hasNext()) {
        	    	if (useSpacing) {
        	    		sb.append("\n");
        	    	}
        			sb.append(i.next().toString("ParticipantObjectDetail", useSpacing));
        		}
    		}

//            sb.append("\n<SOPClass UID=\"unknown\" NumberOfInstances=\"0\"/>");
//            sb.append("\n<ParticipantObjectContainsStudy/>");

        	if (useSpacing) {
        		sb.append("\n");
        	}
	    	sb.append("</ParticipantObjectIdentification>");
    	}
    	return sb.toString();
    }
    
    public String toString()
    {
    	return toString(true);
    }
    
    /**
     * Gets the value of the participantObjectIDTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantObjectIdentificationType.ParticipantObjectIDTypeCode }
     *     
     */
    public CodedValueType getParticipantObjectIDTypeCode() {
        return participantObjectIDTypeCode;
    }

    /**
     * Sets the value of the participantObjectIDTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantObjectIdentificationType.ParticipantObjectIDTypeCode }
     *     
     */
    public void setParticipantObjectIDTypeCode(CodedValueType value) {
        this.participantObjectIDTypeCode = value;
    }

    /**
     * Gets the value of the participantObjectName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantObjectName() {
        return participantObjectName;
    }

    /**
     * Sets the value of the participantObjectName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantObjectName(String value) {
        this.participantObjectName = value;
    }

    /**
     * Gets the value of the participantObjectQuery property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getParticipantObjectQuery() {
        return participantObjectQuery;
    }

    /**
     * Sets the value of the participantObjectQuery property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setParticipantObjectQuery(byte[] value) {
        this.participantObjectQuery = ((byte[]) value);
    }

    /**
     * Gets the value of the participantObjectDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participantObjectDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipantObjectDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeValuePairType }
     * 
     * 
     */
    public List<TypeValuePairType> getParticipantObjectDetail() {
        if (participantObjectDetail == null) {
            participantObjectDetail = new ArrayList<TypeValuePairType>();
        }
        return this.participantObjectDetail;
    }

    /**
     * Gets the value of the participantObjectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantObjectID() {
        return participantObjectID;
    }

    /**
     * Sets the value of the participantObjectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantObjectID(String value) {
        this.participantObjectID = value;
    }

    /**
     * Gets the value of the participantObjectTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getParticipantObjectTypeCode() {
        return participantObjectTypeCode;
    }

    /**
     * Sets the value of the participantObjectTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setParticipantObjectTypeCode(Short value) {
        this.participantObjectTypeCode = value;
    }

    /**
     * Gets the value of the participantObjectTypeCodeRole property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getParticipantObjectTypeCodeRole() {
        return participantObjectTypeCodeRole;
    }

    /**
     * Sets the value of the participantObjectTypeCodeRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setParticipantObjectTypeCodeRole(Short value) {
        this.participantObjectTypeCodeRole = value;
    }

    /**
     * Gets the value of the participantObjectDataLifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getParticipantObjectDataLifeCycle() {
        return participantObjectDataLifeCycle;
    }

    /**
     * Sets the value of the participantObjectDataLifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setParticipantObjectDataLifeCycle(Short value) {
        this.participantObjectDataLifeCycle = value;
    }

    /**
     * Gets the value of the participantObjectSensitivity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantObjectSensitivity() {
        return participantObjectSensitivity;
    }

    /**
     * Sets the value of the participantObjectSensitivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantObjectSensitivity(String value) {
        this.participantObjectSensitivity = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{}CodedValueType">
     *       &lt;attribute name="code" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="1"/>
     *             &lt;enumeration value="2"/>
     *             &lt;enumeration value="3"/>
     *             &lt;enumeration value="4"/>
     *             &lt;enumeration value="5"/>
     *             &lt;enumeration value="6"/>
     *             &lt;enumeration value="7"/>
     *             &lt;enumeration value="8"/>
     *             &lt;enumeration value="9"/>
     *             &lt;enumeration value="10"/>
     *             &lt;enumeration value="11"/>
     *             &lt;enumeration value="12"/>
     *             &lt;enumeration value=""/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
//    @XmlAccessorType(XmlAccessType.FIELD)
//    @XmlType(name = "")
//    public static class ParticipantObjectIDTypeCode
//        extends CodedValueType
//    {
//
//
//    }

}
