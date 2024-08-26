create database cenaflix;
use cenaflix;

CREATE TABLE `filmes` (
  `id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `nome` varchar(150) NOT NULL,
  `datalancamento` varchar(20) NOT NULL,
  `categoria` varchar(100) NOT NULL
);

select * from filmes;