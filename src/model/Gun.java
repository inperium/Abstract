package model;

public class Gun {
	private String model;
	private int accuracy;
	private int damage;
	private int range;
	private int fireRate;
	
	public Gun(String model, int accuracy, int damage, int range, int fireRate) 
	{
		this.model = model;
		this.accuracy = accuracy;
		this.damage = damage;
		this.range = range;
		this.fireRate = fireRate;
	}
}
