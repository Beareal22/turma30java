create database db_ecommerc;

use db_ecommerc;
create table tb_produtos(
codigo bigint,
nome varchar(20),
marca varchar(20),
versao varchar(20),
preco decimal (10,2),
ativo boolean,
    primary key (id)
);

insert into tb_produtos (setor, produto, valor, ativo) values(001,"Shampoo", "Seda","Pos-danos",7.00);
insert into tb_produtos (setor, produto, valor, ativo) values(002,"Condionador", "Seda","Biotina",10.00);
insert into tb_produtos (setor, produto, valor, ativo) values(003, "Creme para cabelo","Seda","Oleo de barbosa",5.00);
insert into tb_produtos (setor, produto, valor, ativo) values(004,"Mascara de hidradação","Seda","Pos-danos",20.00);
insert into tb_produtos (setor, produto, valor, ativo) values(005,"Resconstrução","Seda", "nutre",15.00);

select * from tb_produtos;

select * from tb_produtos where valor> 500.00;
select * from tb_produtos where valor < 500.00;

update tb_produtos set valor = 4.99 
	where id = 9;
    
    select * from tb_produtos;
