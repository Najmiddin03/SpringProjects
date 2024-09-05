import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.neotron.car.Corolla;
import com.neotron.car.Swift;
import com.neotron.specs.EngineType;

@Configuration
@ComponentScan("com.neotron")
public class AppConfig {
	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}

	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}

	@Bean("UnknownEngine")
	public EngineType type() {
		return new EngineType();
	}

	@Bean("V6Engine")
	public EngineType V6Type() {
		return new EngineType("V6 engine");
	}

	@Bean("V8Engine")
	public EngineType V8Type() {
		return new EngineType("V8 engine");
	}

}
