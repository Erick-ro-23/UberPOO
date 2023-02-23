<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");
require_once("driver.php");
require_once("user.php");

$uberX = new UberX("CVB231", new Account("Erick Elpro", "AND234", "erickelpro@mail.com", "123345jk"), "Chevrolet", "Spark");
$uberX->printDataUberX();

$uberPool = new UberPool("TYU233", new Account("Andres Ferran", "ANE423", "andref34@mail.com", "pqoeq945"), "Dodge", "Attitude");
$uberPool->printDataCar();

$user = new User("Andres Ferran", "QWER23", "andref34@mail.com", "asd12334");
$user->printDataUser();
