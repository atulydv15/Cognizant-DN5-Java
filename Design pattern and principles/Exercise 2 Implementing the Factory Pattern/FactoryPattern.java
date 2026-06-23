interface Shape {
    void draw();
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory {

    public Shape getShape(String shapeName) {

        if (shapeName.equalsIgnoreCase("Circle")) {
            return new Circle();
        }

        if (shapeName.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}

public class FactoryPattern {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        Shape shape1 = factory.getShape("Circle");
        shape1.draw();

        Shape shape2 = factory.getShape("Rectangle");
        shape2.draw();
    }
}