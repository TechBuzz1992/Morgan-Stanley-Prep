class A implements Cloneable{
    int i;
    String s;

    A(int i, String s){
        this.i = i;
        this.s = s;
    }

    // public String toString(){

    // }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class ClonableExample{
    public static void main(String[] args) throws CloneNotSupportedException {
        A a = new A(2, "harsh");
        A b = (A) a.clone();

        System.out.println(b.i + " " + b.s);
        
    }
    

    
}