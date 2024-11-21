Exercício 
1) Apresente: 
a) O valor total dos produtos em estoque, ordenando de forma decrescente do valor. 

SELECT p.nome AS Produto, SUM(e.quantidade * p.preco) AS Valor_Total
FROM produto p
JOIN estoque e ON p.id = e.id_produto
GROUP BY p.nome
ORDER BY Valor_Total DESC;

b) O valor total dos produtos em estoque por filial, ordenando de forma decrescente do 
valor. 

SELECT f.nome AS Filial, SUM(e.quantidade * p.preco) AS Valor_Total
FROM produto p
JOIN estoque e ON p.id = e.id_produto
JOIN filial f ON e.cnpj_filial = f.cnpj
GROUP BY f.nome
ORDER BY Valor_Total DESC;

2) Insira novos registros nas tabelas. Em seguida, apresente os dados das filiais cuja soma 
dos produtos em estoque ultrapassa R$ 10.000,00.

-- Inserindo novos fornecedores
INSERT INTO fornecedor (nome, telefone, endereco) VALUES
('Nova Distribuidora LTDA', '+55 (32) 9 8765-4321', 'Rua 7, n. 7, Centro');

-- Inserindo novos produtos
INSERT INTO produto (id_fornecedor, nome, preco, validade) VALUES
(1, 'açúcar', 5.50, '2025-06-15');

-- Inserindo novas identificações
INSERT INTO identificacao VALUES
(10, 'cristal', 'refinado');

-- Inserindo nova filial
INSERT INTO filial (cnpj, nome, telefone, endereco) VALUES
('04.123.456/0001-78', 'Nova Filial', '+55 (33) 9 1234-5678', 'Rua 8, n. 8, Nova Cidade');

-- Inserindo novos registros no estoque
INSERT INTO estoque (id_produto, cnpj_filial, quantidade) VALUES
(10, '04.123.456/0001-78', 3000);

SELECT f.nome AS Filial, SUM(e.quantidade * p.preco) AS Valor_Total
FROM produto p
JOIN estoque e ON p.id = e.id_produto
JOIN filial f ON e.cnpj_filial = f.cnpj
GROUP BY f.nome
 HAVING SUM(e.quantidade * p.preco) > 10000
ORDER BY Valor_Total DESC;