-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-07-2020 a las 13:36:43
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
  `CODIGOARTICULO` int(11) NOT NULL,
  `SECCION` varchar(10) DEFAULT NULL,
  `NOMBREARTICULO` varchar(20) DEFAULT NULL,
  `FECHA` varchar(10) DEFAULT NULL,
  `PAISORIGEN` varchar(9) DEFAULT NULL,
  `PRECIO` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`CODIGOARTICULO`, `SECCION`, `NOMBREARTICULO`, `FECHA`, `PAISORIGEN`, `PRECIO`) VALUES
(1, 'CERÁMICA', 'Tubos', '04/03/1997', 'China', '140,35€ '),
(2, 'CERÁMICA', 'Plato Decorativo', '07/06/1997', 'China', '45,08€ '),
(3, 'CERÁMICA', 'Juego de te', '15/01/1997', 'China', '36,06€ '),
(4, 'CERÁMICA', 'Cenicero', '02/07/1997', 'Japón', '16,46€ '),
(5, 'CERÁMICA', 'Maceta', '23/02/1997', 'España', '24,20€ '),
(6, 'CERÁMICA', 'Jarra china', '02/09/1997', 'China', '106,48€ '),
(7, 'CONFECCIÓN', 'Tarje Caballero', '11/03/1997', 'Italia', '237,15€ '),
(8, 'CONFECCIÓN', 'Pantalón Señora', '01/05/1997', 'Marruecos', '145,19€ '),
(9, 'CONFECCIÓN', 'Camisa Caballero', '11/08/1997', 'España', '55,94€ '),
(10, 'CONFECCIÓN', 'Blusa Sra.', '18/03/1997', 'China', '84,21€ '),
(11, 'CONFECCIÓN', 'Cazadora piel', '10/07/1997', 'Italia', '435,58€ '),
(12, 'CONFECCIÓN', 'Abrigo Caballero', '05/07/1997', 'Italia', '203,27€ '),
(13, 'CONFECCIÓN', 'Abrigo Sra', '03/05/1997', 'Marruecos', '300,06€ '),
(14, 'CONFECCIÓN', 'Cinturón de piel', '12/05/1997', 'España', '3,61€ '),
(15, 'DEPORTE', 'Raqueta Tenis', '20/03/1997', 'Usa', '77,89€ '),
(16, 'DEPORTE', 'Chándal', '13/09/1997', 'Usa', '193,39€ '),
(17, 'DEPORTE', 'Tren Eléctrico', '03/07/1997', 'Japón', '1.254,48€ '),
(18, 'DEPORTE', 'Pistola Olímpica', '23/05/1997', 'Suecia', '38,95€ '),
(19, 'DEPORTE', 'Monopatín', '11/11/1997', 'Marruecos', '93,04€ '),
(20, 'DEPORTE', 'Balón baloncesto', '25/06/1997', 'Japón', '62,73€ '),
(21, 'DEPORTE', 'Balón Fútbol', '05/07/1997', 'España', '36,60€ '),
(22, 'DEPORTE', 'Sudadera', '03/11/1997', 'Usa', '365,98€ '),
(23, 'DEPORTE', 'Bicicleta de montaña', '14/03/1997', 'Usa', '470,42€ '),
(24, 'FERRETERÍA', 'Destornillador', '22/10/1997', 'España', '5,52€ '),
(25, 'FERRETERÍA', 'Serrucho', '23/03/1997', 'Francia', '25,17€ '),
(26, 'FERRETERÍA', 'Llave Inglesa', '23/04/1997', 'Usa', '20,33€ '),
(27, 'FERRETERÍA', 'Alicates', '17/04/1997', 'Italia', '5,61€ '),
(28, 'FERRETERÍA', 'Martillo', '04/09/1997', 'España', '9,50€ '),
(29, 'FERRETERÍA', 'Destornillador', '20/02/1997', 'Francia', '7,55€ '),
(30, 'FERRETERÍA', 'Lima Grande', '10/08/1997', 'España', '18,39€ '),
(31, 'FERRETERÍA', 'Juego de brocas', '04/07/1997', 'Taiwán', '12,58€ '),
(32, 'JUGUETERÍA', 'Coche Teledirigido', '26/05/1997', 'Marruecos', '132,87€ '),
(33, 'JUGUETERÍA', 'Correpasillos', '11/04/1997', 'Japón', '86,11€ '),
(34, 'JUGUETERÍA', 'Consola Video', '24/09/1997', 'Usa', '368,79€ '),
(35, 'JUGUETERÍA', 'Muñeca Andadora', '04/10/1997', 'España', '87,55€ '),
(36, 'JUGUETERÍA', 'Fuerte de soldados', '25/11/1997', 'Japón', '119,75€ '),
(37, 'JUGUETERÍA', 'Pistola con sonidos', '15/02/1997', 'España', '47,71€ '),
(38, 'JUGUETERÍA', 'Pie de lámpara', '27/05/1997', 'Turquía', '33,13€ ');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`CODIGOARTICULO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `CODIGOARTICULO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=39;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
