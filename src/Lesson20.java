public class Lesson20 {
    public static void main(String[] args){
        Human human1=new Human("JON",56);
        Human human2=new Human("Frick",67);
        human1.printNumberOfPeople();
        Human human3=new Human("Fuck",78);
        human3.printNumberOfPeople();
        System.out.println(human1);

    }
}
class Human{
    private String name;
    private int age;
    private static int countPeopl;
    public Human(String name, int age){
        this.name=name;
        this.age=age;
        countPeopl++;
    }
    public void printNumberOfPeople(){
        System.out.println("Number of people "+countPeopl);
    }
}