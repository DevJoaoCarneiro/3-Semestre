package org.example;

public class Main {
    public static void main(String[] args)
    {
        Dispositivo device = new Smartphone();
        Dispositivo device2 = new SmartTV();

        device.conectarInternet();
        device2.conectarInternet();
    }
}