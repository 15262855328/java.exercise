package InterfaceTest;

public class Minus implements ICompute{
    private int A;
    private int B;
    private int result;
    public int compute(int A,int B){
        this.A=A;
        this.B=B;
        this.result=A-B;
        System.out.println("两数相减等于:"+result);
        return result;
    }
}
