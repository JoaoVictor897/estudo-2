-- Active: 1694009449018@@127.0.0.1@3306@processador
use intel;
show tables;
select * from computadores;
select * from processadores;
select * from sistemas_operacionais;


INSERT INTO processadores (nome, descricao, marca, modelo, velocidade)
VALUES ('Intel', 'i7 DE ÚLTIMA GERAÇÃO', 'DIOGO DO K9', ' I7-7700K', '4.2Ghz');
INSERT INTO sistemas_operacionais (nome, versao, arquitetura, data_lancamento, fabricante)
VALUES ('Windows', '10', '64 bits', '2020-05-27', 'Microsoft');
INSERT INTO computadores (nome, marca, modelo, sistema_operacional_id, data_aquisicao)
VALUES ('Meu Computador', 'Dell', 'Inspiron 15', 1, '2023-09-14');



