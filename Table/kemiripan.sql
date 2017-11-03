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
-- Table structure for table `kemiripan`
--

CREATE TABLE IF NOT EXISTS `kemiripan` (
  `model_1` varchar(100) DEFAULT NULL,
  `model_2` varchar(100) DEFAULT NULL,
  `s_jaccard` varchar(100) DEFAULT NULL,
  `s_dice` varchar(100) DEFAULT NULL,
  `s_cosine` varchar(100) DEFAULT NULL,
  `s_overlap` varchar(100) DEFAULT NULL,
  `b_jaccard` varchar(100) DEFAULT NULL,
  `b_dice` varchar(100) DEFAULT NULL,
  `b_cosine` varchar(100) DEFAULT NULL,
  `b_overlap` varchar(100) DEFAULT NULL,
  `semantic` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `kemiripan`
--

INSERT INTO `kemiripan` (`model_1`, `model_2`, `s_jaccard`, `s_dice`, `s_cosine`, `s_overlap`, `b_jaccard`, `b_dice`, `b_cosine`, `b_overlap`, `semantic`) VALUES
('Akademik_Al-Rifai.pnml', 'Akademik_Al-Rifai.pnml', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000'),
('Akademik_Al-Rifai.pnml', 'Akademik_Anwarul_Huda.pnml', '0.356', '0.525', '0.525', '0.525', '0.059', '0.111', '0.111', '0.111', '0.786'),
('Akademik_Al-Rifai.pnml', 'Akademik_Ar-Rohmah_2.pnml', '0.617', '0.763', '0.764', '0.806', '0.214', '0.353', '0.354', '0.375', '0.893'),
('Akademik_Al-Rifai.pnml', 'Akademik_Z.pnml', '0.860', '0.925', '0.925', '0.925', '0.385', '0.556', '0.556', '0.556', '0.990'),
('Akademik_Anwarul_Huda.pnml', 'Akademik_Anwarul_Huda.pnml', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000'),
('Akademik_Anwarul_Huda.pnml', 'Akademik_Ar-Rohmah_2.pnml', '0.407', '0.579', '0.580', '0.611', '0.133', '0.235', '0.236', '0.250', '0.810'),
('Akademik_Anwarul_Huda.pnml', 'Akademik_Z.pnml', '0.356', '0.525', '0.525', '0.525', '0.059', '0.111', '0.111', '0.111', '0.793'),
('Akademik_Ar-Rohmah_2.pnml', 'Akademik_Ar-Rohmah_2.pnml', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000'),
('Akademik_Z.pnml', 'Akademik_Ar-Rohmah_2.pnml', '0.652', '0.789', '0.791', '0.833', '0.417', '0.588', '0.589', '0.625', '0.891'),
('Akademik_Z.pnml', 'Akademik_Z.pnml', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000'),
('Kesantrian_Al-Rifai.pnml', 'Kesantrian_Al-Rifai.pnml', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000'),
('Kesantrian_Al-Rifai.pnml', 'Kesantrian_Luhur.pnml', '0.250', '0.400', '0.400', '0.417', '0.000', '0.000', '0.000', '0.000', '0.776'),
('Kesantrian_Al-Rifai.pnml', 'Kesantrian_Y.pnml', '0.545', '0.706', '0.706', '0.720', '0.222', '0.364', '0.365', '0.400', '0.926'),
('Kesantrian_Al-Rifai.pnml', 'Kesantrian_Z.pnml', '0.424', '0.596', '0.599', '0.667', '0.429', '0.600', '0.612', '0.750', '0.927'),
('Kesantrian_Luhur.pnml', 'Kesantrian_Luhur.pnml', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000'),
('Kesantrian_Luhur.pnml', 'Kesantrian_Y.pnml', '0.441', '0.612', '0.612', '0.625', '0.100', '0.182', '0.183', '0.200', '0.808'),
('Kesantrian_Luhur.pnml', 'Kesantrian_Z.pnml', '0.406', '0.578', '0.579', '0.619', '0.000', '0.000', '0.000', '0.000', '0.743'),
('Kesantrian_Y.pnml', 'Kesantrian_Y.pnml', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000'),
('Kesantrian_Y.pnml', 'Kesantrian_Z.pnml', '0.394', '0.565', '0.567', '0.619', '0.286', '0.444', '0.447', '0.500', '0.853'),
('Kesantrian_Z.pnml', 'Kesantrian_Z.pnml', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000', '1.000'),
('PSB_Annur_1.pnml', 'PSB_Anwarul_Huda.pnml', '0.404', '0.576', '0.576', '0.594', '0.062', '0.118', '0.118', '0.125', '0.874'),
('PSB_Annur_1.pnml', 'PSB_Luhur.pnml', '0.378', '0.548', '0.549', '0.567', '0.067', '0.125', '0.126', '0.143', '0.914'),
('PSB_Annur_1.pnml', 'PSB_SMPN_13_Malang.pnml', '0.306', '0.469', '0.469', '0.469', '0.062', '0.118', '0.118', '0.125', '0.809'),
('PSB_Anwarul_Huda.pnml', 'PSB_Luhur.pnml', '0.280', '0.438', '0.438', '0.467', '0.250', '0.400', '0.401', '0.429', '0.878'),
('PSB_Anwarul_Huda.pnml', 'PSB_SMPN_13_Malang.pnml', '0.269', '0.424', '0.424', '0.438', '0.231', '0.375', '0.375', '0.375', '0.868'),
('PSB_SMPN_13_Malang.pnml', 'PSB_Luhur.pnml', '0.348', '0.516', '0.516', '0.533', '0.154', '0.267', '0.267', '0.286', '0.781'),
('Sarpras_Al-Rifai.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.269', '0.424', '0.424', '0.438', '0.167', '0.286', '0.289', '0.333', '0.775'),
('Sarpras_Al-Rifai.pnml', 'Sarpras_Luhur.pnml', '0.545', '0.706', '0.706', '0.706', '0.000', '0.000', '0.000', '0.000', '0.921'),
('Sarpras_Al-Rifai.pnml', 'Sarpras_Z.pnml', '0.500', '0.667', '0.673', '0.769', '0.250', '0.400', '0.408', '0.500', '0.921'),
('Sarpras_Anwarul_Huda.pnml', 'Sarpras_Luhur.pnml', '0.375', '0.545', '0.546', '0.562', '0.000', '0.000', '0.000', '0.000', '0.897'),
('Sarpras_Anwarul_Huda.pnml', 'Sarpras_Z.pnml', '0.526', '0.690', '0.693', '0.769', '0.200', '0.333', '0.354', '0.500', '0.897'),
('Sarpras_Luhur.pnml', 'Sarpras_Z.pnml', '0.667', '0.800', '0.807', '0.923', '0.250', '0.400', '0.408', '0.500', '0.925'),
('Kesantrian_Al-Rifai.pnml', 'Sarpras_Al-Rifai.pnml', '0.229', '0.372', '0.381', '0.471', '0.000', '0.000', '0.000', '0.000', '0.408'),
('Kesantrian_Al-Rifai.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.200', '0.333', '0.343', '0.438', '0.000', '0.000', '0.000', '0.000', '0.391'),
('Kesantrian_Al-Rifai.pnml', 'Sarpras_Luhur.pnml', '0.194', '0.326', '0.333', '0.412', '0.000', '0.000', '0.000', '0.000', '0.410'),
('Kesantrian_Al-Rifai.pnml', 'Sarpras_Z.pnml', '0.182', '0.308', '0.326', '0.462', '0.000', '0.000', '0.000', '0.000', '0.408'),
('Kesantrian_Luhur.pnml', 'Sarpras_Al-Rifai.pnml', '0.281', '0.439', '0.446', '0.529', '0.125', '0.222', '0.236', '0.333', '0.467'),
('Kesantrian_Luhur.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.429', '0.600', '0.612', '0.750', '0.111', '0.200', '0.204', '0.250', '0.432'),
('Kesantrian_Luhur.pnml', 'Sarpras_Luhur.pnml', '0.281', '0.439', '0.446', '0.529', '0.125', '0.222', '0.236', '0.333', '0.458'),
('Kesantrian_Luhur.pnml', 'Sarpras_Z.pnml', '0.233', '0.378', '0.396', '0.538', '0.000', '0.000', '0.000', '0.000', '0.458'),
('Kesantrian_Y.pnml', 'Sarpras_Al-Rifai.pnml', '0.235', '0.381', '0.388', '0.471', '0.000', '0.000', '0.000', '0.000', '0.418'),
('Kesantrian_Y.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.414', '0.585', '0.600', '0.750', '0.125', '0.222', '0.224', '0.250', '0.401'),
('Kesantrian_Y.pnml', 'Sarpras_Luhur.pnml', '0.200', '0.333', '0.340', '0.412', '0.000', '0.000', '0.000', '0.000', '0.421'),
('Kesantrian_Y.pnml', 'Sarpras_Z.pnml', '0.188', '0.316', '0.333', '0.462', '0.000', '0.000', '0.000', '0.000', '0.418'),
('Kesantrian_Z.pnml', 'Sarpras_Al-Rifai.pnml', '0.267', '0.421', '0.423', '0.471', '0.000', '0.000', '0.000', '0.000', '0.421'),
('Kesantrian_Z.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.321', '0.486', '0.491', '0.562', '0.000', '0.000', '0.000', '0.000', '0.405'),
('Kesantrian_Z.pnml', 'Sarpras_Luhur.pnml', '0.226', '0.368', '0.370', '0.412', '0.000', '0.000', '0.000', '0.000', '0.424'),
('Kesantrian_Z.pnml', 'Sarpras_Z.pnml', '0.214', '0.353', '0.363', '0.462', '0.000', '0.000', '0.000', '0.000', '0.421'),
('PSB_Annur_1.pnml', 'Sarpras_Al-Rifai.pnml', '0.289', '0.449', '0.472', '0.647', '0.000', '0.000', '0.000', '0.000', '0.408'),
('PSB_Annur_1.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.297', '0.458', '0.486', '0.688', '0.083', '0.154', '0.167', '0.250', '0.382'),
('PSB_Annur_1.pnml', 'Sarpras_Luhur.pnml', '0.256', '0.408', '0.429', '0.588', '0.200', '0.333', '0.385', '0.667', '0.411'),
('PSB_Annur_1.pnml', 'Sarpras_Z.pnml', '0.184', '0.311', '0.343', '0.538', '0.100', '0.182', '0.236', '0.500', '0.405'),
('PSB_Anwarul_Huda.pnml', 'Sarpras_Al-Rifai.pnml', '0.214', '0.353', '0.374', '0.529', '0.100', '0.182', '0.204', '0.333', '0.405'),
('PSB_Anwarul_Huda.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.190', '0.320', '0.343', '0.500', '0.000', '0.000', '0.000', '0.000', '0.383'),
('PSB_Anwarul_Huda.pnml', 'Sarpras_Luhur.pnml', '0.214', '0.353', '0.374', '0.529', '0.000', '0.000', '0.000', '0.000', '0.408'),
('PSB_Anwarul_Huda.pnml', 'Sarpras_Z.pnml', '0.146', '0.255', '0.285', '0.462', '0.000', '0.000', '0.000', '0.000', '0.401'),
('PSB_Luhur.pnml', 'Sarpras_Al-Rifai.pnml', '0.270', '0.426', '0.443', '0.588', '0.111', '0.200', '0.218', '0.333', '0.439'),
('PSB_Luhur.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.095', '0.174', '0.183', '0.250', '0.000', '0.000', '0.000', '0.000', '0.418'),
('PSB_Luhur.pnml', 'Sarpras_Luhur.pnml', '0.237', '0.383', '0.399', '0.529', '0.000', '0.000', '0.000', '0.000', '0.439'),
('PSB_Luhur.pnml', 'Sarpras_Z.pnml', '0.162', '0.279', '0.304', '0.462', '0.000', '0.000', '0.000', '0.000', '0.438'),
('PSB_SMPN_13_Malang.pnml', 'Sarpras_Al-Rifai.pnml', '0.289', '0.449', '0.472', '0.647', '0.100', '0.182', '0.204', '0.333', '0.417'),
('PSB_SMPN_13_Malang.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.091', '0.167', '0.177', '0.250', '0.000', '0.000', '0.000', '0.000', '0.395'),
('PSB_SMPN_13_Malang.pnml', 'Sarpras_Luhur.pnml', '0.225', '0.367', '0.386', '0.529', '0.000', '0.000', '0.000', '0.000', '0.420'),
('PSB_SMPN_13_Malang.pnml', 'Sarpras_Z.pnml', '0.184', '0.311', '0.343', '0.538', '0.000', '0.000', '0.000', '0.000', '0.408'),
('Akademik_Al-Rifai.pnml', 'Sarpras_Al-Rifai.pnml', '0.163', '0.281', '0.307', '0.471', '0.000', '0.000', '0.000', '0.000', '0.425'),
('Akademik_Al-Rifai.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.191', '0.321', '0.356', '0.562', '0.000', '0.000', '0.000', '0.000', '0.420'),
('Akademik_Al-Rifai.pnml', 'Sarpras_Luhur.pnml', '0.163', '0.281', '0.307', '0.471', '0.000', '0.000', '0.000', '0.000', '0.425'),
('Akademik_Al-Rifai.pnml', 'Sarpras_Z.pnml', '0.128', '0.226', '0.263', '0.462', '0.000', '0.000', '0.000', '0.000', '0.425'),
('Akademik_Anwarul_Huda.pnml', 'Sarpras_Al-Rifai.pnml', '0.118', '0.211', '0.230', '0.353', '0.000', '0.000', '0.000', '0.000', '0.409'),
('Akademik_Anwarul_Huda.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.167', '0.286', '0.316', '0.500', '0.000', '0.000', '0.000', '0.000', '0.420'),
('Akademik_Anwarul_Huda.pnml', 'Sarpras_Luhur.pnml', '0.140', '0.246', '0.268', '0.412', '0.000', '0.000', '0.000', '0.000', '0.407'),
('Akademik_Anwarul_Huda.pnml', 'Sarpras_Z.pnml', '0.104', '0.189', '0.219', '0.385', '0.000', '0.000', '0.000', '0.000', '0.407'),
('Akademik_Ar-Rohmah_2.pnml', 'Sarpras_Al-Rifai.pnml', '0.152', '0.264', '0.283', '0.412', '0.100', '0.182', '0.204', '0.333', '0.419'),
('Akademik_Ar-Rohmah_2.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.182', '0.308', '0.333', '0.500', '0.000', '0.000', '0.000', '0.000', '0.426'),
('Akademik_Ar-Rohmah_2.pnml', 'Sarpras_Luhur.pnml', '0.152', '0.264', '0.283', '0.412', '0.000', '0.000', '0.000', '0.000', '0.419'),
('Akademik_Ar-Rohmah_2.pnml', 'Sarpras_Z.pnml', '0.114', '0.204', '0.231', '0.385', '0.000', '0.000', '0.000', '0.000', '0.419'),
('Akademik_Z.pnml', 'Sarpras_Al-Rifai.pnml', '0.163', '0.281', '0.307', '0.471', '0.000', '0.000', '0.000', '0.000', '0.421'),
('Akademik_Z.pnml', 'Sarpras_Anwarul_Huda.pnml', '0.191', '0.321', '0.356', '0.562', '0.000', '0.000', '0.000', '0.000', '0.418'),
('Akademik_Z.pnml', 'Sarpras_Luhur.pnml', '0.163', '0.281', '0.307', '0.471', '0.000', '0.000', '0.000', '0.000', '0.422'),
('Akademik_Z.pnml', 'Sarpras_Z.pnml', '0.128', '0.226', '0.263', '0.462', '0.000', '0.000', '0.000', '0.000', '0.421'),
('1PSB_Annur_1.pnml', 'Kesantrian_Al-Rifai.pnml', '0.208', '0.345', '0.347', '0.385', '0.071', '0.133', '0.136', '0.167', '0.392'),
('1PSB_Annur_1.pnml', 'Kesantrian_Luhur.pnml', '0.400', '0.571', '0.577', '0.667', '0.071', '0.133', '0.136', '0.167', '0.418'),
('1PSB_Annur_1.pnml', 'Kesantrian_Y.pnml', '0.326', '0.491', '0.495', '0.560', '0.167', '0.286', '0.298', '0.400', '0.418'),
('1PSB_Annur_1.pnml', 'Kesantrian_Z.pnml', '0.233', '0.377', '0.386', '0.476', '0.083', '0.154', '0.167', '0.250', '0.381'),
('2PSB_Anwarul_Huda.pnml', 'Kesantrian_Al-Rifai.pnml', '0.224', '0.367', '0.370', '0.423', '0.077', '0.143', '0.144', '0.167', '0.404'),
('2PSB_Anwarul_Huda.pnml', 'Kesantrian_Luhur.pnml', '0.415', '0.586', '0.595', '0.708', '0.167', '0.286', '0.289', '0.333', '0.413'),
('2PSB_Anwarul_Huda.pnml', 'Kesantrian_Y.pnml', '0.255', '0.407', '0.412', '0.480', '0.083', '0.154', '0.158', '0.200', '0.420'),
('2PSB_Anwarul_Huda.pnml', 'Kesantrian_Z.pnml', '0.279', '0.436', '0.449', '0.571', '0.091', '0.167', '0.177', '0.250', '0.383'),
('3PSB_Luhur.pnml', 'Kesantrian_Al-Rifai.pnml', '0.143', '0.250', '0.251', '0.269', '0.083', '0.154', '0.154', '0.167', '0.417'),
('3PSB_Luhur.pnml', 'Kesantrian_Luhur.pnml', '0.200', '0.333', '0.335', '0.375', '0.083', '0.154', '0.154', '0.167', '0.438'),
('3PSB_Luhur.pnml', 'Kesantrian_Y.pnml', '0.170', '0.291', '0.292', '0.320', '0.091', '0.167', '0.169', '0.200', '0.443'),
('3PSB_Luhur.pnml', 'Kesantrian_Z.pnml', '0.109', '0.196', '0.199', '0.238', '0.100', '0.182', '0.189', '0.250', '0.394'),
('4PSB_SMPN_13_Malang.pnml', 'Kesantrian_Al-Rifai.pnml', '0.261', '0.414', '0.416', '0.462', '0.077', '0.143', '0.144', '0.167', '0.407'),
('4PSB_SMPN_13_Malang.pnml', 'Kesantrian_Luhur.pnml', '0.167', '0.286', '0.289', '0.333', '0.077', '0.143', '0.144', '0.167', '0.434'),
('4PSB_SMPN_13_Malang.pnml', 'Kesantrian_Y.pnml', '0.188', '0.316', '0.318', '0.360', '0.083', '0.154', '0.158', '0.200', '0.426'),
('4PSB_SMPN_13_Malang.pnml', 'Kesantrian_Z.pnml', '0.205', '0.340', '0.347', '0.429', '0.091', '0.167', '0.177', '0.250', '0.405'),
('Akademik_Al-Rifai.pnml', 'Kesantrian_Al-Rifai.pnml', '0.294', '0.455', '0.465', '0.577', '0.154', '0.267', '0.272', '0.333', '0.412'),
('Akademik_Al-Rifai.pnml', 'Kesantrian_Luhur.pnml', '0.280', '0.438', '0.452', '0.583', '0.000', '0.000', '0.000', '0.000', '0.401'),
('Akademik_Al-Rifai.pnml', 'Kesantrian_Y.pnml', '0.354', '0.523', '0.538', '0.680', '0.077', '0.143', '0.149', '0.200', '0.390'),
('Akademik_Al-Rifai.pnml', 'Kesantrian_Z.pnml', '0.245', '0.393', '0.414', '0.571', '0.083', '0.154', '0.167', '0.250', '0.396'),
('Akademik_Anwarul_Huda.pnml', 'Kesantrian_Al-Rifai.pnml', '0.158', '0.273', '0.279', '0.346', '0.000', '0.000', '0.000', '0.000', '0.469'),
('Akademik_Anwarul_Huda.pnml', 'Kesantrian_Luhur.pnml', '0.231', '0.375', '0.387', '0.500', '0.000', '0.000', '0.000', '0.000', '0.435'),
('Akademik_Anwarul_Huda.pnml', 'Kesantrian_Y.pnml', '0.226', '0.369', '0.379', '0.480', '0.077', '0.143', '0.149', '0.200', '0.457'),
('Akademik_Anwarul_Huda.pnml', 'Kesantrian_Z.pnml', '0.196', '0.328', '0.345', '0.476', '0.000', '0.000', '0.000', '0.000', '0.457'),
('Akademik_Ar-Rohmah_2.pnml', 'Kesantrian_Al-Rifai.pnml', '0.265', '0.419', '0.425', '0.500', '0.077', '0.143', '0.144', '0.167', '0.422'),
('Akademik_Ar-Rohmah_2.pnml', 'Kesantrian_Luhur.pnml', '0.277', '0.433', '0.442', '0.542', '0.167', '0.286', '0.289', '0.333', '0.406'),
('Akademik_Ar-Rohmah_2.pnml', 'Kesantrian_Y.pnml', '0.326', '0.492', '0.500', '0.600', '0.182', '0.308', '0.316', '0.400', '0.400'),
('Akademik_Ar-Rohmah_2.pnml', 'Kesantrian_Z.pnml', '0.267', '0.421', '0.436', '0.571', '0.091', '0.167', '0.177', '0.250', '0.408'),
('Akademik_Z.pnml', 'Kesantrian_Al-Rifai.pnml', '0.294', '0.455', '0.465', '0.577', '0.154', '0.267', '0.272', '0.333', '0.412'),
('Akademik_Z.pnml', 'Kesantrian_Luhur.pnml', '0.306', '0.469', '0.484', '0.625', '0.071', '0.133', '0.136', '0.167', '0.401'),
('Akademik_Z.pnml', 'Kesantrian_Y.pnml', '0.354', '0.523', '0.538', '0.680', '0.077', '0.143', '0.149', '0.200', '0.390'),
('Akademik_Z.pnml', 'Kesantrian_Z.pnml', '0.245', '0.393', '0.414', '0.571', '0.083', '0.154', '0.167', '0.250', '0.395'),
('Akademik_Al-Rifai.pnml', 'PSB_Annur_1.pnml', '0.333', '0.500', '0.503', '0.562', '0.200', '0.333', '0.333', '0.333', '0.396'),
('Akademik_Al-Rifai.pnml', 'PSB_Anwarul_Huda.pnml', '0.345', '0.514', '0.515', '0.559', '0.062', '0.118', '0.118', '0.125', '0.421'),
('Akademik_Al-Rifai.pnml', 'PSB_Luhur.pnml', '0.207', '0.343', '0.346', '0.400', '0.067', '0.125', '0.126', '0.143', '0.457'),
('Akademik_Al-Rifai.pnml', 'PSB_SMPN_13_Malang.pnml', '0.200', '0.333', '0.335', '0.375', '0.062', '0.118', '0.118', '0.125', '0.424'),
('Akademik_Anwarul_Huda.pnml', 'PSB_Annur_1.pnml', '0.309', '0.472', '0.475', '0.531', '0.059', '0.111', '0.111', '0.111', '0.410'),
('Akademik_Anwarul_Huda.pnml', 'PSB_Anwarul_Huda.pnml', '0.233', '0.378', '0.380', '0.412', '0.000', '0.000', '0.000', '0.000', '0.439'),
('Akademik_Anwarul_Huda.pnml', 'PSB_Luhur.pnml', '0.186', '0.314', '0.318', '0.367', '0.000', '0.000', '0.000', '0.000', '0.456'),
('Akademik_Anwarul_Huda.pnml', 'PSB_SMPN_13_Malang.pnml', '0.220', '0.361', '0.363', '0.406', '0.000', '0.000', '0.000', '0.000', '0.417'),
('Akademik_Ar-Rohmah_2.pnml', 'PSB_Annur_1.pnml', '0.333', '0.500', '0.501', '0.531', '0.308', '0.471', '0.471', '0.500', '0.406'),
('Akademik_Ar-Rohmah_2.pnml', 'PSB_Anwarul_Huda.pnml', '0.346', '0.514', '0.514', '0.529', '0.231', '0.375', '0.375', '0.375', '0.436'),
('Akademik_Ar-Rohmah_2.pnml', 'PSB_Luhur.pnml', '0.222', '0.364', '0.365', '0.400', '0.154', '0.267', '0.267', '0.286', '0.457'),
('Akademik_Ar-Rohmah_2.pnml', 'PSB_SMPN_13_Malang.pnml', '0.236', '0.382', '0.383', '0.406', '0.143', '0.250', '0.250', '0.250', '0.422'),
('Akademik_Z.pnml', 'PSB_Annur_1.pnml', '0.333', '0.500', '0.503', '0.562', '0.286', '0.444', '0.444', '0.444', '0.397'),
('Akademik_Z.pnml', 'PSB_Anwarul_Huda.pnml', '0.370', '0.541', '0.542', '0.588', '0.133', '0.235', '0.236', '0.250', '0.421'),
('Akademik_Z.pnml', 'PSB_Luhur.pnml', '0.207', '0.343', '0.346', '0.400', '0.067', '0.125', '0.126', '0.143', '0.456'),
('Akademik_Z.pnml', 'PSB_SMPN_13_Malang.pnml', '0.200', '0.333', '0.335', '0.375', '0.062', '0.118', '0.118', '0.125', '0.425'),
('Akademik_Al-Rifai.pnml', 'Kesantrian_Al-Rifai.pnml', '0.294', '0.455', '0.465', '0.577', '0.154', '0.267', '0.272', '0.333', '0.412'),
('Akademik_Anwarul_Huda.pnml', 'Kesantrian_Al-Rifai.pnml', '0.158', '0.273', '0.279', '0.346', '0.000', '0.000', '0.000', '0.000', '0.469');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
