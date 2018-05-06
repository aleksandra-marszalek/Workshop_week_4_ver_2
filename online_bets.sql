-- MySQL dump 10.13  Distrib 5.7.21, for osx10.12 (x86_64)
--
-- Host: localhost    Database: online_bets
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `countries`
--

DROP TABLE IF EXISTS `countries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `countries` (
  `id` bigint(20) NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `countries`
--

LOCK TABLES `countries` WRITE;
/*!40000 ALTER TABLE `countries` DISABLE KEYS */;
INSERT INTO `countries` VALUES (169,'England'),(173,'France');
/*!40000 ALTER TABLE `countries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(200) DEFAULT NULL,
  `surname` varchar(200) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Dameon','Homenick','dalton.schumm@gmail.com','c1dut5nhs8m7go'),(2,'Dameon','Homenick','dalton.schumm@gmail.com','c1dut5nhs8m7go'),(3,'Cesar','Bednar','charlie.mohr@yahoo.com','5um0eg3hbn94iwq'),(4,'Cesar','Bednar','charlie.mohr@yahoo.com','5um0eg3hbn94iwq'),(5,'Eddie','Heaney','kirstin.kunde@hotmail.com','9qiyl80kck9fogj'),(6,'Eddie','Heaney','kirstin.kunde@hotmail.com','9qiyl80kck9fogj'),(7,'Kylie','Sipes','glennie.gutmann@hotmail.com','bpm2ny6yeo'),(8,'Kylie','Sipes','glennie.gutmann@hotmail.com','bpm2ny6yeo'),(9,'Norval','Kilback','laurence.feest@gmail.com','0m60t2lh74'),(10,'Fatima','Beier','makenna.bogisich@yahoo.com','md7punflmc'),(11,'Norval','Kilback','laurence.feest@gmail.com','0m60t2lh74'),(12,'Fatima','Beier','makenna.bogisich@yahoo.com','md7punflmc'),(13,'Marley','McKenzie','major.maggio@gmail.com','r81a00u82b'),(14,'Ryann','Wilderman','melisa.casper@hotmail.com','io2oqzex0n'),(15,'Marley','McKenzie','major.maggio@gmail.com','r81a00u82b'),(16,'Breanna','Zulauf','merritt.orn@hotmail.com','gwq358rlkzzc'),(17,'Ryann','Wilderman','melisa.casper@hotmail.com','io2oqzex0n'),(18,'Breanna','Zulauf','merritt.orn@hotmail.com','gwq358rlkzzc'),(19,'Janis','Russel','corrine.mosciski@hotmail.com','c3obmpkt'),(20,'Janis','Russel','corrine.mosciski@hotmail.com','c3obmpkt');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-06 20:30:24
