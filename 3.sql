1) Altere o exemplo dessa prática: 
a) Apresentando o identificador, nome, descrição e preço dos produtos em ordem 
decrescente de preço. 

SELECT produto.id, produto.nome, identificacao.descricao, produto.preco
FROM produto
JOIN identificacao ON produto.id = identificacao.id
ORDER BY produto.preco DESC;


b) Apresentando o  identificador, nome, descrição e preço dos produtos em ordem 
crescente de nome e decrescente de preço. 

SELECT produto.id, produto.nome, identificacao.descricao, produto.preco
FROM produto
JOIN identificacao ON produto.id = identificacao.id
ORDER BY produto.nome ASC, produto.preco DESC;

c) Inserindo novos registros que permitam agrupamento por nome de identificação. 

INSERT INTO produto (nome, preco, validade) VALUES ('suco', 30.50, '2025-01-01');
INSERT INTO produto (nome, preco, validade) VALUES ('fruta', 5.75, '2024-12-01');
INSERT INTO produto (nome, preco, validade) VALUES ('pão', 15.90, '2024-08-20');

INSERT INTO identificacao (id, nome, descricao) VALUES (10, 'bebida', 'refrigerante');
INSERT INTO identificacao (id, nome, descricao) VALUES (11, 'natural', 'fresca');
INSERT INTO identificacao (id, nome, descricao) VALUES (12, 'trigo', 'integral');

d) Inserindo novos registros que permitam agrupamento por nome de identificação e a 
soma de preços por cada um desses agrupamentos. 


SELECT identificacao.nome, SUM(produto.preco) AS soma_precos
FROM produto
JOIN identificacao ON produto.id = identificacao.id
GROUP BY identificacao.nome;

e) Inserindo novos registros que permitam agrupamento por nome de identificação e a 
média de preços por cada um desses agrupamentos. 

SELECT identificacao.nome, AVG(produto.preco) AS media_precos
FROM produto
JOIN identificacao ON produto.id = identificacao.id
GROUP BY identificacao.nome;

f) Inserindo novos registros que permitam agrupamento por nome de identificação e 
apresente a soma de preços por cada um desses agrupamentos com valor acima de R$ 
100,00. 

SELECT identificacao.nome, SUM(produto.preco) AS soma_precos
FROM produto
JOIN identificacao ON produto.id = identificacao.id
GROUP BY identificacao.nome
HAVING SUM(produto.preco) > 100;


2) Crie duas tabelas com relacionamento de 1:1. Insira registros nessas tabelas. Apresente 
consultas para essas tabelas. As consultas devem incluir: ordenações, agrupamentos e 
condições sobre os agrupamentos. 

CREATE TABLE cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(128) NOT NULL,
    email VARCHAR(128) UNIQUE NOT NULL
);

CREATE TABLE endereco (
    id INT PRIMARY KEY,
    rua VARCHAR(128) NOT NULL,
    cidade VARCHAR(64) NOT NULL,
    estado VARCHAR(32) NOT NULL,
    FOREIGN KEY (id) REFERENCES cliente (id)
);


INSERT INTO cliente (nome, email) VALUES ('João Silva', 'joao@example.com');
INSERT INTO cliente (nome, email) VALUES ('Maria Oliveira', 'maria@example.com');

INSERT INTO endereco (id, rua, cidade, estado) VALUES (1, 'Rua das Flores', 'São Paulo', 'SP');
INSERT INTO endereco (id, rua, cidade, estado) VALUES (2, 'Avenida Central', 'Rio de Janeiro', 'RJ');


SELECT cliente.nome, endereco.rua, endereco.cidade, endereco.estado
FROM cliente
JOIN endereco ON cliente.id = endereco.id
ORDER BY cliente.nome ASC;


SELECT endereco.cidade, COUNT(cliente.id) AS num_clientes
FROM cliente
JOIN endereco ON cliente.id = endereco.id
GROUP BY endereco.cidade;


SELECT cliente.nome, endereco.rua
FROM cliente
JOIN endereco ON cliente.id = endereco.id
WHERE endereco.estado = 'SP';
