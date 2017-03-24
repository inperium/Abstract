package model.guns;

import model.Automatic;
import model.Gun;

public class Shotgun extends Gun implements Automatic {

	public Shotgun() {
		super("AA-12", 5, 10, 5, 1);
	}

	@Override
	public int cooldown() {
		return 5;
	}

	@Override
	public int roundsPerSecond() {
		return 30;
	}

}
