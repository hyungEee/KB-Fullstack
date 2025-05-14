use sqldb;
select userID as '사용자 아이다', sum(amount) as '총 구매 개수' 
from buytbl group by userID;
select userID as '사용자 아이다', sum(price*amount) as '총 구매액' 
from buytbl group by userID;
select avg(amount) as '평균 구매 개수' from buytbl;
select userID, avg(amount) as '평균 구매 개수' 
from buytbl group by userID;
select name, height from usertbl
where height=(select min(height) from usertbl) 
or height=(select max(height) from usertbl); 
select count(mobile1) as '휴대폰이 있는 사용자' from usertbl;
select userID as 사용자, sum(price*amount) as 총구매액
from buytbl group by userID;
select userID as 사용자, sum(price*amount) as 총구매액
from buytbl group by userID
having sum(price*amount)>=1000;

use world;
select count(population) from city where countryCode='KOR';
select min(population) as 최소값 from city where countryCode='KOR';
select avg(population) from city where countryCode='KOR'; 
select max(population) as 최대값 from city where countryCode='KOR';
select length(name) from country;
select concat(upper(left(name,3)),substring(name,4,length(name))) from country;
select round(lifeExpectancy,1) from country;

use employees;
select * from employees 
where emp_no=any(select emp_no from dept_manager where to_date='9999-01-01');
select * from employees
where emp_no=any(select emp_no from dept_manager where dept_no='d005' and to_date='9999-01-01');
select * from employees
order by hire_date desc
limit 140, 20;
select count(*) from employees
where emp_no=any(select distinct emp_no from dept_emp where to_date='9999-01-01');
select avg(salary) from salaries
where emp_no=any(select distinct emp_no from dept_emp where to_date='9999-01-01');
select * from salaries
where salary>(select avg(salary) from salaries
where emp_no>any(select distinct emp_no from dept_emp where to_date='9999-01-01'));
select dept_no, count(*) from dept_emp
where to_date='9999-01-01'
group by dept_no
order by dept_no