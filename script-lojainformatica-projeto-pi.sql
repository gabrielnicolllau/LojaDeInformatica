CREATE DATABASE lojainformatica;

USE lojainformatica;

CREATE TABLE produto (
    ID_produto INT AUTO_INCREMENT PRIMARY KEY,
    Tipo VARCHAR(50) NOT NULL,
    Preco DECIMAL(10, 2) NOT NULL,
    Quantidade INT NOT NULL,
    Descricao TEXT
);

SELECT * FROM produto;

