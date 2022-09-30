-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Server version:               10.4.19-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.2.0.6213
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Dumping structure for table tugasoop.transaksi
CREATE TABLE IF NOT EXISTS `transaksi` (
  `id_transaksi` int(11) NOT NULL AUTO_INCREMENT,
  `id_barang` varchar(50) DEFAULT NULL,
  `jumlahbarang` int(11) NOT NULL,
  `totalharga` int(11) NOT NULL,
  PRIMARY KEY (`id_transaksi`),
  KEY `FK_transaksi_data_barang` (`id_barang`),
  CONSTRAINT `FK_transaksi_data_barang` FOREIGN KEY (`id_barang`) REFERENCES `data_barang` (`id_barang`)
) ENGINE=InnoDB AUTO_INCREMENT=112327 DEFAULT CHARSET=utf8mb4;

-- Dumping data for table tugasoop.transaksi: ~6 rows (approximately)
/*!40000 ALTER TABLE `transaksi` DISABLE KEYS */;
REPLACE INTO `transaksi` (`id_transaksi`, `id_barang`, `jumlahbarang`, `totalharga`) VALUES
	(112320, 'XZZ6L(BLCK)', 3, 1250000),
	(112321, 'XZZ6L(BLCK)', 1, 1250000),
	(112322, 'XZZ6L(BLCK)', 1, 1250000),
	(112323, 'XZZ6L(GREEN)', 1, 1100000),
	(112325, 'XZZ6L(GREEN)', 5, 5500000),
	(112326, 'XZZ6L(GREEN)', 1, 1100000);
/*!40000 ALTER TABLE `transaksi` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
