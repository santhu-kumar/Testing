
public class Ineritance {

	public static void main(String[] args) {
	

		class Vehicle {
		    void drive() {
		        System.out.println("Driving the vehicle.");
		    }
		}

		class Bike extends Vehicle {
		    void honk() {
		        System.out.println("Honking the horn.");
		    }
		}

		class SportsCar extends Bike {
		    void accelerate() {
		        System.out.println("Accelerating the sports car.");
		    }
		}

		class Motorcycle extends Vehicle {
		    void wheelie() {
		        System.out.println("Performing a wheelie on the motorcycle.");
		    }
		}

				// TODO Auto-generated method stub
				 	Bike bike = new Bike();
			        bike.drive();
			        bike.honk();
			        System.out.println();

			        SportsCar sportsCar = new SportsCar();
			        sportsCar.drive();
			        sportsCar.honk();
			        sportsCar.accelerate();
			        System.out.println();

			        Motorcycle motorcycle = new Motorcycle();
			        motorcycle.drive();
			        motorcycle.wheelie();
				

			}


		

	}


