package gameRun;

import java.util.Scanner;

import Worlds.Seonugus;
import gameManager.World;

public class MainProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ioScanner = new Scanner(System.in);

		System.out.println(" xxxxxxx      x     x     xxxxx     xxxxxxx");
		System.out.println("x             x     x    x     x   x");
		System.out.println("x             x     x    x     x   x");
		System.out.println("x       xx    x     x    x    x    x       xx");
		System.out.println("x       x     x     x    x   x     x       x");
		System.out.println("x      xx     x     x    x    x    x      xx");
		System.out.println(" xxxxxxx       xxxxx     x     x    xxxxxxx");
		System.out.println("---------------------------------------------");
		System.out.println("1. Create World");
		System.out.println("2  Quit");
		System.out.println("3  Force Run Mode (Debug)");

		int in = ioScanner.nextInt();

		switch (in) {
		case 1:
			
			System.out.println("Set Map x size");
			int x = ioScanner.nextInt();
			System.out.println("Set Map y size");
			int y = ioScanner.nextInt();
			Seonugus newWorld = new Seonugus(x,y);//createNewWorld(x, y);
			newWorld.showMap();
			break;

		case 2:
			break;
			
		case 3:
			forceRunMode();
			break;

		default:
			break;
		}
		ioScanner.close();
	}

	private static World createNewWorld(int xSize, int ySize) {
		Scanner ioScanner = new Scanner(System.in);
		World newWorld = new World(xSize, ySize);
		ioScanner.close();
		//newWorld.testMap();
		return newWorld;
	}
	
	public static void forceRunMode() {

	}
}
