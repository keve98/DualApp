create or replace trigger invoice_total_trigger
after insert on invoiceitem

declare 
    total number;

begin

    select sum(totalitemprice) into total
    from INVOICEITEM, INVOICE
    where invoice.id = invoiceitem.id;

    update invoice
    set invoicetotal = total;
end;