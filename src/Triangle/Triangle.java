package Triangle;

import java.util.Scanner;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        Scanner scanner = new Scanner(System.in);
        while (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            System.out.println("Không phải là tam giác");
            side1 = scanner.nextDouble();
            side2 = scanner.nextDouble();
            side3 = scanner.nextDouble();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        Scanner scanner = new Scanner(System.in);
        while (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            System.out.println("Không phải là tam giác");
            side1 = scanner.nextDouble();
            side2 = scanner.nextDouble();
            side3 = scanner.nextDouble();
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double nuaChuVi = (side1 + side2 + side3) / 2;
        double dienTich = Math.sqrt(nuaChuVi * (nuaChuVi-side1) * (nuaChuVi - side2) * (nuaChuVi - side3));
        return dienTich;
    }

    public double getPerimeter() {
        double chuVi = side1 + side2 + side3;
        return chuVi;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    @Override
    public String toString() {
        return "Tam giác có kích thước ba cạnh là: (" + side1 + ", " + side2 + ", " + side3 + ")";
    }

    public static class TriangleTest {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Triangle tamGiac1 = new Triangle();
            System.out.println("Khởi tạo hàm không đối");

            Triangle tamGiac2;
            System.out.println("Nhập side1");
            double side1 = scanner.nextDouble();

            System.out.println("Nhập side2");
            double side2 = scanner.nextDouble();

            System.out.println("Nhập side3");
            double side3 = scanner.nextDouble();

            tamGiac2 = new Triangle(side1, side2, side3);
            System.out.println(tamGiac2.toString());
            System.out.println("Diện tích tam giác là: " + tamGiac2.getArea());
            System.out.println("Chu vi tam giác là: " + tamGiac2.getPerimeter());
        }
    }
}
