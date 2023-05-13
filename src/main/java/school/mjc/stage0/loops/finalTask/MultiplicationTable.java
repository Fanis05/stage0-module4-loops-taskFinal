package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        int res;
        for (int i = 1; i<=10; i++){
            res = i*numberTableToPrint;
            System.out.println(i + " x "+numberTableToPrint + " = " + res);
        }
    }
}
