package school.mjc.stage0.loops.task5;

public class Square {
    public static void main(String[] args) {
        Square s = new Square();
        s.printSquareFrom8s(4);
    }
    public void printSquareFrom8s(int sideLength){
        for (int h = 0; h < sideLength; h++) {

            for (int l = 0; l < sideLength; l++) {
                if (h == 0 || h == sideLength - 1) {
                    System.out.print("8");
                } else {
                    if (l == 0 || l == sideLength - 1) {
                        System.out.print("8");
                    }

                    if (l > 0 && l < sideLength - 1) {
                        System.out.print(" ");
                    }
                }

            }
            System.out.print("\n");
        }

    }
}
