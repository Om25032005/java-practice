//  Generate Sequence
// This program generates a sequence of numbers up to the Nth term, given the first six terms. Each new term from the seventh term onward is the sum of the two most recent terms in the sequence.
    

public class prac12 {
    public static int[] generateSequence(int N, int[] S) {
        int[] seq = new int[N];
        for (int i = 0; i < Math.min(N, 6); i++) {
            seq[i] = S[i];
        }
        for (int i = 6; i < N; i++) {
            seq[i] = seq[i - 2] + seq[i - 1];
        }
        return seq;
    }
    public static void main(String[] args) {
        int N = 10;
        int[] S = {1, 2, 3, 4, 5, 6};
        int[] result = generateSequence(N, S);
        for (int i = 0; i < N; i++) {
            System.out.print(result[i] + " ");
        }
    }
}