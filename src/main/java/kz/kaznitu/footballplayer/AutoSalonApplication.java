package kz.kaznitu.footballplayer;

import kz.kaznitu.footballplayer.models.Admin;
import kz.kaznitu.footballplayer.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AutoSalonApplication implements CommandLineRunner {

	@Autowired
	AdminRepository adminRepository;

	public static void main(String[] args) {
		SpringApplication.run(AutoSalonApplication.class, args);
	}

	@Override
	public void run(String... strings) throws Exception{

		/*Admin admin1 = new Admin();
		admin1.setFullName("63000$");
		admin1.setCost("Mercedes-Benz GLE 6.3 AMG");

		Admin admin2 = new Admin();
		admin2.setFullName("50500$");
		admin2.setCost("Toyota Camry");

		adminRepository.save(admin1);
		adminRepository.save(admin2); */
	}
}
