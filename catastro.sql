-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 04-07-2021 a las 16:57:25
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 8.0.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `catastro`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `c1m_vivienda`
--

CREATE TABLE `c1m_vivienda` (
  `VivCal` varchar(64) NOT NULL,
  `VivNum` int(3) NOT NULL,
  `VivTip` varchar(1) DEFAULT NULL,
  `VivCodPos` int(5) DEFAULT NULL,
  `VivMet` decimal(6,2) DEFAULT NULL,
  `VivOd` varchar(155) DEFAULT NULL,
  `ZonUrbNom` varchar(40) DEFAULT NULL,
  `VivEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `c1t_bloque_casas`
--

CREATE TABLE `c1t_bloque_casas` (
  `BloCasMet` decimal(6,2) DEFAULT NULL,
  `BloCasOd` varchar(155) DEFAULT NULL,
  `VivCal` varchar(64) NOT NULL,
  `VivNum` int(3) NOT NULL,
  `BloCasEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `c1t_casa_particular`
--

CREATE TABLE `c1t_casa_particular` (
  `CasParMet` decimal(6,2) DEFAULT NULL,
  `CasParOd` varchar(155) DEFAULT NULL,
  `VivCal` varchar(64) NOT NULL,
  `VivNum` int(3) NOT NULL,
  `PerDni` int(8) DEFAULT NULL,
  `CasParEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `c1t_habita_piso`
--

CREATE TABLE `c1t_habita_piso` (
  `PerDni` int(8) NOT NULL,
  `VivCal` varchar(64) DEFAULT NULL,
  `VivNum` int(3) DEFAULT NULL,
  `PisEsc` varchar(1) DEFAULT NULL,
  `PisPla` int(2) DEFAULT NULL,
  `PisPue` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `c1t_pisos`
--

CREATE TABLE `c1t_pisos` (
  `PisEsc` varchar(1) NOT NULL,
  `PisPla` int(2) NOT NULL,
  `PisPue` int(3) NOT NULL,
  `PisMet` int(4) DEFAULT NULL,
  `PisOd` varchar(155) DEFAULT NULL,
  `VivCal` varchar(64) NOT NULL,
  `VivNum` int(3) NOT NULL,
  `PerDni` int(8) DEFAULT NULL,
  `PisEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `c1z_persona`
--

CREATE TABLE `c1z_persona` (
  `PerDni` int(8) NOT NULL,
  `PerNom` varchar(20) DEFAULT NULL,
  `PerApe` varchar(40) DEFAULT NULL,
  `PerOd` varchar(155) DEFAULT NULL,
  `PerDniC` int(8) DEFAULT NULL,
  `PerIng` decimal(7,2) DEFAULT NULL,
  `VivCal` varchar(64) DEFAULT NULL,
  `VivNum` int(3) DEFAULT NULL,
  `PerEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gzz_municipios`
--

CREATE TABLE `gzz_municipios` (
  `MunNom` varchar(40) NOT NULL,
  `RegNom` varchar(20) DEFAULT NULL,
  `MunEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `gzz_municipios`
--

INSERT INTO `gzz_municipios` (`MunNom`, `RegNom`, `MunEst`) VALUES
('Municipio1', 'Apurimac', 'A'),
('Municipio2', 'Apurimac', 'A'),
('Municipio3', 'Arequipa', 'A'),
('Municipio4', 'Lima', 'A'),
('Municipio5', 'Apurimac', 'A'),
('Municipio6', 'Puno', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gzz_regiones`
--

CREATE TABLE `gzz_regiones` (
  `RegNom` varchar(20) NOT NULL,
  `RegEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `gzz_regiones`
--

INSERT INTO `gzz_regiones` (`RegNom`, `RegEst`) VALUES
('Apurimac', 'A'),
('Arequipa', 'A'),
('Cuzco', 'A'),
('Lima', 'A'),
('Moquegua', 'A'),
('Puno', 'A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `gzz_zona_urbana`
--

CREATE TABLE `gzz_zona_urbana` (
  `ZonUrbNom` varchar(40) NOT NULL,
  `ZonUrbOd` varchar(155) DEFAULT NULL,
  `MunNom` varchar(40) DEFAULT NULL,
  `ZonUrbEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `gzz_zona_urbana`
--

INSERT INTO `gzz_zona_urbana` (`ZonUrbNom`, `ZonUrbOd`, `MunNom`, `ZonUrbEst`) VALUES
('Zona Urbana 1', 'Esta zona urbana es una prueba de carga de datos', 'Municipio1', 'A'),
('Zona Urbana 2', 'NA', 'Municipio2', 'A'),
('Zona Urbana 3', 'Esta zona urbana no se puede usar hasta DD/MM/AA', 'Municipio3', 'I'),
('Zona Urbana 4', 'NA', 'Municipio6', 'A'),
('Zona Urbana 5', 'NA', 'Municipio4', 'A'),
('Zona Urbana 6', 'NA', 'Municipio5', 'A');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `c1m_vivienda`
--
ALTER TABLE `c1m_vivienda`
  ADD PRIMARY KEY (`VivCal`,`VivNum`),
  ADD KEY `IX_Relationship34` (`ZonUrbNom`);

--
-- Indices de la tabla `c1t_bloque_casas`
--
ALTER TABLE `c1t_bloque_casas`
  ADD PRIMARY KEY (`VivCal`,`VivNum`);

--
-- Indices de la tabla `c1t_casa_particular`
--
ALTER TABLE `c1t_casa_particular`
  ADD PRIMARY KEY (`VivCal`,`VivNum`),
  ADD KEY `IX_Relationship39` (`PerDni`);

--
-- Indices de la tabla `c1t_habita_piso`
--
ALTER TABLE `c1t_habita_piso`
  ADD PRIMARY KEY (`PerDni`),
  ADD KEY `IX_Relationship37` (`VivCal`,`VivNum`,`PisEsc`,`PisPla`,`PisPue`);

--
-- Indices de la tabla `c1t_pisos`
--
ALTER TABLE `c1t_pisos`
  ADD PRIMARY KEY (`VivCal`,`VivNum`,`PisEsc`,`PisPla`,`PisPue`),
  ADD KEY `IX_Relationship38` (`PerDni`);

--
-- Indices de la tabla `c1z_persona`
--
ALTER TABLE `c1z_persona`
  ADD PRIMARY KEY (`PerDni`),
  ADD KEY `IX_Relationship36` (`VivCal`,`VivNum`),
  ADD KEY `IX_Relationship40` (`PerDniC`);

--
-- Indices de la tabla `gzz_municipios`
--
ALTER TABLE `gzz_municipios`
  ADD PRIMARY KEY (`MunNom`),
  ADD UNIQUE KEY `Municipios Nombre` (`MunNom`),
  ADD KEY `IX_Relationship31` (`RegNom`);

--
-- Indices de la tabla `gzz_regiones`
--
ALTER TABLE `gzz_regiones`
  ADD PRIMARY KEY (`RegNom`),
  ADD UNIQUE KEY `Region Nombre` (`RegNom`);

--
-- Indices de la tabla `gzz_zona_urbana`
--
ALTER TABLE `gzz_zona_urbana`
  ADD PRIMARY KEY (`ZonUrbNom`),
  ADD UNIQUE KEY `Zona Urbana Nombre` (`ZonUrbNom`),
  ADD KEY `IX_Relationship33` (`MunNom`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `c1m_vivienda`
--
ALTER TABLE `c1m_vivienda`
  ADD CONSTRAINT `Int03_ZonaUrbana_Vivienda` FOREIGN KEY (`ZonUrbNom`) REFERENCES `gzz_zona_urbana` (`ZonUrbNom`);

--
-- Filtros para la tabla `c1t_bloque_casas`
--
ALTER TABLE `c1t_bloque_casas`
  ADD CONSTRAINT `Int04_Vivienda_Bloque_Casas` FOREIGN KEY (`VivCal`,`VivNum`) REFERENCES `c1m_vivienda` (`VivCal`, `VivNum`);

--
-- Filtros para la tabla `c1t_casa_particular`
--
ALTER TABLE `c1t_casa_particular`
  ADD CONSTRAINT `Int05_Vivienda_Casa_Particular` FOREIGN KEY (`VivCal`,`VivNum`) REFERENCES `c1m_vivienda` (`VivCal`, `VivNum`),
  ADD CONSTRAINT `Int09_Persona_Casa_Particular` FOREIGN KEY (`PerDni`) REFERENCES `c1z_persona` (`PerDni`);

--
-- Filtros para la tabla `c1t_habita_piso`
--
ALTER TABLE `c1t_habita_piso`
  ADD CONSTRAINT `Int08_Piso_Habita_Piso` FOREIGN KEY (`VivCal`,`VivNum`,`PisEsc`,`PisPla`,`PisPue`) REFERENCES `c1t_pisos` (`VivCal`, `VivNum`, `PisEsc`, `PisPla`, `PisPue`),
  ADD CONSTRAINT `Int11_Persona_Habita_Piso` FOREIGN KEY (`PerDni`) REFERENCES `c1z_persona` (`PerDni`);

--
-- Filtros para la tabla `c1t_pisos`
--
ALTER TABLE `c1t_pisos`
  ADD CONSTRAINT `Int07_Bloque_Casas_Piso` FOREIGN KEY (`VivCal`,`VivNum`) REFERENCES `c1t_bloque_casas` (`VivCal`, `VivNum`),
  ADD CONSTRAINT `Int10_Persona_Piso` FOREIGN KEY (`PerDni`) REFERENCES `c1z_persona` (`PerDni`);

--
-- Filtros para la tabla `c1z_persona`
--
ALTER TABLE `c1z_persona`
  ADD CONSTRAINT `Int06_Vivienda_Persona` FOREIGN KEY (`VivCal`,`VivNum`) REFERENCES `c1m_vivienda` (`VivCal`, `VivNum`),
  ADD CONSTRAINT `Int11_Persona_Persona` FOREIGN KEY (`PerDniC`) REFERENCES `c1z_persona` (`PerDni`);

--
-- Filtros para la tabla `gzz_municipios`
--
ALTER TABLE `gzz_municipios`
  ADD CONSTRAINT `Int01_Regiones_Municipios` FOREIGN KEY (`RegNom`) REFERENCES `gzz_regiones` (`RegNom`);

--
-- Filtros para la tabla `gzz_zona_urbana`
--
ALTER TABLE `gzz_zona_urbana`
  ADD CONSTRAINT `Int02_Municipios_ZonaUrbana` FOREIGN KEY (`MunNom`) REFERENCES `gzz_municipios` (`MunNom`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
