public class Square extends Rectangle implements Resizeable, Colorable {
    public Square(){};

    public Square(double size) {
        super(size, size);
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled, size, size);
    }

    public double getSize(){
        return getWidth();
    }

    public void setSize(double size){
        super.setWidth(size);
        super.setHeight(size);
    }

    @Override
    public void setWidth(double width) {
        setSize(width);
    }

    @Override
    public void setHeight(double height) {
        setSize(height);
    }

    @Override
    public String toString() {
        resize(3);
        return "Square with height =" + getHeight() + " Width = " + getWidth() +
                " Area = " + getArea() + " Perimeter = " + getPerimeter();
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides..");
    }
}
