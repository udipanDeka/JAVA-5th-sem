interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing Square");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Drawable d1 = new Circle();
        Drawable d2 = new Square();
        d1.draw();
        d2.draw();
    }
}
