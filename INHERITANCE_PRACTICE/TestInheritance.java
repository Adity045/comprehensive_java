package INHERITANCE_PRACTICE;

 class parent {
    void showparent(){
        System.out.println("this is parent class");

    }
    
}
// Child  class inherits parent
class child extends parent { 
    void showchild(){
        System.out.println("this is child class");
    }

}
//Main class
public class TestInheritance {
    public static void main(String[] args) {
     child obj= new child();
        obj.showparent();// parent class method
        obj.showchild();// child class method

    }

    
}