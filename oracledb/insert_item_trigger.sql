create or replace trigger insertitem_trigger
after insert on invoiceitem

begin
    update INVOICEITEM
    set TOTALITEMPRICE = QUANTITY*UNITPRICE;

end;