create database db_generation_game_online ;

use  db_generation_game_online;

create table  tb_classe (
id_classe bigint(4)  auto_increment primary key,
personagem varchar (30) not null, 
categoria varchar  (50) not null,

primary key( Classe_id)) engine= InnoDB;

insert into tb_classe values( 1,"Hulk",humano);
insert into tb_classe values (2,"arqueiro",humano);
insert into tb_classe values (3,"Capitão America",humano);
insert into tb_classe values(4,"Mago", elfo);
insert into tb_classe values(5,"Smurf",elfo);

create table tb_personagem(
	id int (5) auto_increment, nome varchar(20) not null, 
    poderDeAtaque int not null, 
    poderDeDefesa int not null, 
    
    classe_id int not null,
    primary key (id),
    foreign key (classe_id) 
    references tb_classe (id)
)ENGINE = InnoDB;

insert into tb_classe values( 1, "Mulher Maravilha",3000,1800,1);
insert into tb_classe values(2, "Mulher gato", 4000 ,2500, 4);
insert into tb_classe values(3, "Viuva negra", 2100 , 500, 3);
insert into tb_classe values(4, "Jean grey" , 2000, 1000 , 2);
insert into tb_classe values(5, "Gamora", 2500 , 1100, 5);
insert into tb_classe values(6,"Vampira",2800, 1500, 1);
insert into tb_classe values(7,"Mistica",3500,2100,3);
insert into tb_classe values(8,"Tempestade",4500,1500,5);

select * from  tb_personagem where poderDeAtaque >2000;

select* from tb_personagem where poderDeDefesa> 1000 and poderDeDefesa < 2000;

select tb_personagem, tb_personagem.poderDeAtaque,tb_personagem.poderDeDefesa,tb_personagem.classe_id
from tb_personagem
where poderDefesa>1000 and poderDeDefesa <2000 ;

select * from  tb_personagem where  tb_personagem.nome like "%c%";

select* from  tb_personagem
inner join tb_ classe on tb_classe.id = tb_personagem.classed_id;

select * from tb_personagem
inner join tb_classe on  tb_classe.id = tb_personagem.classe_id
where tb_classe.idclasse=  "Hulk";





