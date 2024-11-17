import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoDimRaggedArrayUtility {
	
	
	public static double[][] readFile(File file) {
		
		int count = 0;
		int lineCount = 0;
		try {
			Scanner sc = new Scanner(file);
			Scanner preSc = new Scanner(file);
			while (preSc.hasNextLine()) {
				preSc.nextLine();
				lineCount += 1;
			}
			preSc.close();
			double nums[][] = new double[lineCount][];
			while (sc.hasNextLine()) {
				String line = sc.nextLine();
				
				int innerCount = 0;
				int numCount = 0;
				String[] splitArr = line.split(" ");
				double innerNums[] = new double [splitArr.length];
				for (int i = 0; i < splitArr.length; i++) {
					innerNums[i] = Double.parseDouble(splitArr[i]);
				}
				nums[count] = innerNums;
				count += 1;
				
				
			}
			
			sc.close();
			return nums;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
		
	}
	
	public static void writeToFile(double[][] nums, File outputFile) {
		try {
			String n = "";
			FileWriter writer = new FileWriter(outputFile);
			for (int i = 0; i < nums.length; i++) {
				
				for (int j = 0; j < nums[i].length; j++) {
					n += (nums[i][j] + " ");
				}
				n += "\n";
			}
			writer.write(n);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static double getTotal(double[][] nums) {
	
		double total = 0.0;
	
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
		
				total += nums[i][j];
			}
		}
		
		return total;
		
	}
	
	public static double getAverage(double[][] nums) {
		int count = 0;
		double total = 0.0;
		double avg;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				count += 1;
				total += nums[i][j];
			}
		}
		avg = total / count;
		
		return avg;
	}
	
	public static double getRowTotal(double nums[][], int index) {
		
		double rowTotal = 0.0;
		for (int i = 0; i < nums[index].length; i++) {
			rowTotal += nums[index][i];
		}
		
		return rowTotal;
	}
	
	public static double getColumnTotal(double nums[][], int index) {
		double columnTotal = 0.0;
		for (int i = 0; i < nums.length; i++) {
			if (index >= nums[i].length) {
				continue;
			}
			columnTotal += nums[i][index];
			
		}
		return columnTotal;
	}
	
	public static double getHighestInRow(double nums[][], int index) {
		double maxNum = nums[index][0];
		for (int i = 0; i < nums[index].length; i++) {
			if (nums[index][i] > maxNum) {
				maxNum = nums[index][i];
			}
		}
		
		return maxNum;
		
	}
	
	public static double getHighestInRowIndex(double nums[][], int index) {
		double maxNum = nums[index][0];
		int maxIndex = 0;
		for (int i = 0; i < nums[index].length; i++) {
			if (nums[index][i] > maxNum) {
				maxNum = nums[index][i];
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}
	
	public static double getLowestInRow(double nums[][], int index) {
		double minNum = nums[index][0];
		for (int i = 0; i < nums[index].length; i++) {
			if (nums[index][i] < minNum) {
				minNum = nums[index][i];
			}
		}
		
		return minNum;
		
	}
	
	public static double getLowestInRowIndex(double nums[][], int index) {
		double minNum = nums[index][0];
		int minIndex = 0;
		for (int i = 0; i < nums[index].length; i++) {
			if (nums[index][i] < minNum) {
				minNum = nums[index][i];
				minIndex = i;
			}
		}
		
		return minIndex;
	}
	
	public static double getHighestInColumn(double nums[][], int index) {
		double maxNum = Double.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (index >= nums[i].length) {
				continue;
			}
			if (nums[i][index] > maxNum) {
				maxNum = nums[i][index];
			}
			
			
		}
		return maxNum;
	}
	
	public static double getHighestInColumnIndex(double nums[][], int index) {
		double maxNum = Double.MIN_VALUE;
		int maxIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (index >= nums[i].length) {
				continue;
			}
			if (nums[i][index] > maxNum) {
				maxNum = nums[i][index];
				maxIndex = i;
			}
			
			
		}
		return maxIndex;
	}
	
	public static double getLowestInColumn(double nums[][], int index) {
		double minNum = Double.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			if (index >= nums[i].length) {
				continue;
			}
			if (nums[i][index] < minNum) {
				minNum = nums[i][index];
			}
			
			
		}
		return minNum;
	}
	
	public static double getLowestInColumnIndex(double nums[][], int index) {
		double minNum = Double.MAX_VALUE;
		int minIndex = 0;
		for (int i = 0; i < nums.length; i++) {
			if (index >= nums[i].length) {
				continue;
			}
			if (nums[i][index] < minNum) {
				minNum = nums[i][index];
				minIndex = i;
			}
			
			
		}
		return minIndex;
	}
	
	public static double getHighestInArray(double nums[][]) {
		double maxNum = Double.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] > maxNum) {
					maxNum = nums[i][j];
				}
			}
		}
		
		return maxNum;
	}
	
	public static double getLowestInArray(double nums[][]) {
		double minNum = Double.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				if (nums[i][j] < minNum) {
					minNum = nums[i][j];
				}
			}
		}
		
		return minNum;
	}
	
	
	
}
