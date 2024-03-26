package org.javadesignpattern.creationalDesignPattern.Builder;

public interface Builder {

    public void buildFloor();

    public void buildWalls();

    public void buildTerrace();

    public Home getComplexObject();
}
