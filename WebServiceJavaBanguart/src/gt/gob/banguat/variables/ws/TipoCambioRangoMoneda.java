
package gt.gob.banguat.variables.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fechainit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fechafin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="moneda" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fechainit",
    "fechafin",
    "moneda"
})
@XmlRootElement(name = "TipoCambioRangoMoneda")
public class TipoCambioRangoMoneda {

    protected String fechainit;
    protected String fechafin;
    protected int moneda;

    /**
     * Obt�m o valor da propriedade fechainit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechainit() {
        return fechainit;
    }

    /**
     * Define o valor da propriedade fechainit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechainit(String value) {
        this.fechainit = value;
    }

    /**
     * Obt�m o valor da propriedade fechafin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechafin() {
        return fechafin;
    }

    /**
     * Define o valor da propriedade fechafin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechafin(String value) {
        this.fechafin = value;
    }

    /**
     * Obt�m o valor da propriedade moneda.
     * 
     */
    public int getMoneda() {
        return moneda;
    }

    /**
     * Define o valor da propriedade moneda.
     * 
     */
    public void setMoneda(int value) {
        this.moneda = value;
    }

}
