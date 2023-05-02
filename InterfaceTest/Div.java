package InterfaceTest;

public class Div implements ICompute{
    private int A;
    private int B;
    private int result;
    public int compute(int A,int B){
        this.A=A;
        this.B=B;
        this.result=A/B;
        System.out.println("两数相除等于:"+result);
        return result;
    }
}
