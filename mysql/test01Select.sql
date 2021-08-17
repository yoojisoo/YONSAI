SELECT * FROM jdbctest.test01;

INSERT INTO test01 (pname, age, etc) 
VALUES ('김뮤츠', '7', '전설1');

UPDATE test01
SET pname ='박꼬북', age='5', etc='친구2' 
WHERE tno = '8';

-- 내림차순 마지막 1개?
select * from test01
order by tno DESC limit 1;

select * from test01
where del=0
order by tno DESC limit 1;


-- 현 데이터목록
SELECT * FROM test01
where del = 0;

-- 삭제 목록
SELECT * FROM test01
where del = 1;

-- 추가시
INSERT INTO `jdbctest`.`test01`
(`pname`,`age`,`etc`,`del`)
VALUES('홍길',43,'qlrh',0);

-- 삭제시
delete from test01
where tno=8;

-- 삭제를 수정으로 변경(test01del필드 사용)
update test01
set del = 1
where tno=5;

update test01
set del = 1
where tno=12;

select * from test01
where del=0 and tno=5;

