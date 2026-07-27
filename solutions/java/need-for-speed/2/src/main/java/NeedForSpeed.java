class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven = 0;
    private int batteryPercentage = 100;
    NeedForSpeed(int speed, int batteryDrain) {
       this.speed = speed;
       this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
         return batteryPercentage < batteryDrain;
    }

    public int distanceDriven() {
       return distanceDriven ;
    }

    public int maxDistance() {
        return (batteryPercentage / batteryDrain) * speed;
    }

    public void drive() {
          if (!batteryDrained()) {
              distanceDriven+= speed;
           batteryPercentage -= batteryDrain;
          }
    }

    public static NeedForSpeed nitro() {
       return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;


    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return car.distanceDriven() + car.maxDistance() >= this.distance;
    }
}
