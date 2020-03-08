package core_java_apis;

/*
 * Java will automatically convert primitive value to relevant wrapper. This called autoboxing
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

    public static void main(String[] args) {

        {
            List<Double> weights = new ArrayList<>(); // wrapper class Double
            weights.add(50.5); // [50.5] // double primitive to double object
            weights.add(new Double(60)); // [50.5, 60] // wrapper Double
            weights.remove(50.5); // [60]
            double first = weights.get(0); // [60] // wrapper Double unbox to double primitive
        }

        {
         List<Integer> heights = new ArrayList<>();
         heights.add(null); // add null to the list, a null reference can be assigned to any reference variable
         int h = heights.get(0); // null pointer, null can't be unbox to a int primitive
        }
    }
}
