package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void main(String[] args) {
        Hourglass h = new Hourglass();
        h.printHourglassOfGivenSize(6);
    }
    public void printHourglassOfGivenSize(int height) {

        int from;
        int to;

        for (int first = 0, last = height - 1; first < height; first++, last--) {
            for (int current = 0; current < height; current++) {
                if (current >= first && current <= last || current >= last && current <= first) {
                    System.out.print("8");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
