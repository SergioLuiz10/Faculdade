create table medico (
   id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    telefone VARCHAR(15) NOT NULL,
    cpf VARCHAR(11) NOT NULL,
    especializacao VARCHAR(100) NOT NULL,
    salario varchar(100) NOT NULL
);