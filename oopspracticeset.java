package oopsandbeyond;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner ;
//Q1 : create a class employee with the following methods and properties :
//salary,name;getsalary,getname,changename :
class employee {
    int salary ;
    String name ;
    public int getsalary(){
        return salary ;
    }
    public String getname(){
        return name ;
    }
    public void changename(String n ){
        name = n ;
    }
}
//Q2 : create a class cellphone with methods like ringing and vibrating etc.
class cellphone {
    public void ring(){
        System.out.println("The phone is ringing......");
    }
    public void vibrating(){
        System.out.println("The phone is vibrating.......");
    }
    public void cut(){
        System.out.println("Ohhh.....Looks like the call was cut ......");
    }
}
class square {
    int side ;
    public int area(){
        int ar = side*side ;
        return ar ;
    }
    public int perimeter(){
        int peri = 4*side ;
        return peri ; 
    }
}
class rectangle {
    int len;
    int bre;
    public int perimeter(){
        int peri = 2*(len+bre);
        return peri ;
    }
    public int area (){
        int area = len*bre ;
        return area ;
    }
}
public class oopspracticeset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Q1 :
        /*employee ed = new employee();
        System.out.println("Enter details below : ");
        System.out.print("Enter name : ");
        ed.name = sc.nextLine();
        System.out.print("Enter salary : ");
        ed.salary =sc.nextInt();
        System.out.println("The name of the employee is : "+ed.name);
        System.out.println("The salary of the employee is : "+ed.salary);
        System.out.print("Enter the new name : ");
        String Manav=sc.next();
        ed.changename(Manav);
        System.out.println("The new name after change is : "+ed.getname());*/
        //Q2 :
        /*cellphone iphone = new cellphone() ;
        iphone.ring();
        iphone.vibrating();
        iphone.cut();*/
        //Q3 :
        /*square sq = new square();
        System.out.println("Enter the side length : ");
        sq.side= sc.nextInt();
        System.out.println("The side length of the square is : "+sq.side);
        System.out.println("Thus, the area of the square is : "+sq.area()+"Sq. units");
        System.out.println("And the perimeter of the square is : "+sq.perimeter());*/
        //Q4 :
        /*rectangle rect = new rectangle();
        System.out.print("Enter length of rectangle : ");
        rect.len= sc.nextInt();
        System.out.print("Enter breadth of rectangle : ");
        rect.bre=sc.nextInt();
        System.out.print("Enter unit of length and breadth : ");
        String unit = sc.next();
        System.out.println("The length of the rectangle is : "+rect.len+" "+unit+" , and its breadth is : "+rect.bre+" "+unit);
        System.out.println("The perimeter of the rectangle is : "+rect.perimeter()+" "+unit);
        System.out.println("And its area is : "+rect.area()+" Sq."+unit);*/
        }
    }

