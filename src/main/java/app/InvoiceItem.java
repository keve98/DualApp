package app;

import javax.persistence.*;
import java.io.Serializable;

@Table(name ="INVOICEITEM")
@Entity
public class InvoiceItem implements Serializable {
    @Id
    @Column(name ="ID")
    private Integer id;

    @Column(name = "PRODUCTNAME")
    private String productName;

    @Column(name = "UNITPRICE")
    private Integer unitPrice;

    @Column(name = "QUANTITY")
    private Integer quantity;

    @Column(name = "TOTALITEMPRICE")
    private Integer totalItemPrice;

    @Column(name ="INVOICEID")
    private Integer invoiceId;

    public String getProductName(){return productName;}
    public Integer getUnitPrice() {return unitPrice;}
    public Integer getQuantity() {return quantity;}

}
