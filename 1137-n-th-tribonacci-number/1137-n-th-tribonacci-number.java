class Solution {
    public int tribonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (n == 2) {
            return 1;
        }
        int a = 0;
        int b = 1;
        int c = 1;
        int sum = a + b + c;
        while (n > 2) {
            sum = a + b + c;
            a = b;
            b = c;
            c = sum;
            n--;
        }
        return sum;
    }
}