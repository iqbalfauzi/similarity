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
-- Table structure for table `datapb`
--

CREATE TABLE IF NOT EXISTS `datapb` (
`no` int(11) NOT NULL,
  `model_1` varchar(200) DEFAULT NULL,
  `model_2` varchar(200) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `datapb`
--

INSERT INTO `datapb` (`no`, `model_1`, `model_2`) VALUES
(1, 'Akademik_Al-Rifai.pnml', 'Akademik_Ar-Rohmah_2.pnml'),
(2, 'Kesantrian_Al-Rifai.pnml', 'Akademik_Ar-Rohmah_2.pnml');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `datapb`
--
ALTER TABLE `datapb`
 ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `datapb`
--
ALTER TABLE `datapb`
MODIFY `no` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
