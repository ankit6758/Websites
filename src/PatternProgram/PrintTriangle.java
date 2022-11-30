package PatternProgram;

public class PrintTriangle {
            public static void fn(int n){
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j <=i ; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
            }

             public static void fn1(int n){
                for (int i = 1; i <= n-1; i++) {
                    for (int j = 1; j <=n-i+1; j++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }
                 for (int i = 1; i <= n; i++) {
                     for (int j = 1; j <=i ; j++) {
                         System.out.print("* ");
                     }
                     System.out.println("");
                 }
            }


    public static void main(String[] args) {
        fn1(10);
    }
}
