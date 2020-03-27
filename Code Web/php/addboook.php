<?php
include("./DB_connect.php");

$bn_name = $_POST['name'];
$pageCount = $_POST['pageCount'];
$authorId = $_POST['authorId'];
$author = $_POST['author'];

$auNum;$auName;$sql;

// echo $author; exit;
$sql = "SELECT * FROM `Author` where  `name` = '$author' ";
$result = mysqli_query($dbcon, $sql);	
while ($row = mysqli_fetch_assoc($result)) {
$auNum  = htmlentities($row['authorId']);
$auName  = htmlentities($row['name']);    


$sql = 'INSERT INTO `Book`( `name`, `pageCount`, `authorId`, `author`)'.
' VALUES ('.
'"'.$bn_name.'",'.
'"'.$pageCount.'",'.
'"'.$auNum.'",'.
'"'.$auName.'")' ;

}

// echo $sql; exit;
$result = mysqli_query($dbcon, $sql);
header('Location: .././index.html ');

?>