public class VolBox4 {
    double height, width, depth;

    double Volume( double height, double width, double depth) {
        return height * width * depth;
    }

    public static void main(String[] args) {
        VolBox4 be1 = new VolBox4();
        VolBox4 be2 = new VolBox4();
        // box's data
        double vol1 = be1.Volume(51,56, 48);
        double vol2 = be2.Volume(45, 54, 23);

        // printing the values
        System.out.println("Box 1 vol: " + vol1);
        System.out.println("Box 2 vol: " + vol2);
    }
}
