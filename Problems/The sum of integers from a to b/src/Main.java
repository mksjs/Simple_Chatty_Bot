import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}