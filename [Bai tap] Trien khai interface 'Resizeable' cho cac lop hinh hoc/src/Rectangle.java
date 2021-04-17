public class Rectangle extends Shape implements Resizeable{
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle(){};

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return (width + height) * 2;
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() + ((Math.random() * 100) + percent + 1));
        setHeight(getHeight() + ((Math.random() * 100) + percent + 1));
    }

    @Override
    public String toString() {
        resize(3);
        return "Rectangle with height =" + getHeight() + " Width = " + getWidth() +
                " Area = " + getArea() + " Perimeter = " + getPerimeter();
    }


}
