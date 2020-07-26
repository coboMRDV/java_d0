-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-07-2020 a las 17:55:40
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `gestionpedidos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `A` varchar(10) DEFAULT NULL,
  `B` varchar(20) DEFAULT NULL,
  `C` varchar(10) DEFAULT NULL,
  `D` varchar(9) DEFAULT NULL,
  `E` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`A`, `B`, `C`, `D`, `E`) VALUES
('CERÁMICA', 'Tubos', '04/03/1997', 'China', '140,35€ '),
('CERÁMICA', 'Plato Decorativo', '07/06/1997', 'China', '45,08€ '),
('CERÁMICA', 'Juego de te', '15/01/1997', 'China', '36,06€ '),
('CERÁMICA', 'Cenicero', '02/07/1997', 'Japón', '16,46€ '),
('CERÁMICA', 'Maceta', '23/02/1997', 'España', '24,20€ '),
('CERÁMICA', 'Jarra china', '02/09/1997', 'China', '106,48€ '),
('CONFECCIÓN', 'Tarje Caballero', '11/03/1997', 'Italia', '237,15€ '),
('CONFECCIÓN', 'Pantalón Señora', '01/05/1997', 'Marruecos', '145,19€ '),
('CONFECCIÓN', 'Camisa Caballero', '11/08/1997', 'España', '55,94€ '),
('CONFECCIÓN', 'Blusa Sra.', '18/03/1997', 'China', '84,21€ '),
('CONFECCIÓN', 'Cazadora piel', '10/07/1997', 'Italia', '435,58€ '),
('CONFECCIÓN', 'Abrigo Caballero', '05/07/1997', 'Italia', '203,27€ '),
('CONFECCIÓN', 'Abrigo Sra', '03/05/1997', 'Marruecos', '300,06€ '),
('CONFECCIÓN', 'Cinturón de piel', '12/05/1997', 'España', '3,61€ '),
('DEPORTE', 'Raqueta Tenis', '20/03/1997', 'Usa', '77,89€ '),
('DEPORTE', 'Chándal', '13/09/1997', 'Usa', '193,39€ '),
('DEPORTE', 'Tren Eléctrico', '03/07/1997', 'Japón', '1.254,48€ '),
('DEPORTE', 'Pistola Olímpica', '23/05/1997', 'Suecia', '38,95€ '),
('DEPORTE', 'Monopatín', '11/11/1997', 'Marruecos', '93,04€ '),
('DEPORTE', 'Balón baloncesto', '25/06/1997', 'Japón', '62,73€ '),
('DEPORTE', 'Balón Fútbol', '05/07/1997', 'España', '36,60€ '),
('DEPORTE', 'Sudadera', '03/11/1997', 'Usa', '365,98€ '),
('DEPORTE', 'Bicicleta de montaña', '14/03/1997', 'Usa', '470,42€ '),
('FERRETERÍA', 'Destornillador', '22/10/1997', 'España', '5,52€ '),
('FERRETERÍA', 'Serrucho', '23/03/1997', 'Francia', '25,17€ '),
('FERRETERÍA', 'Llave Inglesa', '23/04/1997', 'Usa', '20,33€ '),
('FERRETERÍA', 'Alicates', '17/04/1997', 'Italia', '5,61€ '),
('FERRETERÍA', 'Martillo', '04/09/1997', 'España', '9,50€ '),
('FERRETERÍA', 'Destornillador', '20/02/1997', 'Francia', '7,55€ '),
('FERRETERÍA', 'Lima Grande', '10/08/1997', 'España', '18,39€ '),
('FERRETERÍA', 'Juego de brocas', '04/07/1997', 'Taiwán', '12,58€ '),
('JUGUETERÍA', 'Coche Teledirigido', '26/05/1997', 'Marruecos', '132,87€ '),
('JUGUETERÍA', 'Correpasillos', '11/04/1997', 'Japón', '86,11€ '),
('JUGUETERÍA', 'Consola Video', '24/09/1997', 'Usa', '368,79€ '),
('JUGUETERÍA', 'Muñeca Andadora', '04/10/1997', 'España', '87,55€ '),
('JUGUETERÍA', 'Fuerte de soldados', '25/11/1997', 'Japón', '119,75€ '),
('JUGUETERÍA', 'Pistola con sonidos', '15/02/1997', 'España', '47,71€ '),
('JUGUETERÍA', 'Pie de lámpara', '27/05/1997', 'Turquía', '33,13€ ');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
