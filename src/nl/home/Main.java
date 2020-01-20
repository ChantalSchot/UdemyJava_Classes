package nl.home;

public class Main {
	
	public static void main(String[] args) {
	
/* CAR
		Car porsche = new Car();
		Car holden = new Car();
		porsche.setModel("Carrera");
		System.out.println("Model = " + porsche.getModel());
*/ //CAR

/* SIMPLE CALCULATOR:
		SimpleCalculator calculator = new SimpleCalculator();
		calculator.setFirstNumber(5.0);
		calculator.setSecondNumber(4);
		System.out.println("add = " + calculator.getAdditionResult());
		System.out.println("subtract = " + calculator.getSubtractionResult());
		System.out.println("multiply = " + calculator.getMultiplicationResult());
		System.out.println("divide = " + calculator.getDivisionResult());
*/ // SIMPLE CALCULATOR

/* PERSON:
		Person person = new Person();
		person.setFirstName("");   // firstName is set to empty string
		person.setLastName("");    // lastName is set to empty string
		person.setAge(10);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John");    // firstName is set to John
		person.setAge(18);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setLastName("Smith");    // lastName is set to Smith
		System.out.println("fullName= " + person.getFullName());
*/ // PERSON

/*
		Account defaultAccount = new Account();
		Account account = new Account("92017",0.00,"Chantal Schot","chantalschot@outlook.com","06-12345678");
		Account chantalsAccount = new Account("Chantal","cs@hotmail.com","06-87654321");
		
		System.out.println("Chantal's balance: $" + chantalsAccount.getBalance());
		System.out.println("Account number = " + account.getAccountNumber());
		System.out.println("Balance = " + account.getBalance());
		System.out.println("Customer name = " + account.getCustomerName());
		System.out.println("Customer e-mail = " + account.getCustomerEmail());
		System.out.println("Customer phone = " + account.getPhoneNumber());

		account.withdraw(400);
		account.deposit(250);
		account.withdraw(180);
		
		VipCustomer vip = new VipCustomer("Edje", "at@punt.com");
		System.out.println(vip.getName());
		System.out.println(vip.getEmail());
		System.out.println(vip.getCreditLimit());
		
*/ //ACCOUNT
		
/*
		Wall wall = new Wall();
		System.out.println("area= " + wall.getArea());
		wall.setHeight(3);
		System.out.println("width= " + wall.getWidth());
		System.out.println("height= " + wall.getHeight());
		wall.setWidth((2));
		System.out.println("area= " + wall.getArea());
*/ // WALL
		
/*
		Point first = new Point(6,5);
		Point second = new Point(3,1);
		System.out.println("Distance (0,0) = " + first.distance());
		System.out.println("Distance (second) = " + first.distance(second));
		System.out.println("Distance (2,2) = " + first.distance(2,2));
		Point point = new Point();
		System.out.println("Distance () = " + point.distance());
*/ // POINT

/*
		Carpet carpet = new Carpet(3.5);
		Floor floor = new Floor(2.75, 4.0);
		CalculatorCarpet calculator = new CalculatorCarpet(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
		carpet = new Carpet(1.5);
		floor = new Floor(5.4, 4.5);
		calculator = new CalculatorCarpet(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
*/ // FLOOR*CARPET (CalculatorCarpet)

		ComplexNumber one = new ComplexNumber(1.0, 1.0);
		ComplexNumber number = new ComplexNumber(2.5, -1.5);
		one.add(1,1);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		one.subtract(number);
		System.out.println("one.real= " + one.getReal());
		System.out.println("one.imaginary= " + one.getImaginary());
		number.subtract(one);
		System.out.println("number.real= " + number.getReal());
		System.out.println("number.imaginary= " + number.getImaginary());


	}
}
