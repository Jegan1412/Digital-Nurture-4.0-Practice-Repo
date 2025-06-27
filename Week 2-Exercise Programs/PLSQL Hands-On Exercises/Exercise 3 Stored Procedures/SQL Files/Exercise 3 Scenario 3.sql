create or replace procedure TransferFunds(srcid in number, 
destid in number, amount in number) is
srcbalance number;

begin

    select balance into srcbalance from accounts where accountid = srcid for update;
    if srcbalance >= amount then
        update accounts set balance = balance - amount, lastmodified = sysdate 
        where accountid = srcid;
        
        update accounts set balance = balance + amount, lastmodified = sysdate 
        where accountid = destid;
        commit;
    end if;
end TransferFunds; 
/