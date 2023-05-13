package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for(int y = 1; y<=cathetusLength; y++){
            for (int x = cathetusLength; x>y; x--){
                System.out.print(" ");
            }
            for (int x=y; x>1; x--){
                System.out.print(x);
            }
            for (int x=1; x<=y; x++){
                System.out.print(x);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
