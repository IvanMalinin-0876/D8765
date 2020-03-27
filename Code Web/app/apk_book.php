


    <?php
  
$query = $_GET["q"];
include("../php/DB_connect.php");


$query = $_GET["q"];

$titletext ='
{
  "status": "ok",
  "item":[';



$sql = "SELECT * FROM `Book` ";
			$result = mysqli_query($dbcon, $sql);			
			
			while ($row = mysqli_fetch_assoc($result)) {
			
				$nbNum   = htmlentities($row['bookId']);
				$nbName  = htmlentities($row['name']);
				$nbPages = htmlentities($row['pageCount']);
				$nbAutor = htmlentities($row['author']);

$titletext = $titletext.' {
  "id": "'.$nbNum.'",
  "name" : "'.$nbName.'",
  "pages": "'.$nbPages.'",
  "author" : "'.$nbAutor.'"
},';
			
			}
			
$titletext = $titletext.'
{

  "id" : "0",
  "name" : "Тестовая книга № 6734",
  "pages": "153",
  "author" : "Велько Петр Иванович"
}


]}';	

$myArray = json_decode($titletext);
header('Content-Type: application/json');
echo json_encode($myArray);
			
			
					
					?>
