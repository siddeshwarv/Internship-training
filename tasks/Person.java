public class Person{
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