package com.app;

import com.app.controllers.AuthController;
import com.app.models.ERole;
import com.app.models.Role;
import com.app.models.Structure;
import com.app.models.User;
import com.app.repository.RoleRepository;
import com.app.repository.StructureRepository;
import com.app.repository.UserRepository;
import com.app.security.services.RoleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class Cni9Application {

	PasswordEncoder encoder;

	public Cni9Application(PasswordEncoder encoder) {
		this.encoder = encoder;
	}

	public static void main(String[] args) {
		SpringApplication.run(Cni9Application.class, args);
	}

	@Bean
	public CorsFilter corsFilter(){
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200", "http://localhost:4201"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type", "Accept",
				"Authorization", "Origin, Accept", "X-Requested-With", "Access-Control-Request-Method", "Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origine", "Content-Type", "Accept", "Authorization", "Access-Control-Allow-Origin",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}

	@Bean
	CommandLineRunner run(RoleRepository roleRepository, UserRepository userRepository, RoleService roleService, StructureRepository structureRepository){
		return args -> {
			//roleRepository.save(new Role(ERole.ROLE_USER));
			//roleRepository.save(new Role(ERole.ROLE_ADMIN));
			//structureRepository.save(new Structure("001", "ministere d'interieur", null));
			//structureRepository.save(new Structure("002", "ministere d'education", null));
			//structureRepository.save(new Structure("003", "ministère de l'agriculture", null));
			//structureRepository.save(new Structure("004", "ministère de la santé", null));
			//structureRepository.save(new Structure("005", "ministère de la justice", null));
			//structureRepository.save(new Structure("006", "ministère de la femme", null));
			//structureRepository.save(new Structure("007", "ministère de la jeunesse et des sports", null));
			//structureRepository.save(new Structure("008", "ministere des finances", null));
			//structureRepository.save(new Structure("009", "ministere de commerce", null));
			//structureRepository.save(new Structure("010", "ministere de l enseignement superieur", null));
			//User u = new User();
			//u.setEmail("maial3@gmail.com");
			//u.setUsername("user1");
			//u.setPassword(this.encoder.encode("00000000"));
			//userRepository.save(u);
			//roleService.addRoleToUser(ERole.ROLE_ADMIN, 1);

			// uncomment all the lines from line 56 to line 73 and run the project ... after that uncomment the lines and run the application again;

		};
	}
}
