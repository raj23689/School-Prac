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

    @Override
    void Show() {
        System.out.println("i + j + k :: " + (i + j + k));
    }
}

public class Animals {
}
