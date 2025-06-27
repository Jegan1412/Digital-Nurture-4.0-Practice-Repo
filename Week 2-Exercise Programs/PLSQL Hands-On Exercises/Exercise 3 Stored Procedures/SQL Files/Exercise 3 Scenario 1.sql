create or replace procedure ProcessMonthlyInterest is

begin
    for customer in (select a.customerid, a.balance, a.lastmodified from accounts a where accounttype = 'Savings') loop
        update accounts set balance = balance + (balance/100), lastmodified = sysdate
        where customerid = customer.customerid;
    end loop;
    commit;
end ProcessMonthlyInterest;
/