-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2020 at 06:41 PM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `laundry`
--

-- --------------------------------------------------------

--
-- Table structure for table `employee`
--

CREATE TABLE `employee` (
  `emp_id` int(3) NOT NULL,
  `emp_num` int(10) NOT NULL,
  `emp_name` varchar(30) NOT NULL,
  `emp_password` varchar(255) NOT NULL,
  `emp_role` int(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee`
--

INSERT INTO `employee` (`emp_id`, `emp_num`, `emp_name`, `emp_password`, `emp_role`) VALUES
(1, 1234, 'marco', '1234', 0),
(2, 123, 'admin', '123', 1);

-- --------------------------------------------------------

--
-- Table structure for table `wash_list`
--

CREATE TABLE `wash_list` (
  `wash_id` int(11) NOT NULL,
  `wash_key` varchar(256) NOT NULL,
  `wash_cust_name` varchar(255) NOT NULL,
  `wash_cust_phone` varchar(30) NOT NULL,
  `wash_cust_address` varchar(255) NOT NULL,
  `wash_type` varchar(20) NOT NULL,
  `wash_qty` int(3) NOT NULL,
  `wash_price` int(11) NOT NULL,
  `wash_date_in` date NOT NULL,
  `wash_date_out` date NOT NULL,
  `wash_status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wash_list`
--

INSERT INTO `wash_list` (`wash_id`, `wash_key`, `wash_cust_name`, `wash_cust_phone`, `wash_cust_address`, `wash_type`, `wash_qty`, `wash_price`, `wash_date_in`, `wash_date_out`, `wash_status`) VALUES
(8, '513fd845-fe85-4ac6-8399-96ca4a3152e9', 'rein', '0', '', 'Kiloan', 2, 20000, '0000-00-00', '0000-00-00', 'Antri'),
(9, '26287ef6-18e9-43b5-a86b-4dad368e7654', 'andri', '0', '', 'Kiloan', 2, 20000, '0000-00-00', '0000-00-00', 'Antri'),
(10, 'fd6bcdda-2d26-4bf4-87f7-3b306128c388', 'qwerty', '0', '', 'Kiloan', 2, 20000, '0000-00-00', '0000-00-00', 'Antri'),
(11, '95974b3b-cee0-4169-b167-2a225d55fa8b', 'sel', '0', '', 'Kiloan', 2, 20000, '0000-00-00', '0000-00-00', 'Antri'),
(12, '2e238cf2-77d8-4f93-a915-42d3b8ff4cd6', 'sel', '0', '', 'Kiloan', 2, 20000, '0000-00-00', '0000-00-00', 'Antri'),
(13, 'baaf3a9f-2255-4a08-bfd9-8024c5085911', 'sel', '0', '', 'Kiloan', 2, 20000, '0000-00-00', '0000-00-00', 'Antri'),
(14, '2f6b7617-5566-42a6-aa9e-4425f43dd6fa', 'sel', '0', '', 'Kiloan', 2, 20000, '0000-00-00', '0000-00-00', 'Antri'),
(15, '505cc5d1-f29c-4290-aa1d-85895adf7ccd', 'sel', '0', '', 'Kiloan', 2, 20000, '0000-00-00', '0000-00-00', 'Antri'),
(16, 'e81cdbb4-abdb-47f9-9452-eeea4e5681c8', 'sel', '0', '', 'Kiloan', 2, 20000, '0000-00-00', '0000-00-00', 'Antri'),
(25, '201912127648', 'sel', '089684679597', 'qwerty', 'Jaket', 2, 20000, '2019-12-12', '2019-12-15', 'Antri'),
(26, '20191212f66d', 'sel', '089684679597', '12141', 'Jaket', 2, 20000, '2019-12-12', '2019-12-15', 'Antri'),
(27, '2019121266b5', 'sel', '089684679597', '', 'Jas', 72, 7200, '2019-12-12', '2019-12-15', 'Antri'),
(28, '201912124233', 'selaa', '089684679597', 'qwet', 'Kiloan', 5, 125000, '2019-12-12', '2019-12-15', 'Antri'),
(29, '201912126e0b', 'sel', '089684679597', 'qwertyuiop', 'Kiloan', 5, 25000, '2019-12-12', '2019-12-15', 'Antri'),
(30, '20191226814b', '', '', '', 'Kiloan', 0, 0, '2019-12-26', '2019-12-29', 'Antri'),
(31, '201912262637', '', '', '', 'Jas', 3, 30000, '2019-12-26', '2019-12-29', 'Antri'),
(32, '20191226577f', 'fra', '1234123412', '2341342', 'Kiloan', 2, 10000, '2019-12-26', '2019-12-29', 'Antri');

-- --------------------------------------------------------

--
-- Table structure for table `wash_price`
--

CREATE TABLE `wash_price` (
  `id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `wash_price`
--

INSERT INTO `wash_price` (`id`, `name`, `price`) VALUES
(1, 'kiloan', 5000),
(2, 'jas', 10000),
(3, 'karpet', 25000),
(4, 'boneka', 10000),
(5, 'jaket', 12000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`emp_id`),
  ADD UNIQUE KEY `idx_emp_num` (`emp_num`);

--
-- Indexes for table `wash_list`
--
ALTER TABLE `wash_list`
  ADD PRIMARY KEY (`wash_id`);

--
-- Indexes for table `wash_price`
--
ALTER TABLE `wash_price`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `employee`
--
ALTER TABLE `employee`
  MODIFY `emp_id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `wash_list`
--
ALTER TABLE `wash_list`
  MODIFY `wash_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=33;

--
-- AUTO_INCREMENT for table `wash_price`
--
ALTER TABLE `wash_price`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
