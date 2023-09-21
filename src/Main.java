public class Main {
    public static void main(String[] args) {
        printDivisibility();
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
}