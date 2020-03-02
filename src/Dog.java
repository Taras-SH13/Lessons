public class Dog extends Animal {


    public void bark(){
        System.out.println(name+" barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }
    public void myname_is(){
        System.out.println(name);
    }
}

