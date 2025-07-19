public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = service.calculate(int weight, double height, nt bmi);
        System.out.println(bmi);

        int weight = 74;
        double height = 1.57;
        int bmi;
        bmi = int weight / (double height * double height);

    }
}