CREATE TABLE `usuario` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `data_nascimento` date NOT NULL,
  `email` varchar(255) NOT NULL,
  `senha` varchar(12) NOT NULL
);

CREATE TABLE `telefone`(
	`id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
    `ddi` varchar(3) NOT NULL,
    `ddd` varchar(3) NOT NULL,
    `numero` varchar(9) NOT NULL
);

CREATE TABLE `biblioteca` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `id_usuario` int AUTO_INCREMENT
);

CREATE TABLE `midia` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `titulo` varchar(100) NOT NULL,
  `ano` int NOT NULL,
  `genero` varchar(50) NOT NULL
);

CREATE TABLE `midias_biblioteca` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `id_midia` int NOT NULL,
  `id_biblioteca` int NOT NULL
);

CREATE TABLE `playlist` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `id_biblioteca` int AUTO_INCREMENT
);

CREATE TABLE `midias_playlist` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `midia_atual` varchar(100) NOT NULL,
  `order_execucao` int NOT NULL,
  `id_midia` int NOT NULL,
  `id_playlist` int NOT NULL
);

CREATE TABLE `artista` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `nome` varchar(100) NOT NULL,
  `data_nascimento` date NOT NULL,
  `genero` varchar(20) NOT NULL
);

CREATE TABLE `ator` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `id_artista` int NOT NULL
);

CREATE TABLE `formacao_ator` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `id_ator` int
);

CREATE TABLE `elenco` (
  `int` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `id_ator` int NOT NULL,
  `id_filme` int NOT NULL
);

CREATE TABLE `musico` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `id_artista` int NOT NULL,
  `atuacao` varchar(20) NOT NULL
);

CREATE TABLE `atuacao` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nome_atuacao` varchar(20) NOT NULL AUTO_INCREMENT,
  `id_musico` int NOT NULL
);

CREATE TABLE `musica` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `duracao` datetime NOT NULL,
  `nota` int NOT NULL,
  `id_midia` int NOT NULL,
  `id_musico` int NOT NULL
);

CREATE TABLE `filme` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `duracao` datetime NOT NULL,
  `tipo` varchar(5) NOT NULL,
  `nome_diretor` varchar(100) NOT NULL,
  `nome_produtor` varchar(100) NOT NULL,
  `id_midia` int NOT NULL
);

CREATE TABLE `premiacoes` (
  `id` int PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `premiacao` varchar(100) NOT NULL,
  `ano_premiacao` int NOT NULL,
  `id_artista` int NOT NULL
);

ALTER TABLE `telefone` ADD FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

ALTER TABLE `biblioteca` ADD FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id`);

ALTER TABLE `midias_biblioteca` ADD FOREIGN KEY (`id_midia`) REFERENCES `midia` (`id`);

ALTER TABLE `midias_biblioteca` ADD FOREIGN KEY (`id_biblioteca`) REFERENCES `biblioteca` (`id`);

ALTER TABLE `playlist` ADD FOREIGN KEY (`id_biblioteca`) REFERENCES `biblioteca` (`id`);

ALTER TABLE `midias_playlist` ADD FOREIGN KEY (`id_midia`) REFERENCES `midia` (`id`);

ALTER TABLE `midias_playlist` ADD FOREIGN KEY (`id_playlist`) REFERENCES `playlist` (`id`);

ALTER TABLE `ator` ADD FOREIGN KEY (`id_artista`) REFERENCES `artista` (`id`);

ALTER TABLE `formacao_ator` ADD FOREIGN KEY (`id_ator`) REFERENCES `ator` (`id`);

ALTER TABLE `elenco` ADD FOREIGN KEY (`id_ator`) REFERENCES `ator` (`id`);

ALTER TABLE `elenco` ADD FOREIGN KEY (`id_filme`) REFERENCES `filme` (`id`);

ALTER TABLE `musico` ADD FOREIGN KEY (`id_artista`) REFERENCES `artista` (`id`);

ALTER TABLE `atuacao` ADD FOREIGN KEY (`id_musico`) REFERENCES `musico` (`id`);

ALTER TABLE `musica` ADD FOREIGN KEY (`id_midia`) REFERENCES `midia` (`id`);

ALTER TABLE `musica` ADD FOREIGN KEY (`id_musico`) REFERENCES `musico` (`id`);

ALTER TABLE `filme` ADD FOREIGN KEY (`id_midia`) REFERENCES `midia` (`id`);

ALTER TABLE `premiacoes` ADD FOREIGN KEY (`id_artista`) REFERENCES `artista` (`id`);