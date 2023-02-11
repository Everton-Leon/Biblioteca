-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 11-Fev-2023 às 19:40
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `emprestimos`
--

CREATE TABLE `emprestimos` (
  `idEmprestimo` int(11) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `nCadastro` int(150) NOT NULL,
  `codLivro` int(150) NOT NULL,
  `dataEmpre` varchar(50) NOT NULL,
  `dataDevo` varchar(50) NOT NULL,
  `status` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `emprestimos`
--

INSERT INTO `emprestimos` (`idEmprestimo`, `nome`, `nCadastro`, `codLivro`, `dataEmpre`, `dataDevo`, `status`) VALUES
(12, 'rafinha', 543543, 5, '10/10/1000', '00/00/0000', 'Emprestado'),
(13, 'Emanuelle Cristine Cardoso Silva', 1234, 7, '13/01/2023', '13/01/2023', 'Disponível');

-- --------------------------------------------------------

--
-- Estrutura da tabela `livros`
--

CREATE TABLE `livros` (
  `cod` int(150) NOT NULL,
  `titulo` varchar(150) NOT NULL,
  `ano` int(11) NOT NULL,
  `autor` varchar(150) NOT NULL,
  `editora` varchar(150) NOT NULL,
  `classificacao` varchar(120) NOT NULL,
  `estante` int(200) NOT NULL,
  `exemplares` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `livros`
--

INSERT INTO `livros` (`cod`, `titulo`, `ano`, `autor`, `editora`, `classificacao`, `estante`, `exemplares`) VALUES
(4, '1984', 1949, 'George Orwell', 'Biblioteca Azul', 'Distopia', 4, 5),
(5, 'Um Dia', 2009, 'David Nichollis', 'Intrínseca', 'Romance', 8, 2),
(6, 'Kindred', 1979, 'Octavia E. Butler', 'Morro Branco', 'Ficção Cientifica', 22, 9),
(7, 'O Retrato de Dorian Gray', 1889, 'Oscar Wilde', 'Seguinte', 'Drama', 4, 5),
(8, 'Cosmos', 2017, 'Carl Sagan', 'Companhia das Letras', 'Ciência ', 20, 7),
(9, 'Uzumaki', 1998, 'Junji Ito', 'Viz', 'Terror', 39, 2),
(10, 'A Divina Comédia: Inferno', 1304, 'Dante Alighieri', 'Principis', 'Poesia', 50, 4),
(11, 'A República do Dragão', 2023, 'R.F. Kuang', 'Intrínseca', 'Fantasia', 13, 8),
(12, 'Conectadas', 2019, 'Clara Alves', 'Seginte', 'Infato Juvenil', 7, 3);

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `senha` varchar(150) NOT NULL,
  `email` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `senha`, `email`) VALUES
(1, 'Admin', 'admin', 'admin@hotmail.com');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `emprestimos`
--
ALTER TABLE `emprestimos`
  ADD PRIMARY KEY (`idEmprestimo`),
  ADD KEY `codLivro` (`codLivro`);

--
-- Índices para tabela `livros`
--
ALTER TABLE `livros`
  ADD PRIMARY KEY (`cod`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `emprestimos`
--
ALTER TABLE `emprestimos`
  MODIFY `idEmprestimo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de tabela `livros`
--
ALTER TABLE `livros`
  MODIFY `cod` int(150) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `emprestimos`
--
ALTER TABLE `emprestimos`
  ADD CONSTRAINT `emprestimos_ibfk_1` FOREIGN KEY (`codLivro`) REFERENCES `livros` (`cod`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
