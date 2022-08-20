import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Bhaskara {

    static Map<String, String> bhaskara(double a, double b, double c){

        double delta = pow(b, 2) - (4 * a * c);
        double x1 = ( (b * -1) - sqrt(delta) ) / (2 * a);
        double x2 = ( (b * -1) + sqrt(delta) ) / (2 * a);

        Map<String, String> result = new HashMap<String, String>();

        result.put("Delta", String.valueOf(delta));
        result.put("X1", String.valueOf(x1));
        result.put("X2", String.valueOf(x2));

        return result;


    }

}
