abstract class Shape {
 abstract double area();
}

class Circle extends Shape {
 double r;

 Circle(double r) {
  this.r = r;
 }

 double area() {
  return Math.PI * r * r;
 }
}

class Rectangle extends Shape {
 double l, b;

 Rectangle(double l, double b) {
  this.l = l;
  this.b = b;
 }

 double area() {
  return l * b;
 }
}

class Triangle extends Shape {
 double base, height;

 Triangle(double base, double height) {
  this.base = base;
  this.height = height;
 }

 double area() {
  return 0.5 * base * height;
 }
}

class TestShape {
 public static void main(String[] args) {
  System.out.println("Name: Kanishka Bhatt, Batch: 4, SAP ID: 590017366");

  Shape s;
  s = new Circle(5);
  System.out.println("Output of the code for Circle Area is: " + s.area());

  s = new Rectangle(4, 6);
  System.out.println("Output of the code for Rectangle Area is: " + s.area());

  s = new Triangle(5, 6);
  System.out.println("Output of the code for Triangle Area is: " + s.area());
 }
}