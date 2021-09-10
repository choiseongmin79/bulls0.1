
create table if not exists member_type(
	tyepId smallserial not null primary key,
	typeName varchar(10) not null );
	
insert into member_type (typeName) values ('����');
insert into member_type (typeName) values ('���ǻ�');
insert into member_type (typeName) values ('������');
insert into member_type (typeName) values ('����');
insert into member_type (typeName) values ('�������');
insert into member_type (typeName) values ('�ѿ���ȸ');
insert into member_type (typeName) values ('����');
	
create table if not exists person(
	id bigserial not null primary key,
	name varchar(50) not null,
	password varchar(50) not null,
	nickname varchar(50) not null,
	birthday varchar(20) not null,
	cellphone varchar(20) not null,
	address varchar(50) not null,
	membertype integer not null
);

create table if not exists farm(
	id serial not null primary key,
	name varchar(20) not null,
	phone varchar(20) not null,
	address varchar(50) not null,
	farmNo varchar(10) not null
);

create table if not exists agent(
	id serial not null primary key,
	name varchar(20) not null,
	phone varchar(20) not null,
	address varchar(50) not null,
	license varchar(10) not null
);

create table if not exists office(
	id serial not null primary key,
	name varchar(20) not null,
	phone varchar(20) not null,
	address varchar(50) not null,
	officeno varchar(10) not null
);