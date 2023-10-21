package school.mjc.stage0.loops.task5;

public class Rectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.printRectangleFrom8s(0, 0);
    }
    public void printRectangleFrom8s(int length, int height) {
        for (int h = 0; h < height; h++) {

            for (int l = 0; l < length; l++) {
                if (h == 0 || h == height - 1) {
                    System.out.print("8");
                } else {
                    if (l == 0 || l == length - 1) {
                        System.out.print("8");
                    }

                    if (l > 0 && l < length - 1) {
                        System.out.print(" ");
                    }
                }

            }
            System.out.print("\n");
        }
    }
}
