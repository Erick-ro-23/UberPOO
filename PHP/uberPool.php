<?php
require_once('car.php');
class UberPool extends Car
{
    public $brand;
    public $model;

    public function __construct($brand, $model, $license, $driver)
    {
        parent::__construct($license, $driver);
        $this->brand = $brand;
        $this->model = $model;
    }
}