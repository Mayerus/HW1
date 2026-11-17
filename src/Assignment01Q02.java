public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        
        // step 1 - sum alternating series
        int seriesDepth = Integer.parseInt(args[0]);
        for (int i = seriesDepth - 1; i >= 0; i--) {
            int denominator = (2 * i) + 1;
            double summand = 1.0 / denominator;
            approxPi += (i % 2 == 0) ? summand : -summand;
        }

        // step 2 - multiply by 4
        approxPi *= 4;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
