<?php
require_once('car.php');
class UberVan extends Car
{
    public $typeCarAccepted;
    public $seatsMaterial;
    public function __construct($license, $driver, $seatsMaterial, $typeCarAccepted, $name, $document)
    {
        parent::__construct($license, $driver);
        $this->seatsMaterial = $seatsMaterial;
        $this->typeCarAccepted = $typeCarAccepted;
    }
}