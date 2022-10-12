package shapes;

abstract public class Quadrilateral extends Shape implements Measureable{
    protected int width;
    protected int length;

    public Quadrilateral(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getLength(){
        return this.length;
    }

    public int getWidth(){
        return this.width;
    }

    abstract void setLength(double length);

    abstract void setWidth(double width);
}
