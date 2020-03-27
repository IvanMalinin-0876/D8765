<?php

$query = $_GET["q"];

$titletext ='
{
  "total_count": 1,
  "incomplete_results": false,
  "items": [
    {
      "login": "EyeHunts",
      "id": 21332347,
      "node_id": "MDQ6VXNlcjIxMzMyMzQ3",
      "avatar_url": "https://avatars3.githubusercontent.com/u/21332347?v=4",
      "gravatar_id": "",
      "url": "https://api.github.com/users/EyeHunts",
      "html_url": "https://github.com/EyeHunts",
      "followers_url": "https://api.github.com/users/EyeHunts/followers",
      "following_url": "https://api.github.com/users/EyeHunts/following{/other_user}",
      "gists_url": "https://api.github.com/users/EyeHunts/gists{/gist_id}",
      "starred_url": "https://api.github.com/users/EyeHunts/starred{/owner}{/repo}",
      "subscriptions_url": "https://api.github.com/users/EyeHunts/subscriptions",
      "organizations_url": "https://api.github.com/users/EyeHunts/orgs",
      "repos_url": "https://api.github.com/users/EyeHunts/repos",
      "events_url": "https://api.github.com/users/EyeHunts/events{/privacy}",
      "received_events_url": "https://api.github.com/users/EyeHunts/received_events",
      "type": "User",
      "site_admin": false,
      "score": 1.0
    }
  ]
}
';



$myArray = json_decode($titletext);
//header('Content-Type: application/json');
header('Access-Control-Allow-Origin: *');
header("Content-type:application/json");
// header("Content-type: application/json; charset=utf-8");
echo json_encode($myArray);
?>