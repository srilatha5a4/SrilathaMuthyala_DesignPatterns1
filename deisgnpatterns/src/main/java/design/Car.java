package design;

public  abstract class Car {
	public Car(Cartype model) {
        this.model = model;
        arrangeParts();
    }
 
    private void arrangeParts() {

    }
 
  
    protected abstract void construct();
 
    private Cartype model = null;
 
    public Cartype getModel() {
        return model;
    }
 
    public void setModel(Cartype model) {
        this.model = model;
    }

	
}