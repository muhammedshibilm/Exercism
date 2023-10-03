class ArmstrongNumbers {
  bool isArmstrongNumber(String nums) {
    double sum = 0;
    double r;
    double n = double.parse(nums);
    double temps = double.parse(nums);
    while (n > 0) {
      r = n % 10;
      sum += (r * r * r);
      n = n / 10;
    }

    if (sum == temps) {
      return true;
    } else {
      return false;
    }
  }
}
