<?php
require_once('account.php');
class Car
{
    public $id;
    public $license;
    public $driver;
    public $passenger;

    private function getClassName()
    {
        return get_called_class();
    }


    public function __construct($license, $driver)
    {
        $this->license = $license;
        $this->driver = $driver;
    }

    public function PrintDataCar()
    {
        echo "Licencia: $this->license, Driver: {$this->driver->name},
        document: {$this->driver->document}";
    }
}