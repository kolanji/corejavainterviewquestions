package org.javadesignpattern.creationalDesignPattern.Builder;

public class EarthQuakeResistantBuilde implements Builder {

    private Home home = new Home();

    @Override
    public void buildFloor() {
        this.home.floor = "woodern";

    }

    @Override
    public void buildWalls() {
        this.home.walls = "walls";
    }

    @Override
    public void buildTerrace() {
        this.home.terace = "terace";
    }

    @Override
    public Home getComplexObject() {
        return this.home;
    }
}
