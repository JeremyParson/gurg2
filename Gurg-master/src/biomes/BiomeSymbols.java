package biomes;

public class BiomeSymbols {
	BiomeSymbols(){}
	
	public char getSymbol(Biomes inputBiome) {
		char charNum = 0;
		if(inputBiome.getType() == 1) {
			charNum = 176;
		}else if(inputBiome.getType() == 2) {
			charNum = 177;
		}else if(inputBiome.getType() == 3) {
			charNum = 157;
		}else if(inputBiome.getType() == 4) {
			charNum = 156;
		}else if(inputBiome.getType() == 5) {
			charNum = 178;
		}else if(inputBiome.getType() == 6) {
			charNum = 34;
		}else if(inputBiome.getType() == 7) {
			charNum = 35;
		}
		return charNum;
	}
}
