package prinPatrDis.B01_Abstracciones;

public class Cat {
    private String name;
    private double energy;

    public Cat(String name)
    {
        this.name = name;
    }

    public void eat(Sausage sausage) {
        energy += sausage.getNutrition();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getEnergy()
    {
        return energy;
    }

    public void setEnergy(double energy)
    {
        this.energy = energy;
    }

	@Override
	public String toString() {
		if(energy <= 0) {
			return name + " no ha comido, energia en: " + energy;
		}else {
			return name + " ya comio, energia en: " + energy;
		}
	}
}
