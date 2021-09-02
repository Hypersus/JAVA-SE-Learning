public class DifferentPass {
    public static void main(String[] args) {
        //pass by reference
        Person person = new Person();
        person.setName("Zeke");
        System.out.println(person.getName());
        person.changeName(person);
        System.out.println(person.getName());
        //pass by value
        int a = 1;
        System.out.println(a);
        person.changeInt(a);
        System.out.println(a);
        System.out.println(person.age);
        System.out.println(person.motto);
        System.out.println(person.word);
    }
}
