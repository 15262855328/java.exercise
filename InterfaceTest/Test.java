package InterfaceTest;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        int A,B;
        Scanner input1 = new Scanner(System.in);
        A = input1.nextInt();
        Scanner input2 = new Scanner(System.in);
        B = input2.nextInt();
        UseComputer fun = new UseComputer();
        fun.UseCom(new Add(),A,B);
        fun.UseCom(new Minus(),A,B);
        fun.UseCom(new Mul(),A,B);
        fun.UseCom(new Div(),A,B);

    }
}
