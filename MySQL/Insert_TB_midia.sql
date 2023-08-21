use valdisnei;

INSERT INTO midia
( -- Columns to insert data into
 `ano`, `genero`, `titulo`, `musica`
)
VALUES
( -- First row: values for the columns in the list above
 2015, "samba", "Diamonds Envolvente", 1
),
( -- Second row: values for the columns in the list above
 2023, "axé", "Obrigada, Anterior", 2
);

SELECT * from midia;