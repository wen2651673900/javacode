import java.util.*;
public class oj1037 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int count = 0;
            for (int i = 1; i <= n; i++) {
                int j = i;
                while (j % 5 == 0) {//判断是否是5的倍数
                    count++;
                    j /= 5;//让j等于新的除以5的数，循环
                }
            }
            System.out.println(count);
        }
    }
}
