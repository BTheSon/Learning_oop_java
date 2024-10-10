package qnu.fit.dse.oop.Assignment_1;

import  qnu.fit.dse.oop.Assignment_1.Rectangle;
import java.util.Scanner;


public class ShapeTest {
    private static final int MAX_RECTANGLE = 100;           //  số lượng object tối đa được câp phát bộ nhớ
    private Rectangle[] rectangles;             // contain chứ các Rectangle
    private int sizeElement;                   //  lưu số lượng Rectangle hiện tại

    ShapeTest() {
        rectangles = new Rectangle[MAX_RECTANGLE];
        sizeElement = 0;
    }

    // bắt thông tin nhập từ phím và lưu vào field
    public void input() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhap so luong hinh chu nhat: ");
        sizeElement  = input.nextInt();

        // kiểm tra số lượng ptu trong mang lớn hơn số lượng được cấp phát không
        if (sizeElement > MAX_RECTANGLE)
            sizeElement = MAX_RECTANGLE;

        // duyệt và cấp phát vùng nhớ cho từng ptu trong mảng
        for (int i = 0; i < sizeElement; ++i) {
            int w, h;

            System.out.println("\nNhap kich thuc hinh chua nhat thu "+ (i+1));

            System.out.print("Nhap chieu cao: ");
            h = input.nextInt();
            System.out.print("Nhap chieu rong: ");
            w = input.nextInt();

            rectangles[i] = new Rectangle(w, h);
        }
    }

    // in thông tin của các Rectangle trong mảng
    public void printAllRectangles() {
        System.out.println("Thong tin cac hinh chu nhat trong thung chua: ");
        for (int i = 0; i < sizeElement; ++i) {
            System.out.println("Hinh chu nhat thu "+ i +" => " + rectangles[i].toString());
        }
    }
    //lấy object kiểu Rectangle có diện tích lớn nhất
    public Rectangle getRectMaxArea() {
         Rectangle maxRectArea = rectangles[0];
        for (int i = 0; i < sizeElement; ++i ){
            if (maxRectArea.calcutalePerimeter() < rectangles[i].calcutalePerimeter()) {
                maxRectArea = rectangles[i];
            }
        }
        return maxRectArea;
    }

    // lấy object kiểu Rectangle có chu vi nhỏ nhất
    public Rectangle getRectMinPerimeter() {
        Rectangle minRectPerimeter = rectangles[0];
        for (int i = 0; i < sizeElement; ++i ){
            if (minRectPerimeter.calcutalePerimeter() > rectangles[i].calcutalePerimeter()) {
                minRectPerimeter = rectangles[i];
            }
        }
        return minRectPerimeter;
    }

    // getter cho sizeElement
    public int getSizeElement() {
        return sizeElement;
    }


    public static void main(String[] args) {
        ShapeTest shapeTest = new ShapeTest();
        Rectangle minRectPerimeter = null;
        Rectangle maxRectArea = null;

        shapeTest.input();
        shapeTest.printAllRectangles();

        maxRectArea = shapeTest.getRectMaxArea();
        minRectPerimeter = shapeTest.getRectMinPerimeter();

        System.out.println("Thong tin hinh chua nhat co dien tich lon nhat: " + maxRectArea.toString());
        System.out.println("Thong tin hinh chua nhat co chu vi nho nhat: " + minRectPerimeter.toString());
    }

}
