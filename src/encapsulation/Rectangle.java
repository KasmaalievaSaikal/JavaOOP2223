package encapsulation;

public class Rectangle {
    private int a;
    private int b;
    private int c;
    private int d;

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
    public int getC(){
        return c;
    }
    public int getD(){
        return d;
    }


    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public void setC(int c){
        this.c = c;
    }

    public void setD(int d){
        this.d = d;
    }



    public void getInf(){
        int aiant = a*b;

        System.out.println("S: " + (a  + "*" + b + "=" + aiant));
    }



}
