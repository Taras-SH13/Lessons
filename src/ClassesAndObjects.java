public class ClassesAndObjects {
    public static void main(String[]args){
        Person person1=new Person();
        Person person2=new Person();
        person1.setName("");
        person1.setAge(-89);
        person2.setName("Осляра");
        person2.setAge(34);
        System.out.println("Выводим значение в методе main "+person1.getName());
        System.out.println("Выводим возраст "+person1.getAge());


    }
}



class Person {
    private String name;
    private int age;
    public void setName(String username){//проверяем пользователя на ввод пустого имени
        if (username.isEmpty()){// это условие проверки ввода имени
            System.out.println("Ты дибил");

        }else {
        name=username;}
    }
    public String getName(){
        return name;
    }
    public void setAge(int userage){
        if(userage<0){
            System.out.println("Ты дибил");
        }else{
        age=userage;}
    }

    public int getAge() {
        return age;
    }

    int calculateYearsToRetirement(){
    int years=65-age;
    return years;
}
    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ",мне" + age + " лет");
        }
    }
    void sayHello (){
        System.out.println("Привет");
    }
}

