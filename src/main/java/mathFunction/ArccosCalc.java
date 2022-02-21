package mathFunction;
import java.util.ArrayList;

public class ArccosCalc {

    private double cos(double x, int membersCount) {

        ArrayList<Integer> factorials = new ArrayList<Integer>(membersCount * 2);
        factorials.set(0, 1);
        factorials.set(1, 1);
        for (int i = 2; i <= membersCount * 2; i++) {
            factorials.set(i, factorials.get(i - 1) * i);
        }

        int multiplier = -1;
        Double arccos = Double.valueOf(1);
        for (int i = 1; i <= membersCount - 1; i++) {
            arccos += 1 / (multiplier * (Math.pow(x, 2 * i) / factorials.get(2 * i)));
            multiplier *= -1;
        }
        return arccos;
    }
}
