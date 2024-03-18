-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: nyx
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'Anghel Monica','Str. Nucului','Pitesti',1),(2,'Balea Bianca','Str. Visinului','Brasov',2),(3,'Balga Teodora','Str. Prunului','Campina',3),(4,'Dinca Mirabela','Str. Zizinului','Craiova',4),(5,'Dineti Antonia','Str. Fagarasului','Fagaras',5);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `address_seq`
--

LOCK TABLES `address_seq` WRITE;
/*!40000 ALTER TABLE `address_seq` DISABLE KEYS */;
INSERT INTO `address_seq` VALUES (1);
/*!40000 ALTER TABLE `address_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `authorities`
--

LOCK TABLES `authorities` WRITE;
/*!40000 ALTER TABLE `authorities` DISABLE KEYS */;
INSERT INTO `authorities` VALUES ('admin','ROLE_ADMIN'),('user','ROLE_USER');
/*!40000 ALTER TABLE `authorities` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES (1,'Fata'),(2,'Buze'),(3,'Ochi');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `categories_seq`
--

LOCK TABLES `categories_seq` WRITE;
/*!40000 ALTER TABLE `categories_seq` DISABLE KEYS */;
INSERT INTO `categories_seq` VALUES (4);
/*!40000 ALTER TABLE `categories_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,3,'plasat','123',3,4,NULL),(2,2,'livrat','345',5,2,NULL),(3,1,'trimis','678',4,1,NULL),(4,1,'plasat','899',2,3,NULL),(5,4,'trimis','1234',1,5,NULL);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `orders_seq`
--

LOCK TABLES `orders_seq` WRITE;
/*!40000 ALTER TABLE `orders_seq` DISABLE KEYS */;
INSERT INTO `orders_seq` VALUES (1);
/*!40000 ALTER TABLE `orders_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Mascara',30,'Negru',3),(2,'Fond de ten',70,'Medium',1),(3,'Ruj',50,'Rosu',2),(4,'Blush',45,'Roz',1),(5,'Balsam buze',35,'Transparent',2),(6,'Fard ',25,'Albastru',3);
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `products_seq`
--

LOCK TABLES `products_seq` WRITE;
/*!40000 ALTER TABLE `products_seq` DISABLE KEYS */;
INSERT INTO `products_seq` VALUES (7);
/*!40000 ALTER TABLE `products_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'anghel.monica@gmail.com','0748106161','mihaela'),(2,'balea.bianca@gmail.com','0735187278','andreea'),(3,'balga.teodora@gmail.com','0736114929','stefania'),(4,'dinca.mirabela@gmail.com','0754264346','maria'),(5,'dineti.antonia@gmail.com','0730367737','adela');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user_seq`
--

LOCK TABLES `user_seq` WRITE;
/*!40000 ALTER TABLE `user_seq` DISABLE KEYS */;
INSERT INTO `user_seq` VALUES (1);
/*!40000 ALTER TABLE `user_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('admin','$2a$10$2cpw05l2VxtJPYRZehYUjuD/EUfGyXPVqP7OG4ZFjEUZqT1touAzu',1),('user','$2a$10$b7UkCdUGgwu9BVJJ84pa1uCN0X53XJjUJTJ4tZmHTbc7yJmOIIVn6',1);
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

-- Dump completed on 2024-01-16 23:57:51
