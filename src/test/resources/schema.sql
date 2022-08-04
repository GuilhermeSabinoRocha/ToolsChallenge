DROP TABLE IF EXISTS Transacao;

CREATE TABLE Transacao (
  id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
  cartao VARCHAR(250) NULL
  
);

CREATE TABLE Descricao (
	id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
	valor varchar(100) NULL,
	dataHora varchar(100) NULL,
	estabelecimento varchar(100) NULL,
	nsu varchar(100) NULL,
	codigoAutorizacao varchar(100) NULL,
	status varchar(100) NULL
);

CREATE TABLE FormaPagamento (
	id INT GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
	tipo varchar(100) NULL,
	parcelas varchar(100) NULL
);

ALTER TABLE Transacao ADD DescricaoId int NULL;
ALTER TABLE Transacao ADD CONSTRAINT Descricao_FK FOREIGN KEY (DescricaoId) REFERENCES Descricao(id);
ALTER TABLE Transacao ADD FormaPagamentoId int NULL;
ALTER TABLE Transacao ADD CONSTRAINT FormaPagamento_FK FOREIGN KEY (FormaPagamentoId) REFERENCES FormaPagamento(id);