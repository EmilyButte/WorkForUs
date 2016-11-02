package butte.emily.passionprojectserver;

import butte.emily.passionprojectserver.domain.User;
import butte.emily.passionprojectserver.repository.UserRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	@Bean
	InitializingBean saveData(UserRepository userRepo) {
		return () ->{
			userRepo.save(new User("Emily Butte", "1234"));
			userRepo.save(new User("Evan Goulet", "4321"));
		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
