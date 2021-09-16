
import java.util.Set;
import java.util.HashSet;

public class PerfectNumber {

    protected enum State {
        DEFICIENT, PERFECT, ABUNDANT
    }

    public static Set<Integer> Divisors(int number) {

        Set<Integer> divisors = new HashSet<>();
        for (int i = 1;i <= number; i++) {
            if (number % i == 0) {
                divisors.add(i);
            }
        }

        return divisors;
    }

    public static State Process(int n) {

        int sum = Divisors(n).stream().mapToInt(Integer::intValue).sum();
        sum = sum / 2;

        if (sum == n)
        {
            return State.PERFECT;
        }
        else if(sum < n)
        {
            return State.DEFICIENT;
        }
        else
        {
            return State.ABUNDANT;
        }
    }

    public static void main(String[] args) {

    }
}