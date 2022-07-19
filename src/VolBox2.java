public class VolBox2 {
    // Method with return type
    // to find the volume of two boxes

    double height, width, depth;

    double Volume() {
        return  height * width * depth;
    }

    public static void main(String[] args) {
        VolBox2 b1 = new VolBox2();
        VolBox2 b2 = new VolBox2();
        // b1 data
        b1.depth = 19;
        b1.width = 15;
        b1.height = 132;
        double V1 = b1.Volume();

        // b2 data
        b2.depth = 25;
        b2.width = 15;
        b2.height = 19;
        double V2 = b2.Volume();

        System.out.println(" The volume of B1 is : " + V1);
        System.out.println(" The volume of B2 is : " + V2);

    }
}
