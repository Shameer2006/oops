import java.util.Scanner;
class car{
	int m = 0;
	String color;
	void start(String model,String color) {
		System.out.println("car started");
		m=1;
	}
	void start() {
		System.out.println("car started (but model not shown)");
		m=1;
	}
	void stop() {
		if (m==1) {
		System.out.println("car is stoped");
	}else {
		System.out.println("car is not started");
	}
}
}
public class bassil {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the car model:");
		String a = s.nextLine();
		System.out.println("enter the car color:");
		String b = s.nextLine();
		System.out.println("enter any one choice:\n 1.start a car \n 2.stop a car");
		int d = s.nextInt();
		 car c = new car();
		switch (d){
		
		case 1:
			c.start(a,b);
			break;
		case 2:
			c.stop();
			break;
		
	}

}
}
