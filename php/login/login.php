<?php

//memulai sesi php
session_start();

//check if login
if($_SESSION['logged_in'] == true) {
	//redirect to index.php
	header("Location: index.php?action=already_logged_in");
}

//check action
if($_GET['action'] == "not_yet_logged_in") {
	echo '<div class="alert alert-info" role="alert">Anda belum login</div>';
}

//check if post
if ($_POST) {
	$username = 'alwan';
	$password = '123';

	if ($_POST[username] == $username && $_POST[password] == $password) {
		//set session logged-in = true
		$_SESSION['logged_in'] = true;

		//redirect to index.php
		header('Location: index.php');
	} else {
		//give alert if access denied
		echo '<div class="alert alert-danger" role="alert">Akses ditolak</div>';
	}
}

?>

<html>

<head>
	<title>Login PHP</title>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
</head>
<body>

	<form method="post" action="login.php">
	  <div class="mb-3">
	    <label for="exampleInputEmail1" class="form-label">Username</label>
	    <input type="text" name="username" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
	  </div>
	  <div class="mb-3">
	    <label for="exampleInputPassword1" class="form-label">Password</label>
	    <input type="password" name="password" class="form-control" id="exampleInputPassword1">
	  </div>
	  <button type="submit" class="btn btn-primary">Submit</button>
	</form>
	<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>
</body>
</html>
