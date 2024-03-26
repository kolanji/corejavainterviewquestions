package Java_design_pattern.creationalDesignPattern.Builder;

public interface Builder {

    public void buildFloor();

    public void buildWalls();

    public void buildTerrace();

    public Home getComplexObject();
}
