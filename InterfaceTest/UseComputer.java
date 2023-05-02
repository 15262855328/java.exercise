package InterfaceTest;

public class UseComputer{
    private int A;
    private int B;
    public void UseCom(ICompute com,int A,int B){
        this.A=A;
        this.B=B;
        com.compute(A,B);
    }
}
