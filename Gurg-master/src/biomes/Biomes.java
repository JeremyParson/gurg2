package biomes;

public class Biomes {
	
	private static int typeNumber;//typeNumber in Biomes creates other objects.
	
	public Biomes(int x){
		typeNumber = x;
		//getBiome();
	}
	
	public int getType() {
		return typeNumber;
	}
	
	public void setType(int x) {
		typeNumber = x;
		createObject();
	}
	
	public void getBiome() {
		switch (typeNumber) {
		case 0:
			System.out.println("Nothing...");
			break;
		case 1:
			System.out.println("Tundra");
			break;
		case 2:
			System.out.println("Taiga");
			break;
		case 3:
			System.out.println("Temperate Decideos Forest");
			break;
		case 4:
			System.out.println("Tropical Rain Forest");
			break;
		case 5:
			System.out.println("Savanna");
			break;
		case 6:
			System.out.println("Grasslands");
			break;
		case 7:
			System.out.println("Dessert");
			break;
		default:
			break;
		}
	}
	
		
		public char getSymbol() {
			char charNum = 0;
			if(typeNumber == 0) {
				charNum = 176;
			}else if(typeNumber == 1) {
				charNum = 176;
			}else if(typeNumber == 2) {
				charNum = 177;
			}else if(typeNumber == 3) {
				charNum = 157;
			}else if(typeNumber == 4) {
				charNum = 156;
			}else if(typeNumber == 5) {
				charNum = 178;
			}else if(typeNumber == 6) {
				charNum = 34;
			}else if(typeNumber == 7) {
				charNum = 35;
			}else{
				charNum = 1;
			}
			return charNum;
		}

	
	private static Biomes createObject() {
		Biomes temp = null;
		switch (typeNumber) {
		case 1:
			temp = new Tundra();
			break;
		case 2:
			temp = new Taiga();
			break;
		case 3:
			temp = new TemperateDeciduousForest();
			break;
		case 4:
			temp = new TropicalRainforest();
			break;
		case 5:
			temp = new Savanna();
			break;
		case 6:
			temp = new Grasslands();
			break;
		case 7:
			temp = new Dessert();
			break;
		default:
			break;
		}
		return temp;
	}
}

