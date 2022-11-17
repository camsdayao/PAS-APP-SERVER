package pas.pasback.Service;

import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import pas.pasback.Model.Customer;
import pas.pasback.Model.Policy;
import pas.pasback.Repo.CustomerRepo;
import pas.pasback.Repo.PolicyRepo;

@Service
public class CustomerService {

    private final CustomerRepo customerRepo;
    private final PolicyRepo policyRepo;

    public CustomerService(CustomerRepo customerRepo, PolicyRepo policyRepo) {
        this.customerRepo = customerRepo;
        this.policyRepo = policyRepo;
    }

    public List<Customer> getCustomer() {
        return customerRepo.findAll();

    }

    public List<Policy> getPolicy() {
        return policyRepo.findAll();
    }

    public Customer addCustomer(Customer customer) {
        Random rand = new Random();
        String accountNum = (String.format("%04d", rand.nextInt(10000)));
        customer.setAccountNum(accountNum);
        customerRepo.save(customer);
        return customerRepo.findByAccountNum(accountNum);
    }

    public void addPolicy(Policy policy) {
        policyRepo.save(policy);
    }

}
