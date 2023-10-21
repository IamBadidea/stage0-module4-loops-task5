package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.printTriangle(-2);

    }
    public void printTriangle(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
