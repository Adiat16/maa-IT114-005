package M2;
import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        // Don't edit anything here
        Integer[] a1 = new Integer[]{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        Integer[] a2 = new Integer[]{-1, 1, -2, 2, 3, -3, -4, 5};
        Double[] a3 = new Double[]{-0.01, -0.0001, -.15};
        String[] a4 = new String[]{"-1", "2", "-3", "4", "-5", "5", "-6", "6", "-7", "7"};

        bePositive(a1);
        bePositive(a2);
        bePositive(a3);
        bePositive(a4);
    }
    // <T> turns this into a generic so it can take in any datatype, it'll be passed as an Object so casting is required
    static <T> void bePositive(T[] arr) {
        System.out.println("Processing Array:" + Arrays.toString(arr));
        //your code should set the indexes of this array
        Object[] output = new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Integer) {
                // UCID: maa, Date: 9/29/2023, For Integer values, convert to positive by using Math.abs
                output[i] = Math.abs((Integer) arr[i]);
            } else if (arr[i] instanceof Double) {
                // UCID: maa, Date: 9/29/2023, For Double values, convert to positive by using Math.abs
                output[i] = Math.abs((Double) arr[i]);
            } else if (arr[i] instanceof String) {
                try {
                    // UCID: maa, Date: 9/29/2023, For String values, parse to Double, convert to positive, and convert back to String
                    Double parsedValue = Double.parseDouble((String) arr[i]);
                    output[i] = Double.toString(Math.abs(parsedValue));
                } catch (NumberFormatException e) {
                    // UCID: maa, Date: 9/29/2023, If parsing fails, leave the original value in the output
                    output[i] = arr[i];
                }
            } else {
                // UCID: maa, Date: 9/29/2023, If the data type is not Integer, Double, or String, leave the original value in the output
                output[i] = arr[i];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Object i : output) {
            if (sb.length() > 0) {
                sb.append(",");
            }
            sb.append(String.format("%s (%s)", i, i.getClass().getSimpleName().substring(0, 1)));
        }
        System.out.println("Result: " + sb.toString());
    }
}