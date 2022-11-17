package pas.pasback.Configuration;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pas.pasback.Model.Customer;
import pas.pasback.Repo.CustomerRepo;
import pas.pasback.Repo.PolicyRepo;

@Configuration
public class CustomerConfig {

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepo customerRepo, PolicyRepo policyRepo) {
        return args -> {
            Customer cams = new Customer(
                    1, "Cams", "Dayao", "cabuyao", "1233");
            customerRepo.save(cams);

            // Policy sample = new Policy(
            // 1, LocalDate.of(2022, Month.JANUARY, 28), "Camille Dayao", "Vehicle");

            // policyRepo.saveAll(List.of(sample));

        };

    }

}
