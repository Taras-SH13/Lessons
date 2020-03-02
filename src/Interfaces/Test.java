package Interfaces;

public class Test {
    public static void main(String[] args){
        Animal animal1=new Animal (1234);
        Person person2=new Person("Жоппарь");
        outputInfo(animal1);
        outputInfo(person2);
    }

        public static void outputInfo(Info info){
        info.showInfo();
        }

    }


