public class Lesson19 {
    public static void main(String [] args){

    }
}
class Human1{

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
       this.age = age;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
    public void getInfo(){
        System.out.println(name+"  "+age);
    }
}