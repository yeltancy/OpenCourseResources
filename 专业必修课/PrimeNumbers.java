public class PrimeNumbers {
    public static void main(String[] args) {
        int sum = 0; // 初始化素数和为0
        System.out.print("1-100中的素数有：");
        for (int i = 2; i <= 100; i++) { // 从2到100枚举每个数字
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) { // 检查是否为素数
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                sum += i; // 素数累加
            }
        }
        System.out.println("\n1-100中的素数和为：" + sum);
    }
}
