public class Lasagna {

    public int expectedMinutesInOven(){
        return 40;
    }


    public int remainingMinutesInOven(int actualMinutes){
        return 40 - actualMinutes;
    }


    public int preparationTimeInMinutes(int numLayers){
        return numLayers * 2;
    }


    public int totalTimeInMinutes(int numLayers, int numMinutes){
        return numMinutes + (numLayers * 2);
    }
}
