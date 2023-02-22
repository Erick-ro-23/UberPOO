<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");

$uberX = new UberX("CVB231", new Account("Erick Elpro", "AND234"), "Chevrolet", "Spark");
$uberX->printDataCar();

$uberPool = new UberPool("TYU233", new Account("Andres Ferran", "ANE423"), "Dodge", "Attitude");
$uberPool->printDataCar();