# Assignment 2 : SQL Commands

## Login to SYSTEM

```
Enter user-name: SYSTEM
Enter password:
Last Successful login time: Fri Feb 05 2023 16:27:32 +05:30
```

## Employee Table Creation and alter commands

```
SQL> create table Employee(
  2      EmpId number,
  3      FirstName varchar2(20),
  4      LastName varchar2(20),
  5      EmailId varchar2(40),
  6      Gender char(1),
  7      MobileNo char(10),
  8      DateOfJoining date default sysdate,
  9      DeptId int
  10     );

Table created.

SQL> alter table employee add(Salary number(10,2));

Table altered.

SQL>
SQL> alter table Employee modify FirstName varchar2(30);

Table altered.

SQL> alter table employee modify firstname varchar2(30) constraint Employee_FirstName_NN not null;

Table altered.

SQL> alter table employee modify lastname varchar2(30) constraint Employee_LastName_NN not null;

Table altered.

SQL> alter table employee add constraint Employee_Emailid_UN unique(Emailid);

Table altered.

SQL> alter table employee add constraint Employee_Mobile_UN unique(mobileno);

Table altered.

SQL> alter table employee add constraint employee_pk primary key(empid);

Table altered.

SQL> alter table employee add constraint employee_gender_chk check(gender in ('M', 'F'));
```

## Department Table Creation

```
SQL> create table department(
  2      deptid number constraint dept_pk primary key,
  3      deptname varchar2(30) constraint dept_name_nn not null);

Table created.

SQL> alter table employee add constraint employee_dept_ref foreign key(deptid) references department(deptid) on delete set null;

Table altered.
```

## Insertions into Employee Table & Department Tables

```
SQL> insert into department values(999, 'IT');

1 row created.

SQL> insert into department values(888, 'SysAdmin');

1 row created.

SQL> insert into department values(777, 'Finance');

1 row created.

SQL> insert into employee values(101, 'spider', 'man', 'peter@gmail.com', 'M', '1234567890', sysdate, 999, 25000);

1 row created.

SQL> insert into employee values(102, 'wonder', 'woman', 'diana@gmail.com', 'F', '0123456789', sysdate, 999, 22000);

1 row created.

SQL> insert into employee values(103, 'bat', 'man', 'bruce@gmail.com', 'M', '9012345678', sysdate, 888, 32000);

1 row created.

SQL> insert into employee values(104, 'cat', 'woman', 'felicity@gmail.com', 'F', '8901234567', sysdate, 888, 37000);

1 row created.

SQL> insert into employee values(105, 'shakti', 'max', 'mukesh@gmail.com', 'M', '7890123456', sysdate, 777, 47000);

1 row created.

SQL> insert into employee values(106, 'spider', 'gwen', 'gwen@gmail.com', 'F', '6789012345', sysdate, 777, 43000);

1 row created.
```

## Location Table Creation

```
SQL> create table location(
  2      lid number(5) constraint location_pk primary key,
  3      city varchar2(20)
  4      );

Table created.
```

## Sequence Creation

```
SQL> create sequence location_lid_genpk
  2      start with 1000
  3      increment by 10
  4      nomaxvalue
  5      nocycle
  6      cache 10;

Sequence created.
```

## Insertion into Location Table

```
SQL> insert into location values(location_lid_genpk.nextval, 'MyLocation');

1 row created.

SQL> insert into location values(location_lid_genpk.nextval, 'NotMyLocation');

1 row created.

SQL> insert into location values(location_lid_genpk.nextval, 'YourLocation');

1 row created.
```

## Alterations to Department Table - Adding location column

```
SQL> alter table department add lid number(5);

Table altered.

SQL> alter table department add constraint department_loc_ref foreign key(lid) references location(lid) on delete set null;

Table altered.

SQL>
SQL> update department set lid = 1000 where deptid = 999;

1 row updated.

SQL> update department set lid = 1010 where deptid = 888;

1 row updated.

SQL> update department set lid = 1020 where deptid = 777;

1 row updated.
```

## Creating new user & logging into it

```
SQL> alter session set "_ORACLE_SCRIPT"= true;

Session altered.

SQL> create user demouser
  2      identified by demo;

User created.

SQL> GRANT ALL PRIVILEGES to demouser;

Grant succeeded.

SQL> disc
Disconnected from Oracle Database 21c Enterprise Edition Release 21.0.0.0.0 - Production
Version 21.3.0.0.0
SQL> conn demouser/demo
Connected.
```

## 3 table join - employee, deptname & city

```
SQL> select e.firstname, d.deptname, l.city from
  2      SYSTEM.employee e natural join SYSTEM.department d natural join SYSTEM.location l;

FIRSTNAME                      DEPTNAME
------------------------------ ------------------------------
CITY
--------------------
spider                         IT
MyLocation

wonder                         IT
MyLocation

bat                            SysAdmin
NotMyLocation


FIRSTNAME                      DEPTNAME
------------------------------ ------------------------------
CITY
--------------------
shakti                         Finance
YourLocation

spider                         Finance
YourLocation

cat                            SysAdmin
NotMyLocation
```

## empid, empname & salary of employees with highest & second highest salary

```
SQL> select empid, firstname, salary from SYSTEM.employee order by salary desc FETCH FIRST 2 ROWS ONLY;

     EMPID FIRSTNAME                          SALARY
---------- ------------------------------ ----------
       105 shakti                              47000
       106 spider                              43000
```
