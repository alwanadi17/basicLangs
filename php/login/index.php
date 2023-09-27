<?php

//start session
session_start();

//check if user has not login yet
if (empty($_SESSION['logged_in'])) {
	//redirect to login
	header('Location: login.php?action=not_yet_logged_in');
}

?>

<html>
	<head>
		<title>Login Berhasil</title>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
	</head>
	<body>

<?php
//get action
$action = $_GET['action'];

if ($action == 'logout') {
	//hapus semua session dan pengaturannya
	session_destroy();

	header('Location: login.php');
} else if ($action == 'already_logged_in') {
		echo '<div class="alert alert-info" role="alert">Anda sudah login</div>';
}

if ($_SESSION['logged_in'] == true && !($action == 'already_logged_in')) {
	echo '<div class="alert alert-success" role="alert">Anda berhasil login</div>';
}

?>


	  <div class="d-grid gap-2" id="action">
		  <a href="login.php"><button class="btn btn-primary" type="button">Pergi ke halaman login</button></a>
		  <a href="index.php?action=logout"><button class="btn btn-primary" type="button">Logout</button></a>
		</div>

	</body>
</html>
