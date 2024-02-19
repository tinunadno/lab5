package lab5.StoredClasses;
public enum Color{
	RED,
	BLUE,
	ORANGE,
	WHITE;
	public static Color parse(String col){
		switch(col){
			case "RED":
				return Color.RED;
			case "BLUE":
				return Color.BLUE;
			case "ORANGE":
				return Color.ORANGE;
			case "WHITE":
				return Color.WHITE;
		}
		return null;
	}
}