Exercício
 1) Apresente:
 a) A somadospreços dos produtos por fornecedor, ordenando de forma decrescente do
 valor da soma.
 
SELECT f.nome AS fornecedor, SUM(p.preco) AS soma_preco
FROM fornecedor f
JOIN produto p ON f.id = p.id_fornecedor
GROUP BY f.nome
ORDER BY soma_preco DESC;

 
 b) A média aritmética dos preços dos produtos por fornecedor, ordenando de forma
 decrescente do valor da soma.
 
 SELECT f.nome AS fornecedor, AVG(p.preco) AS media_preco
FROM fornecedor f
JOIN produto p ON f.id = p.id_fornecedor
GROUP BY f.nome
ORDER BY media_preco DESC;

 2) Insira novos registros nas tabelas. Em seguida, apresente os dados dos fornecedores cuja
 soma dosprodutos ultrapassa R$ 500,00
 
 -- Inserir novos registros na tabela fornecedor
INSERT INTO fornecedor (nome, telefone, endereco)
VALUES ('Nova Empresa LTDA', '+55 (99) 9 9999-9999', 'Rua Nova, n. 99, Bairro Novo');

-- Inserir novos registros na tabela produto
INSERT INTO produto (id_fornecedor, nome, preco, validade)
VALUES (4, 'produto1', 300.00, '2025-01-01'),
       (4, 'produto2', 250.00, '2025-01-02');

-- Consultar fornecedores cuja soma dos preços dos produtos ultrapassa R$ 500,00
SELECT f.nome AS fornecedor, SUM(p.preco) AS soma_preco
FROM fornecedor f
JOIN produto p ON f.id = p.id_fornecedor
GROUP BY f.nome
HAVING soma_preco > 500;
