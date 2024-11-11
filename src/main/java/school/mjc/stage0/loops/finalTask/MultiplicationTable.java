package school.mjc.stage0.loops.finalTask;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint){
        
        int result; 
        for (int i = 1; i <= numberTableToPrint; i++) { 
            
            System.out.println(i+" x "+numberTableToPrint+" = "+i*numberTableToPrint);
        }
    }
}
