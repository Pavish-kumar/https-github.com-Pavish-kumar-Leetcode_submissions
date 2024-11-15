select Department, Employee,Salary
from(select d.name as Department,e.name as  Employee, e.salary as Salary,
Dense_Rank() over(partition by d.name order by salary desc)  unqrk
from Employee e
join Department d on d.id=e.departmentId
) as x
where x.unqrk<4