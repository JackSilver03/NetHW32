public class BmiService {

    public double calculate(int m, double h) {
        double bmi;
        bmi = m / (h*h);
        return bmi;
    }
}
