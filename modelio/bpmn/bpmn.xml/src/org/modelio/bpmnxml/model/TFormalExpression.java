/* 
 * Copyright 2013-2020 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.12.02 at 02:29:48 PM CET
//
package org.modelio.bpmnxml.model;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.namespace.QName;

/**
 * <p>Java class for tFormalExpression complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tFormalExpression">
 * &lt;complexContent>
 * &lt;extension base="{http://www.omg.org/spec/BPMN/20100524/MODEL}tExpression">
 * &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 * &lt;attribute name="evaluatesToTypeRef" type="{http://www.w3.org/2001/XMLSchema}QName" />
 * &lt;anyAttribute processContents='lax' namespace='##other'/>
 * &lt;/extension>
 * &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@objid ("03e9c6b7-5c51-4ab6-9076-e67bd78dcb41")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tFormalExpression")
public class TFormalExpression extends TExpression {
    @objid ("7460fe67-591c-4929-91ee-90359a29212c")
    @XmlAttribute(name = "language")
    @XmlSchemaType(name = "anyURI")
    protected String language;

    @objid ("1d85509f-313f-4e80-9ca4-697e01ef22d3")
    @XmlAttribute(name = "evaluatesToTypeRef")
    protected QName evaluatesToTypeRef;

    /**
     * Gets the value of the language property.
     * @return
     * possible object is
     * {@link String }
     */
    @objid ("90c7b2d3-bab8-4574-a59a-0961ee8d2a98")
    public String getLanguage() {
        return this.language;
    }

    /**
     * Sets the value of the language property.
     * @param value allowed object is
     * {@link String }
     */
    @objid ("e4651db4-d35b-4df9-9937-9e7c89b3f7a5")
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the evaluatesToTypeRef property.
     * @return
     * possible object is
     * {@link QName }
     */
    @objid ("30f7a0d3-6ad0-43a4-8d16-ca6d2b51eeac")
    public QName getEvaluatesToTypeRef() {
        return this.evaluatesToTypeRef;
    }

    /**
     * Sets the value of the evaluatesToTypeRef property.
     * @param value allowed object is
     * {@link QName }
     */
    @objid ("b9f97084-ae5d-432c-8e86-965dbf9d9308")
    public void setEvaluatesToTypeRef(QName value) {
        this.evaluatesToTypeRef = value;
    }

}
