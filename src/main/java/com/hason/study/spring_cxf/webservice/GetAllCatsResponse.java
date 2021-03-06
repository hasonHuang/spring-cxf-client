
package com.hason.study.spring_cxf.webservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>getAllCatsResponse complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="getAllCatsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://webservice.spring_cxf.study.hason.com/}stringCatMap" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllCatsResponse", propOrder = {
    "_return"
})
public class GetAllCatsResponse {

    @XmlElement(name = "return")
    protected StringCatMap _return;

    /**
     * 获取return属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StringCatMap }
     *     
     */
    public StringCatMap getReturn() {
        return _return;
    }

    /**
     * 设置return属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StringCatMap }
     *     
     */
    public void setReturn(StringCatMap value) {
        this._return = value;
    }

}
