package oopsandbeyond;
import java.util.Scanner ;
class employee1{
    private int id ;
    private String name ;
//    public employee1(){ //this is a constructor :
//        id = 2 ;
//        name = "Manav Durgapal ";
//    }
    public employee1(String myname) { //this is a constructor :
        id = 2 ;
        name = myname;
    }
    public int getid(){
        return id ;
    }
    public String getname(){
        return name ;
    }
    public void setid(int i ){
        this.id = i ;
    }
    public void setname(String n){
        this.name=n ;
    }
}
public class accessmods {
    public static void main(String[] args) {
        employee1 manav = new employee1("ManavDurgapal") ; // passing an argument for the method :
        //manav.id=1;
        //manav.name="Manav"; -------> blocked due to private access ,modifier :
        //manav.setname("MANAV");
        System.out.println(manav.getname());
        System.out.println(manav.getid());
    }
}
