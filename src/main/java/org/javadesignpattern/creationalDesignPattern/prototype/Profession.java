package Java_design_pattern.creationalDesignPattern.prototype;

public abstract class Profession implements Cloneable {
    public int id;
    public String name;

    abstract void print();

    public Object cloningMethod() throws CloneNotSupportedException {
        Object object = null;
        object = super.clone();
        return object;
    }

}
