create table veiculo(
	id bigint not null auto_increment,
    marca varchar(15) not null,
    modelo varchar(15) not null,
    cor varchar(10) not null,
    placa varchar(8) not null,
    tipo varchar(5) not null,
    
    primary key (id)
);