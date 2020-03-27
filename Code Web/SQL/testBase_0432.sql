-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Хост: localhost:3306
-- Время создания: Мар 16 2020 г., 12:45
-- Версия сервера: 5.7.29-0ubuntu0.18.04.1
-- Версия PHP: 7.2.24-0ubuntu0.18.04.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `testBase_0432`
--

-- --------------------------------------------------------

--
-- Структура таблицы `Author`
--

CREATE TABLE `Author` (
  `authorId` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_roman_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_romanian_ci;

--
-- Дамп данных таблицы `Author`
--

INSERT INTO `Author` (`authorId`, `name`) VALUES
(2, 'Mirova Maria Romanova'),
(3, 'Oleg Ivanovitch Petrov'),
(4, 'Fedor Nikolayevitch  Nerinin'),
(5, 'Denis Ivanovitch Ivanov'),
(6, 'Dmitriy Fedorovitch Bukin');

-- --------------------------------------------------------

--
-- Структура таблицы `Book`
--

CREATE TABLE `Book` (
  `bookId` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET latin1 NOT NULL,
  `pageCount` int(11) NOT NULL,
  `authorId` int(11) NOT NULL,
  `author` varchar(255) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_romanian_ci;

--
-- Дамп данных таблицы `Book`
--

INSERT INTO `Book` (`bookId`, `name`, `pageCount`, `authorId`, `author`) VALUES
(3, 'Test Book #1223', 278, 3, 'Oleg Ivanovitch Petrov'),
(4, 'Test Book #6537', 127, 4, 'Fedor Nikolayevitch  Nerinin'),
(5, 'Test Book #9537', 364, 2, 'Mirova Maria Romanova'),
(6, 'Test Book #8743', 167, 3, 'Oleg Ivanovitch Petrov'),
(7, 'Test Book #9835', 143, 4, 'Fedor Nikolayevitch  Nerinin'),
(8, 'Test Book #5356', 154, 5, 'Denis Ivanovitch Ivanov'),
(9, 'Test Book #4973', 145, 6, 'Dmitriy Fedorovitch Bukin');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `Author`
--
ALTER TABLE `Author`
  ADD PRIMARY KEY (`authorId`);

--
-- Индексы таблицы `Book`
--
ALTER TABLE `Book`
  ADD PRIMARY KEY (`bookId`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `Author`
--
ALTER TABLE `Author`
  MODIFY `authorId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT для таблицы `Book`
--
ALTER TABLE `Book`
  MODIFY `bookId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
