//package de.unikoeln.dockerdemo;
//
//import de.unikoeln.dockerdemo.entity.UserProfile;
//import de.unikoeln.dockerdemo.repo.UserRepository;
//import org.slf4j.Logger;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//public class DockerDemoApplication {
//
//	private static final Logger log = org.slf4j.LoggerFactory.getLogger(DockerDemoApplication.class);
//
//	public static void main(String[] args) {
//		SpringApplication.run(DockerDemoApplication.class, args);
//	}
//
//	@Bean
//	CommandLineRunner initDatabase(UserRepository repository) {
//
//		return args -> {
//			if (repository.count() == 0) {
//				log.info("Preloading " + repository.save(
//						new UserProfile("Max Mustermann", "max@mustermann.de",
//								true, false)));
//				log.info("Preloading " + repository.save(
//						new UserProfile("Anton Schlömer", "aschloe5@smail.uni-koeln.de",
//								true, true)));
//			} else {
//				log.info("Database found with content already present, skipped preloading.");
//			}
//		};
//	}
//}
