Create  database db_pizzaria_legal;

USE db_pizzaria_legal;

 create table  tb_categoria(
	id int(5) auto_increment, nome varchar(20) not null, ativo boolean not null ,
    primary key (id)
)engine = InnoDB;

create table tb_produto (
id int (5) auto_increment,nome varchar (30) not null, preco decimal(10,2) not null, estoque tinyint not null, categoria_id int(5) not null,
primary key(id),
foreign key(categoria_id) references tb_categoria (id)
) engine = InnoDB;

insert into tb_categoria ( nome,ativo ) values ( "Pizza Doce", True);
insert into tb_categoria (nome, ativo) values ("Pizza salgada",True);
insert into tb_categoria (nome, ativo) values ("Brotinho", True);
insert into tb_categoria (nome, ativo) values ( "Refrigerante", True);
insert into tb_categoria (nome, ativo) values ( "suco", True);

insert into  tb_produto (nome,preco,estoque,categoria_id) values ( "Brotinho calabresa",19.90,10,3);
insert into  tb_produto(nome,preco,estoque,categoria_id) values (" Pizza Frango com catupiry",60.00,10,2);
insert into  tb_produto (nome,preco,estoque,categoria_id) values( " Pizza de brigadeiro",65.00,10,1);
insert into tb_produto(nome,preco,estoque,categoria_id) values( " Pizza Mussarela", 45.00,10,2);
insert into tb_produto(nome,preco,estoque,categoria_id) values( " Brotinho Doce Leite ",24.30,10,3);
insert into tb_produto (nome,preco,estoque,categoria_id) values(" Suco de uva 1L",16.50,10,5 );
insert into tb_produto( nome,preco, estoque,categoria_id) values(" Coca- Cola 2L",9.50,10,4);
insert into tb_produto(nome,preco,estoque,categoria_id) values (" Suco de Laranja",16.10,10,5);

select * from  tb_produto  where preco > 45.00;

select * from tb_produto  where preco > 29.00 and preco <60.00;

select * from tb_produto  where tb_produto.nome like "%c%";

select * from  tb_produto 
inner join tb_categoria  on  tb_produto.categoria_id = tb_categoria.id;

select * from tb_produto
inner join  tb_categoria on  tb_produto.categoria_id = tb_categoria.id
where tb_categoria.nome = "Brotinho";



