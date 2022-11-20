package com.company.aditya.interfaces;

public class NiceCar {
    private Engine engine;
    private Media player = new CdPlayer();


    NiceCar() {
        engine = new PowerEngine();
    }

    NiceCar(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void acc() {
        engine.acc();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.stop();
    }

    public void upgradeEngine() {
        this.engine = new ElectricEngine();
    }
}
