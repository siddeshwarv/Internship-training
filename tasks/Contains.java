import java.util.ArrayList;
public class Contains {
    public static void main(String [] args){
        Person jhon = new Person("John",34);
        Person sena  = new Person("Sena",21);
        Person Yoto = new Person("Yoto",33);
        ArrayList <Person> personList = new ArrayList<>();
        personList.add(jhon);
        personList.add(sena);
        personList.add(Yoto);
        System.out.println(personList.contains(new Person("John",34)));


    }
}

class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object o){
        if (this == o){
            return true;
        }    
        if (!(o instanceof Person)){
            return false;
        }
        Person person = (Person) o;
        return this.name.equals(person.name) && this.age == person.age;
    }
    
}