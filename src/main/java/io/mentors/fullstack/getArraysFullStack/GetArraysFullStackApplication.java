package io.mentors.fullstack.getArraysFullStack;

import io.mentors.fullstack.getArraysFullStack.Enum.Status;
import io.mentors.fullstack.getArraysFullStack.Model.Server;
import io.mentors.fullstack.getArraysFullStack.Repository.ServerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GetArraysFullStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetArraysFullStackApplication.class, args);
	}

	@Bean
	CommandLineRunner run(ServerRepository serverRepository){
		return args -> {
			serverRepository.save(new Server(null,"192.168.1.160","Ubuntu Linux","16BG","Personal PC","http://localhost:8081/server/images/server1.png", Status.SERVER_UP));
			serverRepository.save(new Server(null,"192.168.1.161","Alpine Linux","16BG","Ragtek NAS","http://localhost:8081/server/images/server2.png", Status.SERVER_UP));
			serverRepository.save(new Server(null,"192.168.1.20","Windows 11","23BG","Web Server","http://localhost:8081/server/images/server3.png", Status.SERVER_UP));
			serverRepository.save(new Server(null,"192.168.1.21","Solaris","248BG","Rack","http://localhost:8081/server/images/server4.png", Status.SERVER_UP));
		};
	}
}
