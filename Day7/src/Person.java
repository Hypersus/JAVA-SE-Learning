public class Person {
    String name;
    //    String name;
    int age;
    String motto;
    char word;
    /*
    Person class no-arg constructor
     */
    public Person(){
        System.out.println("Person no-arg constructor");
    }
    public Person(String name){
        System.out.println("Person parameterized constructor");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void changeName(Person person){
        person.name ="Hypersus";
    }
    public void changeInt(int a){
        a=10;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.name ="aa";
    }
}
