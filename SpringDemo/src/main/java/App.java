import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.neotron.car.Corolla;
import com.neotron.car.Swift;
import com.neotron.interfaces.Car;

public class App {
	public static void main(String[] args) {
//		Car swift = new Swift();
//		Car corolla = new Corolla();
//		swift.specs();
//		corolla.specs();

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car myCar = context.getBean("corolla", Car.class);
		myCar.specs();
		context.close();
	}

}
