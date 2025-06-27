begin
    for customer in (select c.customerid, c.isvip from customers c 
    where c.balance > 10000) loop
        update customers set isvip = 'Y' where customerid = customer.customerid;
    end loop;
    commit;
end;
/