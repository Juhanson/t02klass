public class Container{
	double r, h, fl; // r is radius, h is height, fl is filler fluid
	
	public Container(double radius, double height, double fluid){
	if(radius<=0){throw new RuntimeException("Radius must be above 0 in value!");}
	if(height<=0){throw new RuntimeException("Height must be above 0 in value!");}
	if(fluid<=0){throw new RuntimeException("Fluid must be above 0 in value!");}
	
	r = radius;
	h = height;
	fl = fluid;
	}
	
	public double volume(){ //calculates the volume of given cylinder
		return Math.PI*(r*r)*h;
	}
	
	public double fluidPercent(){ //percentage of container given amount of fluid fills
		return ((fl*1000) / volume()) * 100;
	}
}

/*
[joosjuha@greeny t02klass]$ java Fill
Define the parameters of your cylindrical container.
Define radius: 9
Define height: 9
Litres of fluid in container: 1
The volume of your defined container is 2290.22 cm3.
You try to force 1.00 litres of fluid into it.
The container is now 43.66 percent full.
[joosjuha@greeny t02klass]$
/*