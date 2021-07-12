-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 12-07-2021 a las 02:31:43
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
-- Base de datos: `catastro2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viviendas`
--

CREATE TABLE `viviendas` (
  `VivCod` int(4) NOT NULL,
  `VivCal` varchar(64) NOT NULL,
  `VivNum` int(3) NOT NULL,
  `VivTip` varchar(1) NOT NULL,
  `VivCodPos` int(5) NOT NULL,
  `VivMet` decimal(6,2) NOT NULL,
  `VivOd` varchar(155) DEFAULT NULL,
  `ZonUrbCod` int(4) NOT NULL,
  `VivEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bloques_casas`
--

CREATE TABLE `bloques_casas` (
  `VivCod` int(4) NOT NULL,
  `BloCasMet` decimal(6,2) NOT NULL,
  `BloCasOd` varchar(155) DEFAULT NULL,
  `BloCasEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casas_particulares`
--

CREATE TABLE `casas_particulares` (
  `VivCod` int(4) NOT NULL,
  `CasParMet` decimal(6,2) NOT NULL,
  `CasParOd` varchar(155) DEFAULT NULL,
  `PerCod` int(4) NOT NULL,
  `CasParEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitas_pisos`
--

CREATE TABLE `habitas_pisos` (
  `PerCod` int(4) NOT NULL,
  `PisCod` int(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pisos`
--

CREATE TABLE `pisos` (
  `PisCod` int(4) NOT NULL,
  `VivCod` int(4) NOT NULL,
  `PisEsc` varchar(1) NOT NULL,
  `PisPla` int(2) NOT NULL,
  `PisPue` int(3) NOT NULL,
  `PisMet` int(4) NOT NULL,
  `PisOd` varchar(155) DEFAULT NULL,
  `PerCod` int(4) NOT NULL,
  `PisEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personas`
--

CREATE TABLE `personas` (
  `PerCod` int(4) NOT NULL,
  `PerDni` int(8) NOT NULL,
  `PerNom` varchar(20) NOT NULL,
  `PerApe` varchar(40) NOT NULL,
  `PerOd` varchar(155) DEFAULT NULL,
  `PerCodC` int(4) DEFAULT NULL,
  `PerIng` decimal(7,2) DEFAULT NULL,
  `VivCod` int(4) NOT NULL,
  `PerEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `municipios`
--

CREATE TABLE `municipios` (
  `MunCod` int(4) NOT NULL,
  `MunNom` varchar(40) NOT NULL,
  `RegCod` int(4) NOT NULL,
  `MunEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `regiones`
--

CREATE TABLE `regiones` (
  `RegCod` int(4) NOT NULL,
  `RegNom` varchar(20) NOT NULL,
  `RegEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `zonas_urbanas`
--

CREATE TABLE `zonas_urbanas` (
  `ZonUrbCod` int(4) NOT NULL,
  `ZonUrbNom` varchar(40) NOT NULL,
  `ZonUrbOd` varchar(155) DEFAULT NULL,
  `MunCod` int(4) NOT NULL,
  `ZonUrbEst` varchar(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `viviendas`
--
ALTER TABLE `viviendas`
  ADD PRIMARY KEY (`VivCod`),
  ADD KEY `ZonUrbCod` (`ZonUrbCod`);

--
-- Indices de la tabla `bloques_casas`
--
ALTER TABLE `bloques_casas`
  ADD PRIMARY KEY (`VivCod`),
  ADD KEY `VivCod` (`VivCod`);

--
-- Indices de la tabla `casas_particulares`
--
ALTER TABLE `casas_particulares`
  ADD PRIMARY KEY (`VivCod`),
  ADD KEY `VivCod` (`VivCod`),
  ADD KEY `PerCod` (`PerCod`);

--
-- Indices de la tabla `habitas_pisos`
--
ALTER TABLE `habitas_pisos`
  ADD PRIMARY KEY (`PerCod`),
  ADD KEY `PerCod` (`PerCod`),
  ADD KEY `PisCod` (`PisCod`);

--
-- Indices de la tabla `pisos`
--
ALTER TABLE `pisos`
  ADD PRIMARY KEY (`PisCod`),
  ADD KEY `VivCod` (`VivCod`),
  ADD KEY `PerCod` (`PerCod`);

--
-- Indices de la tabla `personas`
--
ALTER TABLE `personas`
  ADD PRIMARY KEY (`PerCod`),
  ADD KEY `PerCodC` (`PerCodC`),
  ADD KEY `VivCod` (`VivCod`);

--
-- Indices de la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD PRIMARY KEY (`MunCod`),
  ADD KEY `RegCod` (`RegCod`);

--
-- Indices de la tabla `regiones`
--
ALTER TABLE `regiones`
  ADD PRIMARY KEY (`RegCod`);

--
-- Indices de la tabla `zonas_urbanas`
--
ALTER TABLE `zonas_urbanas`
  ADD PRIMARY KEY (`ZonUrbCod`),
  ADD KEY `MunCod` (`MunCod`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `viviendas`
--
ALTER TABLE `viviendas`
  MODIFY `VivCod` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `personas`
--
ALTER TABLE `personas`
  MODIFY `PerCod` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `municipios`
--
ALTER TABLE `municipios`
  MODIFY `MunCod` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `regiones`
--
ALTER TABLE `regiones`
  MODIFY `RegCod` int(4) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `zonas_urbanas`
--
ALTER TABLE `zonas_urbanas`
  MODIFY `ZonUrbCod` int(4) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `viviendas`
--
ALTER TABLE `viviendas`
  ADD CONSTRAINT `viviendas_ibfk_1` FOREIGN KEY (`ZonUrbCod`) REFERENCES `zonas_urbanas` (`ZonUrbCod`);

--
-- Filtros para la tabla `bloques_casas`
--
ALTER TABLE `bloques_casas`
  ADD CONSTRAINT `bloques_casas_ibfk_1` FOREIGN KEY (`VivCod`) REFERENCES `viviendas` (`VivCod`);

--
-- Filtros para la tabla `casas_particulares`
--
ALTER TABLE `casas_particulares`
  ADD CONSTRAINT `casas_particulares_ibfk_1` FOREIGN KEY (`VivCod`) REFERENCES `viviendas` (`VivCod`),
  ADD CONSTRAINT `casas_particulares_ibfk_2` FOREIGN KEY (`PerCod`) REFERENCES `personas` (`PerCod`);

--
-- Filtros para la tabla `habitas_pisos`
--
ALTER TABLE `habitas_pisos`
  ADD CONSTRAINT `habitas_pisos_ibfk_1` FOREIGN KEY (`PisCod`) REFERENCES `pisos` (`PisCod`),
  ADD CONSTRAINT `habitas_pisos_ibfk_2` FOREIGN KEY (`PerCod`) REFERENCES `personas` (`PerCod`);

--
-- Filtros para la tabla `pisos`
--
ALTER TABLE `pisos`
  ADD CONSTRAINT `pisos_ibfk_1` FOREIGN KEY (`VivCod`) REFERENCES `bloques_casas` (`VivCod`),
  ADD CONSTRAINT `pisos_ibfk_2` FOREIGN KEY (`PerCod`) REFERENCES `personas` (`PerCod`);

--
-- Filtros para la tabla `personas`
--
ALTER TABLE `personas`
  ADD CONSTRAINT `personas_ibfk_1` FOREIGN KEY (`VivCod`) REFERENCES `viviendas` (`VivCod`);

--
-- Filtros para la tabla `municipios`
--
ALTER TABLE `municipios`
  ADD CONSTRAINT `municipios_ibfk_1` FOREIGN KEY (`RegCod`) REFERENCES `regiones` (`RegCod`);

--
-- Filtros para la tabla `zonas_urbanas`
--
ALTER TABLE `zonas_urbanas`
  ADD CONSTRAINT `zonas_urbanas_ibfk_1` FOREIGN KEY (`MunCod`) REFERENCES `municipios` (`MunCod`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
