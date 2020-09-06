
package gt.gob.banguat.variables.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de DataVariable complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="DataVariable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vars" type="{http://www.banguat.gob.gt/variables/ws/}ArrayOfVar" minOccurs="0"/>
 *         &lt;element name="TotalItems" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataVariable", propOrder = {
    "vars",
    "totalItems"
})
public class DataVariable {

    @XmlElement(name = "Vars")
    protected ArrayOfVar vars;
    @XmlElement(name = "TotalItems")
    protected int totalItems;

    /**
     * Obt�m o valor da propriedade vars.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVar }
     *     
     */
    public ArrayOfVar getVars() {
        return vars;
    }

    /**
     * Define o valor da propriedade vars.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVar }
     *     
     */
    public void setVars(ArrayOfVar value) {
        this.vars = value;
    }

    /**
     * Obt�m o valor da propriedade totalItems.
     * 
     */
    public int getTotalItems() {
        return totalItems;
    }

    /**
     * Define o valor da propriedade totalItems.
     * 
     */
    public void setTotalItems(int value) {
        this.totalItems = value;
    }

}
