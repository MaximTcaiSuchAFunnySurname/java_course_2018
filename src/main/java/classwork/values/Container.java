package classwork.values;

public class Container<T, S> {
    private T elem;
    private S name;

    public void printDisplay() {
        System.out.println(elem.getClass() + " is " + elem);
        System.out.println(name.getClass() + " is " + name);
    }

    public Container(T elem, S name) {
        this.elem = elem;
        this.name = name;
    }

}
