-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 03 Des 2019 pada 14.07
-- Versi server: 10.3.16-MariaDB
-- Versi PHP: 7.3.6

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
-- Struktur dari tabel `customer`
--

CREATE TABLE `customer` (
  `customer_id` int(11) NOT NULL,
  `customer_name` varchar(255) NOT NULL,
  `customer_address` varchar(255) NOT NULL,
  `customer_phone` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `customer`
--

INSERT INTO `customer` (`customer_id`, `customer_name`, `customer_address`, `customer_phone`) VALUES
(1, 'Marco', 'Melon', 2141111);

-- --------------------------------------------------------

--
-- Struktur dari tabel `employee`
--

CREATE TABLE `employee` (
  `emp_id` int(3) NOT NULL,
  `emp_num` int(10) NOT NULL,
  `emp_name` varchar(30) NOT NULL,
  `emp_password` varchar(255) NOT NULL,
  `emp_role` int(1) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `employee`
--

INSERT INTO `employee` (`emp_id`, `emp_num`, `emp_name`, `emp_password`, `emp_role`) VALUES
(1, 1234, 'marco', '1234', 1);

-- --------------------------------------------------------

--
-- Struktur dari tabel `wash_list`
--

CREATE TABLE `wash_list` (
  `wash_id` int(3) NOT NULL,
  `customer_id` int(11) NOT NULL,
  `wash_cust_name` varchar(255) NOT NULL,
  `wash_type` varchar(20) NOT NULL,
  `wash_qty` int(3) NOT NULL,
  `wash_price` int(10) NOT NULL,
  `wash_status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `wash_list`
--

INSERT INTO `wash_list` (`wash_id`, `customer_id`, `wash_cust_name`, `wash_type`, `wash_qty`, `wash_price`, `wash_status`) VALUES
(1, 1, 'marco', 'Kiloan', 2, 10000, 'dicuci');

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`customer_id`);

--
-- Indeks untuk tabel `employee`
--
ALTER TABLE `employee`
  ADD PRIMARY KEY (`emp_id`),
  ADD UNIQUE KEY `idx_emp_num` (`emp_num`);

--
-- Indeks untuk tabel `wash_list`
--
ALTER TABLE `wash_list`
  ADD PRIMARY KEY (`wash_id`),
  ADD KEY `FK_customer` (`customer_id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `customer`
--
ALTER TABLE `customer`
  MODIFY `customer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `employee`
--
ALTER TABLE `employee`
  MODIFY `emp_id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT untuk tabel `wash_list`
--
ALTER TABLE `wash_list`
  MODIFY `wash_id` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `wash_list`
--
ALTER TABLE `wash_list`
  ADD CONSTRAINT `FK_customer` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`customer_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
