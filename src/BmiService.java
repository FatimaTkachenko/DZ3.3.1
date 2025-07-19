public class BmiService {
    public int calculate(int weight, double height, int bmi); {
     int bmi = int weight / (double height * double height);
        return (int) bmi;
    }
}
