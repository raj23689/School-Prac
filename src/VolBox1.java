public class VolBox1 {
    // Method with no return type way
    // to find volume of two boxes.
    double height, length, depth;
    void Volume () {
        double V = height * length * depth;
        System.out.println("The volume is: " + V);
    }

    public static void main(String[] args) {
        VolBox1 box1 = new VolBox1();
        VolBox1 box2 = new VolBox1();
        // box1 data
        box1.height = 10;
        box1.length = 12;
        box1.depth = 15;
        box1.Volume();

        // box2 data
        box2.height = 11;
        box2.depth = 17;
        box2.length = 18;
        box2.Volume();
    }
}
