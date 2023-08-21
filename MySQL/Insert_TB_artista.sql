USE valdisnei;

-- Insert rows into table 'artista'
INSERT INTO artista
( -- Columns to insert data into
 `data_de_nascimento`, `genero`, `nome`
)
VALUES
( -- First row: values for the columns in the list above
 "22/03/1992", "Feminino", "Ariana Pequena"
);

SELECT * FROM artista;