package pas.pasback.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pas.pasback.Model.Customer;
import pas.pasback.Model.Policy;
import pas.pasback.Service.CustomerService;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/customer")
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @GetMapping(path = "/policy")
    public List<Policy> getPolicy() {
        return customerService.getPolicy();
    }

    @PostMapping(path = "/addcustomer")
    public ResponseEntity<Customer> newCustomer(@RequestBody Customer customer) {
        Customer responseCustomer = customerService.addCustomer(customer);
        return ResponseEntity.ok().body(responseCustomer);
    }

    @PostMapping(path = "/addpolicy")
    public void newPolicy(@RequestBody Policy policy) {
        customerService.addPolicy(policy);
    }

}
