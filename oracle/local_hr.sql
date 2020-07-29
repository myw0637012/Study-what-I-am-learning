select * from tab;

select * from employees;

select * from employees where first_name like 'Alex%';
select * from employees where lower(substr(first_name,1,4)) = 'alex';

select count(*) from employees;

select count(commission_pct) from employees;

select * from employees where department_id = '50';

select first_name, hire_date from employees;
select first_name, hire_date, sysdate - hire_date from employees;
select hire_date, round(hire_date, 'month') from employees;
-- round �Լ��� ���˸𵨷� month�� �����Ͽ��⿡ Ư����¥(date)�� ��(month)�� �������� �ݿø��� ��¥�� ���Ѵ�.'
-- ���� �������� 16�Ϻ��� ������ �̹��� 1����, ũ�� ������ 1���� ���Ѵ�.
 
 select hire_date, trunc(hire_date, 'month') from employees; -- ��¥�� ������ ��� 1�Ϸ� ����
 
 select first_name, sysdate, hire_date, months_between(sysdate, hire_date) from employees;
 -- months_between �Լ��� ��¥�� ��¥ ������ �������� ���ϴ� �Լ��̴�.
 
 select first_name, sysdate, hire_date, trunc(months_between(sysdate, hire_date)) from employees;
 
 select first_name, sysdate, hire_date, add_months(hire_date, 6) from employees;
 
 select sysdate, next_day(sysdate, '������') from dual;
 -- �ش� ������ ���� ����� ��¥�� ��ȯ�ϴ� �Լ�
 
 select hire_date, Last_day(hire_date) from employees;
 -- �ش���� ���� ������ ��¥
 
select Last_day(sysdate) from dual;
select Last_day('2020-4-21') from dual;

select sysdate, to_char(sysdate, 'YYYY-MM-DD HH:MI:SS') from dual; -- �� �� �� �� �� �� 
  -- to_char : ��¥�� Ȥ�� �������� ���������� ��ȯ�Ѵ�.
 
 YYYY �⵵4�ڸ�
 YY �⵵2�ڸ�
 MM �� ����2�ڸ�
 MON ���� ���ĺ����� ǥ��
 DAY ���� ǥ��
 DY ���� ���� ǥ��
 HH or HH12 12�ð���
 HH24 24�ð���
 
 select first_name, salary, to_char(salary, 'L999,999') from employees;
 -to_char
 0 �ڸ����� ��Ÿ���� �ڸ����� ���� ���� ��� 0���� ä���.
 9 �ڸ����� ��Ÿ���� �ڸ����� ���� �ʾƵ� ä���� �ʴ´�.
 
 select to_char(123456, '00000000'), to_char(123456, '999,999,999') from dual;
 
 -- ����ȯ ����
 -- to_mumber �������� ����������
-- to_char ��¥�� �������� ����������
-- to_date �������� ��¥������

select first_name, hire_date from employees
where hire_date = 20030617;

select first_name, hire_date from employees
where hire_date = '20030617';

select first_name, hire_date from employees
where hire_date = to_date(20030617, 'YYYYMMDD');
 
select to_number('20,000', '99,999') - to_number('10,000', '99,999') from dual;
-- 20000�� 99,999�������� ���߰� 10000�� �� ���� �����.

select '100000' - '50000'from dual;

select * from employees;

select department_id, avg(salary) as "�������"
from employees
group by department_id
order by "�������" desc;

select department_id, job_id, count(*), sum(salary)
from employees
group by department_id, job_id
having sum(salary) > 13000
order by department_id, job_id;

select first_name, salary, commission_pct,
        nvl(commission_pct, 0),
        salary * 12 + nvl(commission_pct, 0)
from employees;

-- �ڹٿ��� (a > b ) ? 'T' : 'F';
-- nvl2(e1, e2, e3) : e1�� null�̸� e2����, �ƴϸ� e3����

select first_name, salary, commission_pct,
        nvl2(commission_pct, salary * 12 + commission_pct, salary *12),
        salary * 12 + nvl(commission_pct, 0)
from employees
order by job_id;

select nullif('A', 'A'), nullif('A', 'B')
from dual;

-- coalesce : �μ� �߿��� null�� �ƴ� ù��° �μ��� ��ȯ�ϴ� �Լ�
select first_name, salary, commission_pct,
        coalesce(commission_pct, salary, 0)
from employees
order by job_id;

select distinct department_id from employees;

-- decode : if / else if�� ���ϰ���
select first_name, department_id,
        decode(department_id,
        10, 'ACCOUTING',
        20, 'RESEARCH',
        30, 'SALES',
        40, 'OPERATIONS',
        'DEFAULT') as dname
from employees
order by department_id;

select first_name, department_id,
        case
            when department_id = 10 then 'ACCOUTING'
            when department_id = 20 then 'RESEARCH'
            when department_id = 30 then 'SALES'
            when department_id = 40 then 'OPERATIONS'
            else 'DEFAULT'
        end as dname
from employees
order by department_id;

select first_name, department_id
from employees
where department_id = 
    (
        select department_id 
        from employees 
        where first_name = 'Steven' and last_name = 'King'
    );

select first_name, department_id
from employees
where department_id in 
    (
        select department_id 
        from employees 
        where first_name = 'Steven'
    );
    
-- �ּ� �޿��� �޴� ����� �̸�, ������, �޿� ���
select * from employees order by salary;

select first_name, last_name, job_id, salary
from employees
where salary = 
    (
        select 
        min(salary)
        from employees
    );
    
select department_id, min(salary)
from employees
group by department_id
having min(salary) > (select min(salary) from employees where department_id = 30);
    
    