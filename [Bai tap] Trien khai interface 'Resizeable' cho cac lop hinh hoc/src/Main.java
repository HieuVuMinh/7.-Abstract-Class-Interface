public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(1.3);
        circles[1] = new Circle(1.1);
        circles[2] = new Circle(5.3);

        for (Circle circle: circles){
            System.out.println(String.valueOf(circle));
        }
        System.out.println("---------------------------------");

        Rectangle[] rectangles = new Rectangle[4];
        rectangles[0] = new Rectangle(1.8, 2);
        rectangles[1] = new Rectangle(0.2, 3);
        rectangles[2] = new Rectangle(1.11, 1);
        rectangles[3] = new Rectangle(1.5, 5);

        for (Rectangle rectangle : rectangles){
            System.out.println(String.valueOf(rectangle));
        }

        System.out.println("---------------------------------");

        Square[] squares = new Square[3];
        squares[0] = new Square(4);
        squares[1] = new Square(1);
        squares[2] = new Square(2);

        for (Square square : squares){
            System.out.println(String.valueOf(square));
        }

        System.out.println("---------------------------------");

        Shape[] shape = new Shape[5];
        shape[0] = new Circle(1.3);
        shape[1] = new Square(4);
        shape[2] = new Rectangle(1.3, 12);
        shape[3] = new Circle(1.3);
        shape[4] = new Square(6);

        for (Shape shapes : shape){
            if (shapes instanceof Colorable){
                System.out.println(String.valueOf(shapes));
                ((Colorable) shapes).howToColor();
            }
        }
    }
}
