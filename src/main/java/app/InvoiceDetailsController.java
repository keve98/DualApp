package app;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@RequestScoped
@Named
public class InvoiceDetailsController {
    @PersistenceContext
    EntityManager em;

    @Named
    @Produces
    public List<InvoiceItem> getInvoiceDetails(){
        TypedQuery<InvoiceItem> query = em.createQuery("select i from InvoiceItem i " +
                                        "where i.id  = :id", InvoiceItem.class);
        return query.getResultList();
    }


}
