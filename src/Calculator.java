public interface Calculator {
    int data=3;
double add(double x, double y);
double subtract(double x, double y);
    double multiply(double x, double y);
    default double divide(double x, double y){
        return x/y;
    }
    private void display(){
        System.out.println("hello");
    }
    static void printBye(){
        System.out.println("bye Bye");
    }

}
