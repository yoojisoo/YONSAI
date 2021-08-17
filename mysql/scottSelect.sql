use scott;  -- 데이터베이스 scott 사용

-- emp테이블을 전체조회
select * from emp;

-- emp테이블에 사원명, 사원번호, 급여(sal)를 조회
SELECT ename as 사원명,  empno, sal 
FROM emp;

-- emp테이블에서 사원명과 세금(급여 5%)를 조회
select ename, sal * 0.05 as 세금
from emp;

-- 최고급여는 누가???
select max(sal) from emp;

-- 사원이 몇명???
select count(job) from emp;

-- 급여합계, 평균급여, 최대급여,최소급여, 개수 조회
select sum(sal), round(avg(sal),2), max(sal), min(sal), count(sal)
from emp;

-- 사원명이 KING인 급여와 사원명를 조회
select ename,sal from emp
where ename='KING';

-- 총 사원수 구하기
select count(empno) from emp;

-- [where 조건절 연습]
-- 부서번호가 10인 사원을 조회
select * from emp
where deptno = 10;

-- 월 급여가 2500이상인 사원을 조회
select * from emp
where sal>2500;

-- 사원명이 S자로 시작하는 사원의 사원번호와 이름을 조회
select empno, ename
from emp
where ename like 'S%';

-- 커미션이 300, 500, 1400 인 사원의 사번, 이름 ,커미션 을 조회
select empno, ename, comm
from emp
-- where comm=300 or comm=500 or comm=1400;
where comm In(300, 500, 1400);

-- 월급여가 1200에서 3500사이의 사원의 사번, 이름, 급여를 조회
select empno, ename, sal
from emp
-- where sal>1200 AND sal<3500;
where sal between 1200 and 3500;

-- 직급(job)이 MANAGER이고 부서번호가 30인 사원의 이름,사번,직급,부서번호를 조회
select empno, ename, job, deptno
from emp
where job='MANAGER' AND deptno=30;

-- 부서번호가 30이 아닌 사원의 사번, 이름, 커미션을 조회
select empno, ename, job, deptno
from emp
where NOT deptno = 30;

-- 이름에 S포함되지않는 사원의 사번,이름을 조회
select empno, ename
from emp
where ename like '%S%';

-- [group by] 구문
-- 부서별 평균월급여를 구하는 쿼리
select deptno, avg(sal)
from emp
group by deptno;

-- 부서별 최고급여와 최소급여를 구하는 쿼리
select deptno, max(sal), min(sal)
from emp
group by deptno;
-- 그룹에 대한 조건 : having 절 

-- 부서별 평균월급여가 2000이상인 부서를 구하는 쿼리
select deptno, avg(sal)
from emp
group by deptno
having avg(sal)>=2000;

-- [order by] 구문 -정렬
-- ASC(오름차순), DESC(내림차순)
select * from emp
order by sal asc;
select * from emp
order by sal desc;
-- 급여내림차순, 이름오름차순으로 정렬
select * from emp
order by sal desc, ename asc;

-- [join]구문
-- 2개이상의 테이블에서 데이터를 조회할때 사용
select count(*) from emp;   -- 14개의 레코드(행)
select count(*) from dept;  -- 4개의 레코드
select emp.ename, dept.dname
from emp as e, dept as d;

-- 급여가 1500 이상인 사원의 사원명, 급여, 부서명, 주소를 조회
select e.ename, e.sal, d.dname, d.loc
from emp as e, dept as d
where e.deptno = d.deptno AND sal>1500
order by sal;

-- [서브쿼리]
-- 최대급여인 사원을 조회하세요
select * from emp
where sal = (select max(sal) from emp);

