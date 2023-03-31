package oopsandbeyond;
class base1 {
    base1(){
        System.out.println("I am the blank constructor inside base 1 ");
    }
    base1(int a){
        System.out.println("I am the overloaded int constructor with value : "+a);
    }
    base1(String b){
        System.out.println("I am the overloaded string constructor with value : "+b);
    }
    int x ;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}
class derived1 extends base1{
    derived1(){
        //super(69);
        System.out.println("I am the blank constructor inside derived 1 ");
    }
    derived1(int a , int b ){
        super("Danav");
        System.out.println("Im the overloaded int constructor inside derived 1 with values a : "+a+" and b : "+b);
    }
    int y ;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
class derivederived extends derived1{
    derivederived(){
        System.out.println("I am the blank constructor of derivederived : ");
    }
    derivederived(int x,int y , int z ){
        super(x,y);
        System.out.println("i am the overloaded constructor of derivederived with z as : "+z);
    }
}
public class constructors_in_inheritence {
    public static void main(String[] args) {
        //base1 m= new base1();
        //m.setX(80);
        //System.out.println(m.getX());
        //base1 f = new base1("Danav");
        //derived1 d = new derived1(); //constructors are also inherited to the extended function :
        derivederived F = new derivederived(2,3,4);
    }
}
