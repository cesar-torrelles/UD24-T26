-- CREATE DATABASE Productos;
USE Productos;


DROP TABLE IF EXISTS `Productos`;




CREATE TABLE `Productos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) DEFAULT NULL,
  `precio` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 ;


--
-- Dumping data for table `Productos`
--

LOCK TABLES `Productos` WRITE;

INSERT INTO `Productos` VALUES (1,'Java Basics',150),(2,'MS SQL',50),(3,'VUE',50),(4,'Angular',100),(5,'BootsTrap',30);

UNLOCK TABLES;

--
-- Table structure for table `Cajeros`
--

DROP TABLE IF EXISTS `Cajeros`;

CREATE TABLE `Cajeros` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomapels` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 ;


--
-- Dumping data for table `Cajeros`
--

LOCK TABLES `Cajeros` WRITE;

INSERT INTO `Cajeros` VALUES (1,'Jose jose'),(2,'Oliver Ferrer'),(3,'Joan Tenaud'),(4,'Carles Lopez'),(5,'Thorsten Fey');

UNLOCK TABLES;

--
-- Table structure for table `Venta`
--

DROP TABLE IF EXISTS `Maquinas`;


CREATE TABLE `Maquinas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Piso` int(11) NOT NULL,
   PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 ;


--
-- Dumping data for table `Venta`
--

LOCK TABLES `Maquinas` WRITE;

INSERT INTO `Maquinas` VALUES (1,1),(2,2),(3,3),(4,4),(5,5);

UNLOCK TABLES;


--
-- Table structure for table `Venta`
--

DROP TABLE IF EXISTS `Venta`;


CREATE TABLE `Venta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cajeros` int(11) NOT NULL,
  `maquinas` int(11) NOT NULL,
  `productos` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `Cajeros_registration_FK` FOREIGN KEY (`cajeros`) REFERENCES `Cajeros` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Maquinas_registration_FK` FOREIGN KEY (`maquinas`) REFERENCES `Maquinas` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `Productos_registration_FK` FOREIGN KEY (`productos`) REFERENCES `Productos` (`id`) ON DELETE CASCADE ON UPDATE CASCADE

) ENGINE=InnoDB AUTO_INCREMENT=6 ;

--
-- Dumping data for table `Venta`
--

LOCK TABLES `Venta` WRITE;

INSERT INTO `Venta` VALUES (1,1,1,1),(2,2,2,2),(3,3,3,3),(4,4,4,4),(5,5,5,5);

UNLOCK TABLES;
