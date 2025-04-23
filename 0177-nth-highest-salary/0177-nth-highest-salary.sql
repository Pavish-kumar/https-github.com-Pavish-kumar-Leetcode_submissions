CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    declare mp int;
    set mp=N-1;
  RETURN (
    select distinct salary
    from employee
    order by salary desc
    limit 1 offset mp
  );
END;