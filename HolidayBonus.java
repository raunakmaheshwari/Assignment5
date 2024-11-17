
public class HolidayBonus {
	
	private static final int highestSales = 5000;
	private static final int lowestSales = 1000;
	private static final int otherSales = 2000;
	
	public static double[] calculateHolidayBonus(double[][] nums) {
		
		double[] bonusesArr = new double[nums.length];
		for (int i = 0; i < nums.length; i++) {
			double bonusTotal = 0.0;
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] < 0){
					bonusTotal += 0;
				} else if(nums[i][j] == TwoDimRaggedArrayUtility.getHighestInColumn(nums, j)) {
					bonusTotal += highestSales;
				} else if (nums[i][j] == TwoDimRaggedArrayUtility.getLowestInColumn(nums, j)) {
					bonusTotal += lowestSales;
				} else {
					bonusTotal += otherSales;
				}
				
				
			}
			bonusesArr[i] = bonusTotal;
			
			
		}
		
		return bonusesArr;
	}
	
	public static double calculateTotalHolidayBonus(double[][] nums) {
		double totalBonus = 0.0; 
		double bonusesArr[] = calculateHolidayBonus(nums);
		for (int i = 0; i < bonusesArr.length; i++) {
			totalBonus += bonusesArr[i];
		}
		return totalBonus;
	}
	
	
	
	
}
