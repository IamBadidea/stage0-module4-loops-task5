package school.mjc.stage0.loops.task5;

public class Cross {

    public static void main(String[] args) {
        Cross c = new Cross();
        c.printCross(6);
    }
    public void printCross(int sideLength) {
        if (sideLength % 2 != 0) {
            int center = sideLength / 2;
            for (int i = 0; i < sideLength; i++) {
                for (int j = 0; j < sideLength; j++) {
                    if (j == center || i == center) {
                        System.out.print("8");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
