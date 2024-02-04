class Demo{
    private int a = 5;
    private int b = 10;
    private int c = 15; //read only
    private int d = 20; //write only

    public int getA(){ //getter
        System.out.println("Value of A read");
        return this.a;
    }
    public int getB(){
        System.out.println("Value of B read");
        return this.b;
    }
    public void setA(int a){
        if(a > 100){
            this.a = a;
            System.out.println("Value of A chnaged to: " + a);
        } else {
            System.out.println("Cannot set - value outside limit");
        }
        
    }
    public void setB(int b){
        this.b = b;
    }
    public int getC(){ //only getter of C -> read only
        return this.c;
    }
    public void setD(int d){ //only setter -> write only
        this.d = d;
    }
}

public class EncapStudy {
    public static void main(String[] args) {
        Demo d = new Demo();
        //System.out.println(d.a);//not visisble because private
        System.out.println(d.getA());
        d.setA((100));
        System.out.println(d.getA());
    }
}
