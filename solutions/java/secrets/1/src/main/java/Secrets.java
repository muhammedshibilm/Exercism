public class Secrets {
    public static int shiftBack(int value, int amount) {
      return value >=0 ? value >> amount : value >>> amount;
    }

    public static int setBits(int value, int mask) {
       return value | mask;
    }

    public static int flipBits(int value, int mask) {
       return value ^ mask;
    }

    public static int clearBits(int value, int mask) {
        return (value & (~mask));
    }
}