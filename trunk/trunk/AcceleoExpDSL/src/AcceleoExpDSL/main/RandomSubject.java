package AcceleoExpDSL.main;

import java.util.ArrayList;
import java.util.List;

public class RandomSubject {
	private static List<Integer> selectedSubjects = new ArrayList<Integer>();
	
	public static int randomize(Integer initialValue, Integer maxValue){
		List<Integer> numbers = new ArrayList<Integer>();
		
		for(int i = initialValue; i <= maxValue; i++) {
		   if(selectedSubjects.indexOf(i)<0) numbers.add(i);
		}
		java.util.Random r = new java.util.Random();
		int index = 0;
		if(numbers.size() > 1){
			index = r.nextInt(numbers.size()-1-0) + 0;
		}
		Integer selectedSubject = numbers.get(index);
		selectedSubjects.add(selectedSubject);
		return selectedSubject;
	}
	
	
	/*public static void main(String[] args){
		for (int i = 0; i < 20; i++) {
			System.out.println(RandomSubject.randomize(1, 20));
		}
	}*/
}
