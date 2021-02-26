package app;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.Date;
import java.util.List;

@RequestScoped
@Named
public class InvoicesController {

    @PersistenceContext
    EntityManager em;

    private Integer id;
    private String name;
    private Date d_date;
    private Date i_date;
    private String comment;



    @Named
    @Produces
    public List<Invoice> getInvoices(){
        TypedQuery<Invoice> query = em.createQuery("select i from Invoice i", Invoice.class);
        return query.getResultList();
    }

    public Integer getId() {return id;}
    public String getName() {return name;}
    public Date getD_date() {return d_date;}
    public Date getI_date() {return i_date;}
    public String getComment() {return comment;}


}
