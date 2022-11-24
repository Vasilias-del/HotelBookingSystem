-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 23, 2018 at 08:20 AM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `paydetail`
--

CREATE TABLE `paydetail` (
  `cardNo` int(11) NOT NULL,
  `cardBank` varchar(20) NOT NULL,
  `ExpDate` varchar(10) NOT NULL,
  `CVV` int(11) NOT NULL,
  `price` float NOT NULL,
  `username` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `setbook`
--

CREATE TABLE `setbook` (
  `bookingID` int(2) NOT NULL,
  `name` varchar(50) NOT NULL,
  `phone` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `roomtype` int(2) NOT NULL,
  `checkin` date NOT NULL,
  `checkout` date NOT NULL,
  `adult` int(11) NOT NULL,
  `children` int(11) NOT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `setbook`
--

INSERT INTO `setbook` (`bookingID`, `name`, `phone`, `username`, `roomtype`, `checkin`, `checkout`, `adult`, `children`, `price`) VALUES
(1, 'syafiq', 192929292, 'zul', 1, '2018-12-20', '2018-12-21', 1, 0, 0),
(16, 'JAIDAH BINTI RIPIN', 1125088318, 'zul', 2, '2018-12-05', '2018-12-25', 2, 0, 398.87),
(17, 'NEELOFA', 123, 'zul', 1, '2018-12-04', '2018-12-11', 1, 0, 180.98),
(30, 'Aisyah Rozman', 1125088318, 'zul', 1, '2018-12-01', '2018-12-31', 1, 0, 180.98),
(53, 'hhjhjhj', 1125088318, 'hazim', 1, '2018-12-05', '2018-12-19', 1, 0, 180.98),
(68, 'HAZIM BIN ROHIZAT', 1125088318, 'hazim', 2, '2018-12-13', '2018-12-24', 3, 0, 398.87),
(86, 'SHAFIQ IRWAN', 1125088318, 'zul', 2, '2018-12-05', '2018-12-12', 1, 0, 398.87),
(88, 'SYIMA', 292929292, 'qils', 2, '2018-12-12', '2018-12-26', 2, 0, 398.87),
(92, 'NEELOFA', 123431321, 'hazim', 2, '2018-12-05', '2018-12-18', 3, 0, 398.87),
(93, 'HAZIM BIN ROHIZAT', 1125088318, 'zul', 1, '2018-12-05', '2018-12-10', 1, 0, 180.98),
(95, 'MUHAMMAD SYAFIQ BIN ABDUL MANAN', 1125088318, 'zul', 3, '2018-12-05', '2018-12-19', 2, 1, 534.32);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `username` varchar(20) NOT NULL,
  `password` varchar(10) NOT NULL,
  `usertype` varchar(10) NOT NULL,
  `fullname` varchar(50) NOT NULL,
  `image` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`username`, `password`, `usertype`, `fullname`, `image`) VALUES
('hazim', '123', 'user', 'HAZIM BIN ROHIZAT', 'default.jpg'),
('qils', '456', 'user', 'Aqilah', 'default.jpg'),
('syafiq', '123', 'admin', 'Syafiq', 'author.jpg'),
('syims', '123', 'admin', 'Syima', 'default.jpg'),
('zul', '123', 'user', 'Zulfahmi', 'team3.jpg');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `paydetail`
--
ALTER TABLE `paydetail`
  ADD PRIMARY KEY (`cardNo`);

--
-- Indexes for table `setbook`
--
ALTER TABLE `setbook`
  ADD PRIMARY KEY (`bookingID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
