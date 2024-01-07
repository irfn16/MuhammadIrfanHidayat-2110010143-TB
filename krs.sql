-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2024 at 09:30 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.1.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `krs`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_krs`
--

CREATE TABLE `data_krs` (
  `id` int(11) NOT NULL,
  `nim` int(11) NOT NULL,
  `matkul` varchar(40) NOT NULL,
  `sks` int(2) NOT NULL,
  `semester` int(2) NOT NULL,
  `dosen` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_krs`
--

INSERT INTO `data_krs` (`id`, `nim`, `matkul`, `sks`, `semester`, `dosen`) VALUES
(1, 2147483647, 'Algoritma & Pemrograman 2', 3, 1, 'Yusri Ikhwani, S.Kom., M.Kom'),
(2, 2110010143, 'Pemrograman Berbasis Objek 2', 2, 5, 'M. Edya Rosadi, S.Kom., M.Komn');

-- --------------------------------------------------------

--
-- Table structure for table `data_matkul`
--

CREATE TABLE `data_matkul` (
  `id` int(11) NOT NULL,
  `matkul` varchar(40) NOT NULL,
  `waktu` varchar(15) NOT NULL,
  `semester` int(2) NOT NULL,
  `dosen` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_matkul`
--

INSERT INTO `data_matkul` (`id`, `matkul`, `waktu`, `semester`, `dosen`) VALUES
(1, 'Algoritma & Pemrograman 2', '09.40-10.20', 2, 'Yusri Ikhwani, S.Kom., M.Kom'),
(2, 'Pemrograman Visual 2', '11.20-12.00', 5, 'M. Edya Rosadi , S.Kom., M.Kom');

-- --------------------------------------------------------

--
-- Table structure for table `data_mhs`
--

CREATE TABLE `data_mhs` (
  `id` int(11) NOT NULL,
  `nama` varchar(35) NOT NULL,
  `alamat` text NOT NULL,
  `jk` varchar(20) NOT NULL,
  `jurusan` varchar(35) NOT NULL,
  `fakultas` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_mhs`
--

INSERT INTO `data_mhs` (`id`, `nama`, `alamat`, `jk`, `jurusan`, `fakultas`) VALUES
(2110010143, 'Muhammad Irfan Hidayat', 'Banjar', 'Laki-Laki', 'Teknik Informatika', 'Teknologi Informasi'),
(2111010710, 'Khalisha Faliha Musyassarah', 'Banjarmasin', 'Perempuan', 'Sistem Informasi', 'Teknologi Informasi');

-- --------------------------------------------------------

--
-- Table structure for table `data_spp`
--

CREATE TABLE `data_spp` (
  `id` int(11) NOT NULL,
  `nama` varchar(35) NOT NULL,
  `jurusan` varchar(30) NOT NULL,
  `semester` int(2) NOT NULL,
  `biaya` varchar(15) NOT NULL,
  `tgl` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_spp`
--

INSERT INTO `data_spp` (`id`, `nama`, `jurusan`, `semester`, `biaya`, `tgl`) VALUES
(2110010143, 'Muhammad Irfan Hidayat', 'Teknik Informatika', 4, '3.600.000', '07/01/2024'),
(2110010143, 'Khalisha Faliha Muyassarah', 'Teknik Informatika', 2, '4.200.000', '08/01/2024');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(35) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`) VALUES
(1, 'irfan', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_mhs`
--
ALTER TABLE `data_mhs`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
