package Worlds;

import biomes.Biomes;
import gameManager.World;

public class Seonugus extends World {
	private Biomes[][] map;
	
	private static int defualtx = 30;
	private static int defualty = 30;

	public Seonugus(int xSize, int ySize) {
		super(defualtx, defualty);
		manualConstructMap();
		
	}

	@Override
	public void manualConstructMap() {
		for(int x = 0; x < map.length; x++) {
		map[0][0] = new Biomes(3);
		}
	}
}
