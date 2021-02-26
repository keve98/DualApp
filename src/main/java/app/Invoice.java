package app;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name ="INVOICE")
@Entity
public class Invoice implements Serializable {
    
    @Id
    @Column(name="ID")
    private Integer invoiceID;

    @Column(name = "CUSTOMERNAME")
    private String customerName;

    @Column(name = "ISSUEDATE")
    private Date issueDate;

    @Column(name = "DUEDATE")
    private Date dueDate;

    @Column(name = "COMMENTS")
    private String comment;

    @Column(name ="INVOICETOTAL")
    private Integer invoiceTotal;


    public Integer getId(){
        return invoiceID;
    }
    public String getCustomerName(){
        return customerName;
    }
    public Date getIssueDate(){return issueDate;}
    public Date getDueDate() {return dueDate;}
    public String getComment(){return comment;}
}
