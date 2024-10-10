package qnu.fit.dse.oop.Assignment_1;

public class Rectangle implements Shape{
    private int width;
    private int length;

    public Rectangle() {
        width = 0;
        length = 0;
    }

    public Rectangle(int width, int heigth) {
        this.width = width;
        this.length = heigth;
    }

    @Override
    public int calcutalePerimeter() {
        return 2 * (width + length);
    }

    @Override
    public int calculateArea() {
        return width * length;
    }

    @Override
    public int getLength(){
        return length;
    }

    @Override
    public int getWidth(){
        return width;
    }

    @Override
    public void setLengthWidth(int length, int width){
        this.width = width;
        this.length = length;
    }

    // chuyen thong tin cua hinh chua nhat thanh string
    public String toString() {
        return String.format("[Chieu dai]: %d, [Chieu rong]: %d", this.length, this.width);
    }
}
