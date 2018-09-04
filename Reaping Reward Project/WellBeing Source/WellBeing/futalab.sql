-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 04, 2015 at 11:09 AM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `futalab`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE IF NOT EXISTS `admin` (
  `username` varchar(20) NOT NULL,
  `pass` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `pass`) VALUES
('admin', 'a');

-- --------------------------------------------------------

--
-- Table structure for table `attendance`
--

CREATE TABLE IF NOT EXISTS `attendance` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `matricno` varchar(50) NOT NULL,
  `class` varchar(10) NOT NULL,
  `session` varchar(10) NOT NULL,
  `time` varchar(11) NOT NULL,
  `attendance` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=69 ;

--
-- Dumping data for table `attendance`
--

INSERT INTO `attendance` (`id`, `matricno`, `class`, `session`, `time`, `attendance`) VALUES
(64, 'csc/11/6657', 'CSC200', '2014/2015', '1 Jan 2015 ', 1),
(65, 'csc/11/6657', 'CSC100', '2014/2015', '13 Jan 2015', 1),
(66, 'csc/11/6657', 'CSC312', '2014/2015', '19 Jan 2015', 1),
(67, 'csc/11/6657', 'CSC200', '2014/2015', '23 Jan 2015', 1),
(68, 'csc/11/6657', 'CSC200', '2014/2015', '17 Jul 2015', 1);

-- --------------------------------------------------------

--
-- Table structure for table `attendanceaggregate`
--

CREATE TABLE IF NOT EXISTS `attendanceaggregate` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `matricno` varchar(20) NOT NULL,
  `class` varchar(20) NOT NULL,
  `session` varchar(20) NOT NULL,
  `count` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=18 ;

--
-- Dumping data for table `attendanceaggregate`
--

INSERT INTO `attendanceaggregate` (`id`, `matricno`, `class`, `session`, `count`) VALUES
(15, 'csc/11/6657', 'CSC200', '2014/2015', 4),
(16, 'csc/11/6657', 'CSC100', '2014/2015', 2),
(17, 'csc/11/6657', 'CSC312', '2014/2015', 2);

-- --------------------------------------------------------

--
-- Table structure for table `autosave`
--

CREATE TABLE IF NOT EXISTS `autosave` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `matricno` varchar(50) NOT NULL,
  `class` varchar(10) NOT NULL,
  `session` varchar(10) NOT NULL,
  `code` text NOT NULL,
  `time` varchar(11) NOT NULL,
  `remaintimer` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=57 ;

--
-- Dumping data for table `autosave`
--

INSERT INTO `autosave` (`id`, `matricno`, `class`, `session`, `code`, `time`, `remaintimer`) VALUES
(47, 'csc/11/6657', 'CSC200', '2014/2015', '//Please Enter Your Code Below or Open File\nimport java.sql.* ;\nimport javax.swing.* ;\n\npublic class NewClass {\n    Connection conn = null ;\n    public static String IP ;\n    public static Connection ConnectDb() {\n      \n        try {\n           Class.forName("com.mysql.jdbc.Driver") ;\n         IP = "localhost" ;\n          Connection conn = DriverManager.getConnection("jdbc:mysql://"+IP+"/FutaLab","root", "");\n        return conn ;\n        \n        }\n        catch (Exception e) {\n          JOptionPane.showMessageDialog(null, e);  \n          return null;\n        }\n        \n    }\n    \n}\n', '1 Jan 2015 ', '1'),
(48, 'csc/11/6657', 'CSC100', '2014/2015', ' public ', '1 Jan 2015 ', '75'),
(49, 'csc/11/6657', 'CSC100', '2014/2015', 'mysql_', '13 Jan 2015', '1'),
(50, 'csc/11/6657', 'CSC312', '2014/2015', '<?   \necho ;\n\n?>', '19 Jan 2015', '1'),
(51, 'csc/11/6657', 'CSC100', '2014/2015', '', '21 Jan 2015', '15'),
(52, 'csc/11/6657', 'CSC200', '2014/2015', '', '23 Jan 2015', '15'),
(53, 'csc/11/6657', 'CSC100', '2014/2015', '', '23 Jan 2015', '79'),
(54, 'csc/11/6657', 'CSC200', '2014/2015', 'public static main() {\n	System.out.println("") ;\n\n	{\n		{\n			\n		}\n	}\n}\n', '25 Jan 2015', '25'),
(55, 'csc/11/6657', 'CSC200', '2014/2015', '', '26 Jan 2015', '82'),
(56, 'csc/11/6657', 'CSC200', '2014/2015', '<?\necho "dodsd" ;\n\n>?', '17 Jul 2015', '1');

-- --------------------------------------------------------

--
-- Table structure for table `class`
--

CREATE TABLE IF NOT EXISTS `class` (
  `class` varchar(50) NOT NULL,
  `department` varchar(50) NOT NULL,
  `session` varchar(10) NOT NULL,
  `level` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `class`
--

INSERT INTO `class` (`class`, `department`, `session`, `level`) VALUES
('CSC312', 'MTS', '2014/2015', '100'),
('CSC100', 'MTS', '2014/2015', '100'),
('CSC200', 'BCH', '2014/2015', '100'),
('CSC200', 'MTS', '2014/2015', '100'),
('csc460', 'CSC', '2014/2015', '100');

-- --------------------------------------------------------

--
-- Table structure for table `classpreload`
--

CREATE TABLE IF NOT EXISTS `classpreload` (
  `preloaddeptcode` varchar(10) NOT NULL,
  `preloaddeptdesc` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `classpreload`
--

INSERT INTO `classpreload` (`preloaddeptcode`, `preloaddeptdesc`) VALUES
('CSC200', 'computing analogy'),
('CSC100', 'mathematics'),
('CSC312', 'Digital Design'),
('CSC512', 'Dtabase'),
('bch400', 'biochemistry'),
('csc460', 'comp');

-- --------------------------------------------------------

--
-- Table structure for table `configuration`
--

CREATE TABLE IF NOT EXISTS `configuration` (
  `config_name` varchar(20) NOT NULL,
  `config_value` varchar(50) NOT NULL,
  KEY `config_name` (`config_name`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `configuration`
--

INSERT INTO `configuration` (`config_name`, `config_value`) VALUES
('TestTiMer', '3600'),
('Pc_Mode', 'Test'),
('SITE_NAME', 'FutaLab'),
('session', '2014/2015'),
('TiMer', '100');

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE IF NOT EXISTS `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course` varchar(5) NOT NULL,
  `coursedesc` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`id`, `course`, `coursedesc`) VALUES
(1, 'MTS', 'MATHEMATICS'),
(2, 'CSC', 'COMPUTING SCIENCE'),
(3, 'MTSS', 'MATHEMATICS');

-- --------------------------------------------------------

--
-- Table structure for table `ip`
--

CREATE TABLE IF NOT EXISTS `ip` (
  `ip_address` varchar(20) NOT NULL,
  `UserName` varchar(50) NOT NULL,
  `date` varchar(50) NOT NULL,
  `session` int(11) NOT NULL,
  `action` varchar(1) NOT NULL,
  `message` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ip`
--

INSERT INTO `ip` (`ip_address`, `UserName`, `date`, `session`, `action`, `message`) VALUES
('127.0.0.2', '', '25 Jan 2015 16:29:38 GMT', 0, '', ''),
('127.0.0.3', '', '25 Jan 2015 16:29:38 GMT', 0, '', ''),
('127.0.0.1', 'csc/11/6657', '17 Jul 2015 11:08:54 GMT', 0, '', '');

-- --------------------------------------------------------

--
-- Table structure for table `log`
--

CREATE TABLE IF NOT EXISTS `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `ip` varchar(20) NOT NULL,
  `date` varchar(12) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=15 ;

--
-- Dumping data for table `log`
--

INSERT INTO `log` (`id`, `username`, `ip`, `date`) VALUES
(1, 'csc/11/6657', '127.0.0.1', '25 Jan 2015'),
(2, 'csc/11/6657', '127.0.0.1', '25 Jan 2015'),
(3, 'csc/11/6657', '127.0.0.1', '25 Jan 2015'),
(4, 'csc/11/6657', '127.0.0.1', '25 Jan 2015'),
(5, 'csc/11/6657', '127.0.0.1', '25 Jan 2015'),
(6, 'csc/11/6657', '127.0.0.1', '25 Jan 2015'),
(7, 'csc/11/6657', '127.0.0.1', '26 Jan 2015'),
(8, 'csc/11/6657', '169.254.25.0', '6 Feb 2015 '),
(9, 'csc/11/6657', '169.254.35.169', '7 Feb 2015 '),
(10, 'csc/11/6657', '127.0.0.1', '8 Feb 2015 '),
(11, 'csc/11/6657', '169.254.35.0', '8 Feb 2015 '),
(12, 'csc/11/6657', '169.254.35.169', '8 Feb 2015 '),
(13, 'csc/11/6657', '127.0.0.1', '17 Jul 2015'),
(14, 'csc/11/6657', '127.0.0.1', '17 Jul 2015');

-- --------------------------------------------------------

--
-- Table structure for table `pratical`
--

CREATE TABLE IF NOT EXISTS `pratical` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `matricno` varchar(50) NOT NULL,
  `class` varchar(10) NOT NULL,
  `session` varchar(10) NOT NULL,
  `code` text NOT NULL,
  `time` varchar(50) NOT NULL,
  `grade` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=48 ;

--
-- Dumping data for table `pratical`
--

INSERT INTO `pratical` (`id`, `matricno`, `class`, `session`, `code`, `time`, `grade`) VALUES
(44, 'csc/11/6657', 'CSC200', '2014/2015', '//Please Enter Your Code Below or Open File\nimport java.sql.* ;\nimport javax.swing.* ;\n\npublic class NewClass {\n    Connection conn = null ;\n    public static String IP ;\n    public static Connection ConnectDb() {\n      \n        try {\n           Class.forName("com.mysql.jdbc.Driver") ;\n         IP = "localhost" ;\n          Connection conn = DriverManager.getConnection("jdbc:mysql://"+IP+"/FutaLab","root", "");\n        return conn ;\n        \n        }\n        catch (Exception e) {\n          JOptionPane.showMessageDialog(null, e);  \n          return null;\n        }\n        \n    }\n    \n}\n', '1 Jan 2015 10:58:59 GMT', 60),
(45, 'csc/11/6657', 'CSC100', '2014/2015', 'mysql_con', '13 Jan 2015 13:27:37 GMT', 0),
(46, 'csc/11/6657', 'CSC312', '2014/2015', '<?   \necho ;\n\n?>', '19 Jan 2015 15:40:05 GMT', 0),
(47, 'csc/11/6657', 'CSC200', '2014/2015', '<?\necho "dodsd" ;\n\n>?', '17 Jul 2015 11:05:14 GMT', 56);

-- --------------------------------------------------------

--
-- Table structure for table `school`
--

CREATE TABLE IF NOT EXISTS `school` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `school` varchar(5) NOT NULL,
  `schooldesc` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `school`
--

INSERT INTO `school` (`id`, `school`, `schooldesc`) VALUES
(1, 'SOS', 'SCHOOL OF SCIENCES'),
(3, 'SAAT', 'SCHOOL OF AGRIC'),
(4, 'SMAT', 'MANAGEMENT'),
(5, 'SMAT', 'MANAGEMENTS');

-- --------------------------------------------------------

--
-- Table structure for table `testanswerdatabase`
--

CREATE TABLE IF NOT EXISTS `testanswerdatabase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `department` varchar(10) NOT NULL,
  `session` varchar(10) NOT NULL,
  `class` varchar(10) NOT NULL,
  `answer_one` text NOT NULL,
  `answer_two` text NOT NULL,
  `answer_three` text NOT NULL,
  `answer_four` text NOT NULL,
  `answer_five` text NOT NULL,
  `answer_six` text NOT NULL,
  `status` int(11) NOT NULL,
  `grade` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `testanswerdatabase`
--

INSERT INTO `testanswerdatabase` (`id`, `username`, `department`, `session`, `class`, `answer_one`, `answer_two`, `answer_three`, `answer_four`, `answer_five`, `answer_six`, `status`, `grade`) VALUES
(1, 'csc/11/6657', 'MTS', '2014/2015', 'CSC312', ' isj', ' b', ' c', ' ', ' ', ' ', 1, 0);

-- --------------------------------------------------------

--
-- Table structure for table `testautosave`
--

CREATE TABLE IF NOT EXISTS `testautosave` (
  `id` int(11) NOT NULL,
  `matricno` varchar(50) NOT NULL,
  `class` varchar(10) NOT NULL,
  `session` varchar(10) NOT NULL,
  `time` varchar(50) NOT NULL,
  `remaintimer` varchar(10) NOT NULL,
  `answer_one` text NOT NULL,
  `answer_two` text NOT NULL,
  `answer_three` text NOT NULL,
  `answer_four` text NOT NULL,
  `answer_five` text NOT NULL,
  `answer_six` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `testautosave`
--

INSERT INTO `testautosave` (`id`, `matricno`, `class`, `session`, `time`, `remaintimer`, `answer_one`, `answer_two`, `answer_three`, `answer_four`, `answer_five`, `answer_six`) VALUES
(1, 'csc/11/6657', 'CSC312', '2014/2015', '17 Jul 2015 11:09:10 GMT', '0', ' ', ' ', ' ', ' ', ' ', ' ');

-- --------------------------------------------------------

--
-- Table structure for table `teston`
--

CREATE TABLE IF NOT EXISTS `teston` (
  `class` varchar(10) NOT NULL,
  `session` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teston`
--

INSERT INTO `teston` (`class`, `session`) VALUES
('CSC815', '2014/2015'),
('CSC312', '2014/2015');

-- --------------------------------------------------------

--
-- Table structure for table `testquestiondatabase`
--

CREATE TABLE IF NOT EXISTS `testquestiondatabase` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `class` varchar(10) NOT NULL,
  `session` varchar(10) NOT NULL,
  `question` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=6 ;

--
-- Dumping data for table `testquestiondatabase`
--

INSERT INTO `testquestiondatabase` (`id`, `class`, `session`, `question`) VALUES
(2, 'CSC312', '2014/2015', 'What is a Processor'),
(4, 'CSC312', '2014/2015', 'What is a Memory'),
(5, 'CSC312', '2014/2015', 'What is a technology');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `username` varchar(30) NOT NULL,
  `pass` varchar(40) DEFAULT NULL,
  `fullname` varchar(50) NOT NULL,
  `school` varchar(5) NOT NULL,
  `course` varchar(5) NOT NULL,
  `level` int(11) NOT NULL,
  `userlevel` tinyint(1) unsigned NOT NULL,
  `ip` varchar(15) NOT NULL,
  `imagepath` varchar(50) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`username`, `pass`, `fullname`, `school`, `course`, `level`, `userlevel`, `ip`, `imagepath`) VALUES
('csc/11/4543', 'futarian', 'Olawale', 'sos', 'CSC', 100, 1, '1', 'nairabet images.jpg'),
('csc/11/6657', '123456', 'oladipupo', 'sos', 'MTS', 100, 1, '10.1', 'csc-11-6657.jpg');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
