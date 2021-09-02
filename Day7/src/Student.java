public class Student extends Person{
    public Student(){
        System.out.println("Student no-arg constructor");
    }
    public Student(String name){
        System.out.println("Student parameterized constructor");
    }

    @Override
    public String getName() {
        return "Zeke";
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    public void test(){
        System.out.println(this.getName());
        System.out.println("---------------------------");
        System.out.println(super.getName());
        System.out.println("---------------------");
        System.out.println(this.name);
    }
}
