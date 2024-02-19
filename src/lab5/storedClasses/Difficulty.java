package lab5.storedClasses;
public enum Difficulty{
	VERY_HARD,
	INSANE,
	TERRIBLE;
	public static Difficulty parse(String col){
		switch(col){
			case "VERY_HARD":
				return Difficulty.VERY_HARD;
			case "INSANE":
				return Difficulty.INSANE;
			case "TERRIBLE":
				return Difficulty.TERRIBLE;
		}
		return null;
	}
}