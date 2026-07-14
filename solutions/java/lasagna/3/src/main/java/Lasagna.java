public class Lasagna {

    public int expectedMinutesInOven(){
        return 40;
    }


    public int remainingMinutesInOven(int actualMinutes){
        return expectedMinutesInOven() - actualMinutes;
    }


    public int preparationTimeInMinutes(int numLayers){
        return numLayers * 2;
    }


    public int totalTimeInMinutes(int numLayers, int numMinutes){
        return numMinutes + preparationTimeInMinutes(numLayers);
    }
}
