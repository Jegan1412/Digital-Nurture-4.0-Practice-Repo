begin
    for due in(select c.customerid, c.name, l.loanid, l.enddate 
    from customers c join loans l on c.customerid = l.loanid 
    where l.enddate between sysdate and sysdate+30) loop
        dbms_output.put_line('This is a remainder for ' ||
         due.name || '-' || due.customerid || 'that Loan ID: ' ||
         due.loanid || 'is due on ' || due.enddate);
    end loop;
end;
/