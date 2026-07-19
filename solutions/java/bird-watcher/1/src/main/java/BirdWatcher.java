import java.util.Arrays;;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeek =  {0,2,5,3,7,8,4};
        return lastWeek;
    }

    public int getToday() {
        return birdsPerDay[ birdsPerDay.length - 1 ];
    }

    public void incrementTodaysCount() {
         int getLastData = getToday();
         birdsPerDay[birdsPerDay.length - 1 ] = getLastData +1 ;
    }

    public boolean hasDayWithoutBirds() {
        for(int day : birdsPerDay){
            if(day == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int[]  splitedArray =  Arrays.copyOfRange(birdsPerDay, 0, numberOfDays);
        int totalCount =  0;

        for (int num : splitedArray){
            totalCount += num;
        }

        return totalCount;
        
    }

    public int getBusyDays() {
        int busyDays =0;

        for(int day: birdsPerDay){
            if(day >=5 ){
                busyDays += 1;
            }
        }

        return busyDays;
    }
}
