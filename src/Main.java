public class Main {
    public static void main(String[] args) {
        System.out.println(solution(11, 13));
    }

    @SuppressWarnings("SameParameterValue")
    static int solution(int n, int m) {
        return (~(n ^ m) + 1) & (n ^ m);
    }
}