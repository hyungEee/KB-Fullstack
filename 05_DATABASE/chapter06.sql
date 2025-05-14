SHOW databases;
USE employees;
SHOW tables;
DESCRIBE employees;

SELECT * FROM titles;
SELECT first_name FROM employees;
SELECT first_name, last_name, gender FROM employees;
SELECT first_name AS 이름, gender AS 성별, hire_date AS '회사 입사일' FROM employees;

USE sqldb;
SELECT * FROM usertbl WHERE name='김경호';
SELECT * FROM usertbl WHERE birthYear>=1970 AND height>=182;
SELECT * FROM usertbl WHERE height BETWEEN 180 AND 183;
SELECT * FROM usertbl WHERE addr IN('경남','전남','경북');
SELECT * FROM usertbl WHERE name LIKE '김%';
SELECT name,height FROM usertbl 
WHERE height>(SELECT height FROM usertbl WHERE name='김경호');
SELECT * FROM usertbl ORDER BY mDate;
SELECT * FROM usertbl ORDER BY mDate DESC;
SELECT * FROM usertbl ORDER BY height DESC, name DESC;
SELECT DISTINCT addr FROM usertbl ORDER BY addr;

use world;
select Population from city where CountryCode='KOR' order by Population DESC;
select CountryCode, Population from city order by CountryCode, Population DESC;
select count(*) from city where CountryCode='KOR';
select * from city where CountryCode IN('KOR','CHN''JPN');
select count(*) from city where CountryCode='KOR' and Population>=1000000;
select * from city where CountryCode='KOR' order by Population desc limit 10;
select * from city where CountryCode='KOR' and Population between 1000000 and 5000000;
