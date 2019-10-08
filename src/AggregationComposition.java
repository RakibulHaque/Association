

class Engine
{
	public void work()
	{
		System.out.println("Engine of a car has been started ");
	}
	
}

final class Car 
{
	private final Engine engine;
	Car(Engine engine)
	{
		this.engine = engine;
		
	}
	public void move()
	{
		engine.work();
		System.out.println("Car is moving");
		
	}
}

public class AggregationComposition {

	public static void main(String[] args)
	{
		Engine engine = new Engine();
		Car car = new Car(engine);
		car.move();
		
	}
		
}

