-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jul 02, 2017 at 05:13 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `appsimilarity`
--

-- --------------------------------------------------------

--
-- Table structure for table `datakemiripan`
--

CREATE TABLE IF NOT EXISTS `datakemiripan` (
`no` int(11) NOT NULL,
  `model_1` varchar(100) DEFAULT NULL,
  `model_2` varchar(100) DEFAULT NULL,
  `nilai_1` double DEFAULT NULL,
  `nilai_2` double DEFAULT NULL,
  `elemen_1` varchar(100) DEFAULT NULL,
  `elemen_2` varchar(100) DEFAULT NULL,
  `elemen_3` varchar(100) DEFAULT NULL,
  `elemen_4` varchar(100) DEFAULT NULL,
  `elemen_5` varchar(100) DEFAULT NULL,
  `elemen_6` varchar(100) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datakemiripan`
--

INSERT INTO `datakemiripan` (`no`, `model_1`, `model_2`, `nilai_1`, `nilai_2`, `elemen_1`, `elemen_2`, `elemen_3`, `elemen_4`, `elemen_5`, `elemen_6`) VALUES
(1, 'Akademik_Al-Rifai.pnml dan', 'Akademik_Anwarul_Huda.pnml', 1, 2, 't1', 't2', 't3', 't6', 't7', 't8'),
(2, 'Akademik_Al-Rifai.pnml dan', 'Akademik_Anwarul_Huda.pnml', 0.551, 1.551, 't1', 't2', 't3', 't6', 't7', 't9'),
(3, 'Akademik_Al-Rifai.pnml dan', 'Akademik_Ar-Rohmah_2.pnml', 0.621, 1.621, 't6', 't7', 't9', 't1', 't2', 't3'),
(4, 'Akademik_Anwarul_Huda.pnml dan', 'Akademik_Anwarul_Huda.pnml', 1.001, 2.001, 't1', 't3', 't2', 't5', 't7', 't6');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datakemiripan`
--
ALTER TABLE `datakemiripan`
 ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `datakemiripan`
--
ALTER TABLE `datakemiripan`
MODIFY `no` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
