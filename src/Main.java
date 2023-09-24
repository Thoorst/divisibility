import java.io.FilterOutputStream;

public class Main {
    public static void main(String[] args) {
        //Two approaches presented, both are good but the first one is more readable in that case for me
        printDivisibility();
        //printDivisibilityTerneryOperator();
    }
    
    static void printDivisibility(){
        for(int i = 1; i <= 100; i++){
            if(i%3==0 && i%5==0) {
                System.out.println("gamma");
            }else if(i%3==0){
                System.out.println("alfa");
            }else if(i%5==0){
                System.out.println("beta");
            }else{
                System.out.println(i);
            }
        }
    }

    static void printDivisibilityTerneryOperator(){
        for(int i =1; i <=100; i++){
            String output = (i%3==0 && i%5==0 ? "gamma" : (i%3==0 ? "alfa" : (i%5==0 ? "beta" : String.valueOf(i)))) + "\n";
            System.out.print(output);
        }
    }
}