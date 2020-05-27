--시퀀스 생성
create sequence member_seq--member_seq : 이름일 뿐
increment by 1--1씩 증가 시키겠다.
minvalue 1--최솟값, 최저값 부터
start with 1--시작값(10으로하면 충돌할 수도 있지만, 나누다보면 바뀔 수 있음)
maxvalue 10000;--최대값까지

--테이블 생성
create table member(
seq number,
no number(5) not null,
name varchar2(30) not null,
email varchar2(30) not null,
tel varchar2(20),
primary key(no)
);

--데이터 입력
insert into member(seq, no, name, email, tel)
values(member_seq.nextVal,10,'홍길동','woals2670@daum.net','010-1234-5678');

insert into member(seq, no, name, email, tel, address)
values(member_seq.nextVal,20,'홍길순','codus2670@daum.net','010-9876-5432','경기도 시흥시');

insert into member(seq, no, name, email, tel, address)
values(member_seq.nextVal,30,'홍준표','dog@daum.net','010-4444-4444','경기도 안산시');

insert into member
values(member_seq.nextVal,40,'류현진','ryu@naver.com','010-7891-5431','미국 토론토시');

--데이터 추가(변경)
alter table member add(address varchar2(50));
--데이터 수정 및 삭제
delete from member where adress = '경기도 안산시';
--테이블 초기화
drop table member;


--조회
select * from member;

--컴럼 수정은 별로 없는 테이블이나 시작 단계에서 작업을 하는 것을 권장 합니다.
--1. 데이터가 많아지면 수정하는데 시간이 많이 걸립니다.
--2. 컬럼 수정으로 인하여 컬럼 명이 매칭이 되지 않으면, 프로그램 오류가 발생 할 수 있습니다.

commit;