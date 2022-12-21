package pas.pasback.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import pas.pasback.Model.Claims;
import pas.pasback.Model.Customer;
import pas.pasback.Model.Policy;
import pas.pasback.Model.PolicyHolder;
import pas.pasback.Model.Vehicle;
import pas.pasback.Repo.ClaimsRepo;
import pas.pasback.Repo.CustomerRepo;
import pas.pasback.Repo.PolicyHolderRepo;
import pas.pasback.Repo.PolicyRepo;
import pas.pasback.Repo.VehicleRepo;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;
    private final PolicyRepo policyRepo;
    private final PolicyHolderRepo pHolderRepo;
    private final VehicleRepo vehicleRepo;
    private final ClaimsRepo claimsRepo;

    public CustomerService(CustomerRepo customerRepo, PolicyRepo policyRepo, PolicyHolderRepo pHolderRepo,
            VehicleRepo vehicleRepo, ClaimsRepo claimsRepo) {
        this.customerRepo = customerRepo;
        this.policyRepo = policyRepo;
        this.pHolderRepo = pHolderRepo;
        this.vehicleRepo = vehicleRepo;
        this.claimsRepo = claimsRepo;
    }

    public List<Customer> getCustomer() {
        return customerRepo.findAll();

    }

    public List<Policy> getPolicy() {
        return policyRepo.findAll();
    }

    public List<PolicyHolder> getPolicyHolder() {
        return pHolderRepo.findAll();
    }

    public List<Vehicle> getVehicle() {
        return vehicleRepo.findAll();
    }

    public List<Claims> getClaims() {
        return claimsRepo.findAll();
    }

    public String getAccountNum(String accountNum) {
        Optional<Customer> customerOptional = customerRepo.findByAccountNum(accountNum);
        if (customerOptional.isPresent()) {
            return customerOptional.get().getAccountNum();
        } else {
            throw new IllegalStateException("Account Number is not Existing");
        }
    }

    public Customer addCustomer(Customer customer) {
        Random rand = new Random();
        String accountNum = (String.format("%04d", rand.nextInt(10000)));
        customer.setAccountNum(accountNum);
        customerRepo.save(customer);
        return customerRepo.findByAccountNum(accountNum).get();
    }

    @Transactional
    public Policy addPolicy(String accountNum, Policy policy) {
        // System.out.println(policy.getEffectDate() +
        // "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        Random rand = new Random();
        Optional<Customer> customerFromrepo = customerRepo.findByAccountNum(accountNum);
        // System.out.println(customerFromrepo.get().getAccountNum() +
        // "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        if (customerFromrepo.isPresent()) {
            String polNum = (String.format("%06d", rand.nextInt(1000000)));
            policy.setPolNum(polNum);

            customerFromrepo.get().getPolicy().add(policy);

            return policyRepo.findByPolNum(polNum).get();

        }

        throw new IllegalStateException("Account Number Not Exist");

    }

    public PolicyHolder addPolicyHolder(@RequestBody PolicyHolder polHolder) {
        return pHolderRepo.save(polHolder);
    }

    public Vehicle addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleRepo.save(vehicle);
    }

    // public Claims addClaims(@RequestBody Claims claims) {
    // return claimsRepo.save(claims);
    // }

}
