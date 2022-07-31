public class VolBox5 {
  double length, height, depth;

  VolBox5() {
    System.out.println(" Constructing Box ");
    length = 10;
    height = 5;
    depth = 15;
  }

  double volume() {
    return length * height * depth;
  }

  public static void main(String[] args) {
    VolBox5 b1 = new VolBox5();
    VolBox5 b2 = new VolBox5();
    double v1 = b1.volume();
    double v2 = b2.volume();
    System.out.println("B1 vol: " + " " + v1);
    System.out.println("B2 vol: " + " " + v2);
  }
}
