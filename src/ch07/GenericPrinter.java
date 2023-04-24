package ch07;

public class GenericPrinter<T extends Material> {

    private T material;

    public void serMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }

    public String toString() {
        return material.toString();
    }

    public void doPrinting() {
        material.doPrinting();
    }
}
