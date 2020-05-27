--시퀀스 생성
create sequence customer_seq
increment by 10
minvalue 10
start with 10
maxvalue 100000;

--테이블 생성
create table customer(
seq number,
no number(8) not null,
name varchar2(30) not null,
email varchar2(30) not null,
tel varchar2(30),
primary key(no)
);

--데이터 입력
insert into customer (seq, no, name, email, tel)
values(customer_seq.nextVal, 10, '테스트', 'test@test.com', '010-0000-0000');

--데이터 출력
select * from customer;

commit;