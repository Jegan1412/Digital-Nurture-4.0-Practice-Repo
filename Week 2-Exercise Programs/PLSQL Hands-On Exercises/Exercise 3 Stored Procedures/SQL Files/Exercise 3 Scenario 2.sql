create or replace procedure UpdateEmployeeBonus(dept in varchar2, bonuspct in number) is

begin
    for employee in (select e.salary, e.employeeid from employees e where department = dept) loop
        update employees set salary = salary + (salary*(bonuspct/100)) 
        where employeeid = employee.employeeid;
    end loop;
    commit;
end UpdateEmployeeBonus;
/