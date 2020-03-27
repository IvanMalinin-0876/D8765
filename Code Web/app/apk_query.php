<?php

$query = $_GET["q"];

$titletext ='
{
  "status": "ok",
  "title": "Тестовое задание по технологиям Kotlin-JSON-Volley-Php-MySql. В задании представлена библиотека книг, где можно добавить книгу и автора в базу данных. Посмотреть карточки книг в приложении. База данных представленна в форме mysql. Решение показывает навыки: Верстка; Базовые операции с JS; Базовые операции с PHP; Обращение  к БД MySql и  чтенние и запрос данных; Формы ввода HTML; Таблицы HTML; Интеграция php в HTML; Интеграция JS в HTML; Использование CSS."
}
';

$myArray = json_decode($titletext);
header('Content-Type: application/json');
echo json_encode($myArray);
?>