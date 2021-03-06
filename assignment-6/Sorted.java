//Write a method called isSorted that accepts an array of real numbers as a parameter and returns true if the list is sorted (nondecreasing) 
//order and false otherwise. For example, if arrays list1 and list2 store [16.1, 12.3, 22.2, 14.4] and [1.5, 4.3, 7.0, 19.5, 25.1, 46.2]
//respectively the calls isSorted(list1) and isSorted(list2) and should return false and true respectively. Assume the array has at least
//one element. A one-element array is considered sorted.
public class Sorted {

	public static void main(String[] args) {

		double[] list1 = { 16.1, 12.3, 22.2, 14.4 };
		double[] list2 = { 1.5, 4.3, 7.0, 19.5, 25.1, 46.2 };
		System.out.println(isSorted(list1));//false
		System.out.println(isSorted(list2));//true

	}

	public static boolean isSorted(double[] list) {

		for (int i = 1; i < list.length; i++) {
			if (list[i] < list[i - 1]) {//checks that the current element is smaller than the previous, if it is then it returns false
				return false;
			}

		}

		return true;

	}
}
 				
