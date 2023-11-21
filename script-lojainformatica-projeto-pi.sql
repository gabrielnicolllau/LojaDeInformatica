CREATE DATABASE lojainformatica;

USE lojainformatica;

CREATE TABLE Produto (
    id_Produto INT AUTO_INCREMENT PRIMARY KEY,
    tipo VARCHAR(50) NOT NULL,
    preco DECIMAL(10, 2) NOT NULL,
    quantidade INT NOT NULL,
    descricao TEXT
);

CREATE TABLE Cliente (
	id_Cliente INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(200) NOT NULL,
    email VARCHAR(200) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    dataNascimento TIMESTAMP NOT NULL,
    sexo VARCHAR(9) NOT NULL,
    celular VARCHAR(20) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    estadoCivil VARCHAR(20) NOT NULL,
    cep VARCHAR(9) NOT NULL,
    endereco VARCHAR(200) NOT NULL,
    numeroCasa INT NOT NULL,
    bairro VARCHAR(45) NOT NULL,
    cidade VARCHAR(45) NOT NULL,
    uf CHAR(2) NOT NULL
);

-- a coluna ID_cliente na tabela Compra está referenciando o campo id_cliente na tabela cliente, estabelecendo um relacionamento entre essas tabelas. --
CREATE TABLE Compra (
    id_Compra INT AUTO_INCREMENT PRIMARY KEY,
    id_Cliente INT NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    id_Produto INT NOT NULL,
    quantidade INT NOT NULL,
    dataCompra TIMESTAMP,
    FOREIGN KEY (id_Cliente) REFERENCES Cliente(id_Cliente),
    FOREIGN KEY (id_Produto) REFERENCES Produto(id_Produto)
);

ALTER TABLE Compra
ADD preco INT NOT NULL;