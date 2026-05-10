class GCD {

    int gcd(int a, int b) {

        while (b != 0) {

            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {

        GCD t = new GCD();

        System.out.println(t.gcd(20, 30));
    }
}