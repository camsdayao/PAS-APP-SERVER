package pas.pasback.Configuration;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pas.pasback.Model.Claims;
import pas.pasback.Model.Customer;
import pas.pasback.Model.Policy;
import pas.pasback.Model.PolicyHolder;
import pas.pasback.Model.Vehicle;
import pas.pasback.Repo.ClaimsRepo;
// import pas.pasback.Repo.ClaimsRepo;
import pas.pasback.Repo.CustomerRepo;
import pas.pasback.Repo.PolicyHolderRepo;
import pas.pasback.Repo.PolicyRepo;
import pas.pasback.Repo.VehicleRepo;

@Configuration
public class CustomerConfig {

        @Bean
        CommandLineRunner commandLineRunner(CustomerRepo customerRepo, PolicyRepo policyRepo,
                        PolicyHolderRepo pHolderRepo, VehicleRepo vehicleRepo, ClaimsRepo claimsRepo) {
                return args -> {
                        Customer cams = new Customer(
                                        1, "Cams", "Dayao", "cabuyao", "1233");
                        customerRepo.save(cams);
                        Policy pol = new Policy(
                                        1, "231311", "10-10-2022", "03-10-2023");
                        policyRepo.save(pol);
                        PolicyHolder holder = new PolicyHolder(
                                        1, "Camille", "Dayao", "Cabuyao", "897DCSA", "2020-10-10");
                        pHolderRepo.save(holder);
                        Vehicle vehicle = new Vehicle(
                                        1, "Honda", "Civic", "Black", "Gasoline", "4-door Sedan", "2022", 100.121);
                        vehicleRepo.save(vehicle);
                        Claims claims = new Claims(
                                        1, "C00102", "2022-10-10", "Front Damge", "Bumper", 109.99);
                        claimsRepo.save(claims);

                };
        }

}
