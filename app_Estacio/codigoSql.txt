CREATE DATABASE IF NOT EXISTS biblioteca;

USE biblioteca;

CREATE TABLE livro (
    id_livro INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(20) NOT NULL,
    autor VARCHAR(25) NOT NULL,
    paginas INT NOT NULL,
    sinapse VARCHAR(250) NOT NULL
);

CREATE TABLE aluno (
    id_aluno INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(25) NOT NULL,
    curso VARCHAR(25) NOT NULL
);

CREATE TABLE visualizar (
    id_vis INT PRIMARY KEY NOT NULL,
    id_livro INT NOT NULL,
    id_aluno INT NOT NULL,
    FOREIGN KEY (id_livro) REFERENCES livro(id_livro),
    FOREIGN KEY (id_aluno) REFERENCES aluno(id_aluno)
);