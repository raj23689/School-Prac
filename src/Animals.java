class Animal {
    int i, j;
    void Show() {
        System.out.println("i and j :: " + i + " " + j);
    }
}

class Bat extends Animal {
    int k;
    void ShowK() {
        System.out.println("K : " + k);
    }

    void Sum() {
        System.out.println("i + j + k :: " + (i + j + k));
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Bat bit = new Bat();
        // Values
        animal.i = 6;
        animal.j = 8;
        animal.Show();

        bit.i = 90;
        bit.j = 100;
        bit.k = 5;
        bit.Show();
        bit.ShowK();
        bit.Sum();
    }
}
