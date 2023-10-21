package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void main(String[] args) {
        Hourglass h = new Hourglass();
        h.printHourglassOfGivenSize(6);
    }
    public void printHourglassOfGivenSize(int height) {

        int from = 0;
        int to = height -  1;
        boolean changeDirection = false;
        boolean twice = height % 2 == 0;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height; j++) {

                if (j >= from && j <= to) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }

            }

            if ((from == to || (from + 1 > to - 1))) {
                changeDirection = true;
            }

            if (from + 1 == to && twice) {
                twice = false;
            } else {

                if (changeDirection) {
                    from--;
                    to++;
                } else {
                    from++;
                    to--;
                }

            }

            System.out.println();
        }
    }
}
