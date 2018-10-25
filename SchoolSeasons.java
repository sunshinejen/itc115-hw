//winter 12-16 -3-15
//spring 3-16 - 6-15
//summer 6-16 - 9-15
//fall 9-16 - 12-15
public class SchoolSeasons {

	public static void main(String[] args) {
		System.out.println(season(8, 30));
		System.out.println(season(2, 5));
	}
	
	public static String season (int month, int day) {
			if (month == 12 && day >= 16 || month == 1 || month == 2 || month == 3 && day <= 15) {				
				return "Winter";
			
			} else if (month == 3 && day >= 16 || month == 4 || month == 5|| month == 6 && day <= 15) {
				
				return "Spring";
				
			} else if (month == 6 && day >= 16 || month == 7|| month == 8 || month == 9 && day <= 15) {
				
				return "Summer";
				
			} else {
				
				return "Fall";
			}
		
	}

}
