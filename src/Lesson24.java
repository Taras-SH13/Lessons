public class Lesson24 {
    public static void main(String [] args){
     Human2 h1=new Human2("BOB",78);
        System.out.println(h1);
    }
}
class Human2 {
    private String name;
    private int age;
    public Human2(String name,int age){
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return name+" ,"+age;
    }
}
