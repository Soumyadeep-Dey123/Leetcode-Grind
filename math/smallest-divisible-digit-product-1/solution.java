class Solution {
    public int smallestNumber(int n, int t) {
        int result = 0;
        for (int i = n; i <= 100; i++) {
            int product = 1, copy = i;
            System.out.println("When i = " + i);
            while (copy > 0) {
                product = product * (copy % 10);
                copy = copy / 10;
            }
            System.out.println("Product: " + product);
            if ((product % t) == 0) {
                System.out.println("Found it! Res:" + result);
                result = i;
                break;
            }

        }
        return result;
    }

    public void main(String[] args) {
        int n1 = 21, t1 = 7;
        int n2 = 15, t2 = 3;

        System.out.println("n1 + t1 = " + smallestNumber(n1, t1));
        System.out.println("n2 + t2 = " + smallestNumber(n2, t2));

    }
}