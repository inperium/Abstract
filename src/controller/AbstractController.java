package controller;

import model.Gun;
import model.guns.Shotgun;

public class AbstractController {

	private Gun automaticShotgun;

	public void start() {
		this.configureGuns();
		
		if(automaticShotgun instanceof Gun){
			System.out.println("You successfully configured your shotgun.");
		}
	}

	private void configureGuns() {
		this.automaticShotgun = new Shotgun();
	}

}
