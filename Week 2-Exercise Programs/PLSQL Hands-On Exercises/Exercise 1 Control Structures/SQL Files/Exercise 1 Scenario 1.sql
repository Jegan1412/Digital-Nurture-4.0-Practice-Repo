begin
    for customer in (select c.customerid, l.loanid, l.interestrate
    from customers c join loans l on c.customerid = l.loanid
    where months_between(sysdate, c.dob)/12 >60) loop
        update loans set interestrate = customer.interestrate - (customer.interestrate/100)
        where loanid = customer.loanid;
    end loop;
    commit;
end;
/