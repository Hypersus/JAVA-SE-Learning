import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        //Create a scanner to receive the system input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input:");
//        if (scanner.hasNext()) {
//            String str = scanner.next();
//            System.out.println(scanner.next());
//        }
//        if (scanner.hasNext()){
//            System.out.println(scanner.nextLine());
//        }
        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            System.out.println(scanner.nextLine());
        }
//        if (scanner.hasNextLine()) {
//            System.out.println(scanner.next());
//        }
//        System.out.println(scanner.nextLine());
        scanner.close();
        
    }
}
