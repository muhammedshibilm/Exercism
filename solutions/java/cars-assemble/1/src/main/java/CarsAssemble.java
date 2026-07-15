public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int normalRate = speed * 221;
        double sucessRate = 0.0;
        if (speed >= 1 && speed <= 4) {
            sucessRate = 1.0;
        } else if (speed >= 5 && speed <= 8) {
            sucessRate = 0.9;
        } else if (speed == 9) {
            sucessRate = 0.8;
        } else {

            sucessRate = .77;
        }

        return normalRate * sucessRate;
    }

    public int workingItemsPerMinute(int speed) {
        double hourlyRate = productionRatePerHour(speed);
        return (int) hourlyRate / 60;
    }
}
