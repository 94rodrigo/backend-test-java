create table estabelecimento (
	id bigint not null auto_increment,
	veiculo_id bigint not null,
    nome varchar(50) not null,
	cnpj varchar(18) not null,
	endereco varchar(100) not null,
	telefone varchar(9) not null,
	qtdeVagasMoto bigint not null,
	qtdeVagasCarro bigint not null,
    
    primary key (id)
);

alter table estabelecimento add constraint fk_estabelecimento_veiculo
foreign key (veiculo_id) references veiculo (id);