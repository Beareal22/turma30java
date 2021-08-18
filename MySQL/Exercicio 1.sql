create database db_empresa

use db_empresa;
create table tb_funcionaries(
id_func bigint(5) auto_increment,
nome varchar(20) not null,
cargo varchar(20) not null,
departamento varchar(20) not null,
salario bigint(5),
 primary key  (id_func)

);

INSERT INTO tb_funcionaries (nome, cargo, departamento, salario) VALUES (001,"Amanda",1500.00,true);
INSERT INTO tb_funcionaries (nome, cargo, departamento, salario) VALUES (002,"Carla",2500.00,true);
INSERT INTO tb_funcionaries (nome, cargo, departamento, salario) VALUES (003,"Daniela",3500.00,true);
INSERT INTO tb_funcionaries (nome, cargo, departamento, salario) VALUES (004,"Laura",1000.00,true);
INSERT INTO tb_funcionaries (nome, cargo, departamento, salario) VALUES (005,"Mariana",5000.00,true);

select * from tb_funcionarios;

SELECT * FROM tb_funcionaries WHERE salario < 2000;
SELECT * FROM tb_funcionaries WHERE salario < 2000;

update tb_funcionarios set salario = 2100.00
where id = 3;

select * from tb_funcionarios;


