-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: musicpataleta
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Table structure for table `authors`
--

DROP TABLE IF EXISTS `authors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authors` (
  `idauthor` int(11) NOT NULL AUTO_INCREMENT,
  `nameAuthor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idauthor`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authors`
--

LOCK TABLES `authors` WRITE;
/*!40000 ALTER TABLE `authors` DISABLE KEYS */;
INSERT INTO `authors` VALUES (1,'VHS Dreams'),(2,'podval capella'),(3,'The Glitch Mob '),(4,'Drake');
/*!40000 ALTER TABLE `authors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `basketauthors`
--

DROP TABLE IF EXISTS `basketauthors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `basketauthors` (
  `idbasketauthors` int(11) NOT NULL AUTO_INCREMENT,
  `idAuthor` int(11) DEFAULT NULL,
  `idSong` int(11) DEFAULT NULL,
  PRIMARY KEY (`idbasketauthors`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `basketauthors`
--

LOCK TABLES `basketauthors` WRITE;
/*!40000 ALTER TABLE `basketauthors` DISABLE KEYS */;
INSERT INTO `basketauthors` VALUES (1,1,1),(2,2,2),(3,3,3),(4,2,4),(5,4,5),(6,4,6);
/*!40000 ALTER TABLE `basketauthors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `basketcontainedsong`
--

DROP TABLE IF EXISTS `basketcontainedsong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `basketcontainedsong` (
  `idBasketContainedSong` int(11) NOT NULL AUTO_INCREMENT,
  `idPlaylist` int(11) DEFAULT NULL,
  `idSong` int(11) DEFAULT NULL,
  PRIMARY KEY (`idBasketContainedSong`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `basketcontainedsong`
--

LOCK TABLES `basketcontainedsong` WRITE;
/*!40000 ALTER TABLE `basketcontainedsong` DISABLE KEYS */;
INSERT INTO `basketcontainedsong` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,2,5),(6,2,6);
/*!40000 ALTER TABLE `basketcontainedsong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `basketplaylists`
--

DROP TABLE IF EXISTS `basketplaylists`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `basketplaylists` (
  `idbasketplaylists` int(11) NOT NULL AUTO_INCREMENT,
  `idPlaylist` int(11) DEFAULT NULL,
  `idUser` int(11) DEFAULT NULL,
  PRIMARY KEY (`idbasketplaylists`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `basketplaylists`
--

LOCK TABLES `basketplaylists` WRITE;
/*!40000 ALTER TABLE `basketplaylists` DISABLE KEYS */;
INSERT INTO `basketplaylists` VALUES (1,1,1),(2,2,1);
/*!40000 ALTER TABLE `basketplaylists` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genrebusket`
--

DROP TABLE IF EXISTS `genrebusket`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genrebusket` (
  `genreBusketID` int(11) NOT NULL AUTO_INCREMENT,
  `idSong` int(11) DEFAULT NULL,
  `idGenre` int(11) DEFAULT NULL,
  PRIMARY KEY (`genreBusketID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genrebusket`
--

LOCK TABLES `genrebusket` WRITE;
/*!40000 ALTER TABLE `genrebusket` DISABLE KEYS */;
INSERT INTO `genrebusket` VALUES (1,1,3),(2,1,4),(3,2,2),(4,3,1),(5,4,2),(6,5,5);
/*!40000 ALTER TABLE `genrebusket` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genres`
--

DROP TABLE IF EXISTS `genres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genres` (
  `idGenre` int(11) NOT NULL AUTO_INCREMENT,
  `genreName` varchar(45) DEFAULT NULL,
  `description` varchar(45) DEFAULT 'Нет описания',
  PRIMARY KEY (`idGenre`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genres`
--

LOCK TABLES `genres` WRITE;
/*!40000 ALTER TABLE `genres` DISABLE KEYS */;
INSERT INTO `genres` VALUES (1,'Intelligent Dance Music','Нет описания'),(2,'trip-hop','Нет описания'),(3,'Electronic','Нет описания'),(4,'Synthpop','Нет описания'),(5,'Hip-Hоp ','Нет описания'),(6,'Rаp','Нет описания');
/*!40000 ALTER TABLE `genres` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `playlist`
--

DROP TABLE IF EXISTS `playlist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `playlist` (
  `idPlaylist` int(11) NOT NULL AUTO_INCREMENT,
  `namePlaylist` varchar(45) DEFAULT NULL,
  `idBasketContainedSong` int(11) DEFAULT NULL,
  PRIMARY KEY (`idPlaylist`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `playlist`
--

LOCK TABLES `playlist` WRITE;
/*!40000 ALTER TABLE `playlist` DISABLE KEYS */;
INSERT INTO `playlist` VALUES (1,'favorite',1),(2,'Drake',2);
/*!40000 ALTER TABLE `playlist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ratingsongs`
--

DROP TABLE IF EXISTS `ratingsongs`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ratingsongs` (
  `idratingSongs` int(11) NOT NULL AUTO_INCREMENT,
  `idSong` int(11) DEFAULT NULL,
  `idUser` int(11) DEFAULT NULL,
  `Value` int(11) DEFAULT NULL,
  PRIMARY KEY (`idratingSongs`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ratingsongs`
--

LOCK TABLES `ratingsongs` WRITE;
/*!40000 ALTER TABLE `ratingsongs` DISABLE KEYS */;
INSERT INTO `ratingsongs` VALUES (1,1,1,3),(2,2,1,4),(3,3,1,4),(4,4,1,3);
/*!40000 ALTER TABLE `ratingsongs` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `song`
--

DROP TABLE IF EXISTS `song`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `song` (
  `idSong` int(11) NOT NULL AUTO_INCREMENT,
  `SongName` varchar(45) DEFAULT NULL,
  `idbasketauthors` int(11) NOT NULL,
  `YearPublish` int(11) DEFAULT NULL,
  `GenreBusketID` int(11) NOT NULL,
  PRIMARY KEY (`idSong`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `song`
--

LOCK TABLES `song` WRITE;
/*!40000 ALTER TABLE `song` DISABLE KEYS */;
INSERT INTO `song` VALUES (1,'Hightdrive',1,2015,1),(2,'karfagen',2,2014,2),(3,'Between Two Points',3,2010,3),(4,'lostindark',2,2014,4),(5,'Kееp thе Fаmilу Clоsе ',5,2016,6),(6,'U With Mе? ',6,2016,6);
/*!40000 ALTER TABLE `song` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `idBasketPlaylists` int(11) DEFAULT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'test','test',1),(2,'q','q',2);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-02 17:48:47
