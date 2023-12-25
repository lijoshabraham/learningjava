package cruiseAssignment;

public class CruiseUtility {

	public static String findCruiseByFirstWord(String enteredWord, CruiseData[] cruiseDataArray) {
		for (CruiseData cruiseData : cruiseDataArray) {
			String[] words = cruiseData.getCruiseName().toLowerCase().split(" ");

			if (words.length > 0 && words[0].startsWith(enteredWord.toLowerCase())) {
				return cruiseData.getCruiseName();
			}
		}
		return null;
	}

	public static CruiseData findCruiseDataByName(String cruiseName, CruiseData[] cruiseDataArray) {
		for (CruiseData cruiseData : cruiseDataArray) {
			if (cruiseData.getCruiseName().equalsIgnoreCase(cruiseName)) {
				return cruiseData;
			}
		}
		return null;
	}
}
