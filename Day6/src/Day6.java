public class Day6 {
    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5};
//        for (int x:a){
//            System.out.println(x);
//        }
          //print triangle
        int row = 5;//specify the row number
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j<=i; j++){
                System.out.print("*");
            }
            for (int j = 0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
