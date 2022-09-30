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

-- Dumping structure for table tugasoop.tabel_panen
CREATE TABLE IF NOT EXISTS `tabel_panen` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_tanaman` varchar(32) NOT NULL,
  `hasil_panen` int(11) NOT NULL,
  `lama_tanam` int(11) NOT NULL,
  `tanggal_panen` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1459347720 DEFAULT CHARSET=latin1;

-- Dumping data for table tugasoop.tabel_panen: ~2 rows (approximately)
/*!40000 ALTER TABLE `tabel_panen` DISABLE KEYS */;
REPLACE INTO `tabel_panen` (`id`, `nama_tanaman`, `hasil_panen`, `lama_tanam`, `tanggal_panen`) VALUES
	(1459346526, 'Padi Skrip', 4021, 6, '2015-10-20'),
	(1459347719, 'Cabe Rawit', 112, 7, '2016-08-02');
/*!40000 ALTER TABLE `tabel_panen` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
