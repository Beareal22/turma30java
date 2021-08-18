create database db_escola;

use db_escola;
create table tb_alunos (
	id bigint(5) auto_increment,
    matricula varchar(20) not null,
    nome varchar(50) not null,
    media decimal(10,2),
    ativo boolean,
    primary key (id)
    );
    
    insert into tb_alunos (matricula, nome, media, ativo) values (A001,"Joana",7.80,true);
    insert into tb_alunos (matricula, nome, media, ativo) values (A002,"Joana",7.80,true);
    insert into tb_alunos (matricula, nome, media, ativo) values (A003,"Joana",7.80,true);
    insert into tb_alunos (matricula, nome, media, ativo) values (A004,"Joana",7.80,true);
    insert into tb_alunos (matricula, nome, media, ativo) values (A005,"Joana",7.80,true);
    insert into tb_alunos (matricula, nome, media, ativo) values (A006,"Joana",7.80,true);
	insert into	tb_alunos (matricula, nome, media, ativo) values (A007,"Joana",7.80,true);
    insert into  tb_alunos(matricula, nome, media, ativo) values (A008,"Joana",7.80,true);
    
    select * from tb_alunos where media > 7.00;
    
    select * from tb_alunos where media < 7.00;
    
    update tb_alunos set media = 7.00 
	where id = 6;
    select * from tb_alunos;