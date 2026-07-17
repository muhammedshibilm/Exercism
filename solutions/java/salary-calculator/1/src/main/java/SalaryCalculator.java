public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
      return  daysSkipped >= 5 ? .85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold  >= 20 ? 13 :10;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
          double finalsalary = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

          return finalsalary >= 2000 ? 2000 : finalsalary;  
    } 
}
