class Swap {

    // Method 1: Addition & Subtraction
    void swapAddSub(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Addition/Subtraction Swap:");
        System.out.println("a = " + a + ", b = " + b);
    }

    // Method 2: Multiplication & Division
    void swapMulDiv(int a, int b) {

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("Multiplication/Division Swap:");
        System.out.println("a = " + a + ", b = " + b);
    }

    // Method 3: XOR Method
    void swapXOR(int a, int b) {

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("XOR Swap:");
        System.out.println("a = " + a + ", b = " + b);
    }

    // Method 4: Single Statement
    void swapSingleStatement(int a, int b) {

        a = a + b - (b = a);

        System.out.println("Single Statement Swap:");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {

        Swap s = new Swap();

        int a = 10;
        int b = 20;

        s.swapAddSub(a, b);
        System.out.println();

        s.swapMulDiv(a, b);
        System.out.println();

        s.swapXOR(a, b);
        System.out.println();

        s.swapSingleStatement(a, b);
    }
}