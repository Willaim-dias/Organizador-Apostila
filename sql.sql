CREATE DATABASE SavePDF;

CREATE TABLE IF NOT EXISTS PDFs (
	ID INTEGER PRIMARY KEY AUTO_INCREMENT,
	Nome_arquivo TEXT NOT NULL,
	Referencia TEXT,
	Descricao TEXT,
	PDF BLOB NOT NULL
);