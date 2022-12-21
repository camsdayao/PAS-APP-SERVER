package pas.pasback.Controller;

import java.security.cert.PolicyQualifierInfo;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Data;
import pas.pasback.Model.Claims;
import pas.pasback.Model.Customer;
import pas.pasback.Model.Policy;
import pas.pasback.Model.PolicyHolder;
import pas.pasback.Model.Vehicle;
import pas.pasback.Service.CustomerService;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin
// @RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping(path = "/customer")
    public List<Customer> getCustomer() {
        return customerService.getCustomer();
    }

    @GetMapping(path = "/customer/{accountNum}")
    public String getAccountNum(@PathVariable("accountNum") String accountNum) {
        return customerService.getAccountNum(accountNum);
    }

    @PostMapping(path = "/addcustomer")
    public ResponseEntity<Customer> newCustomer(@RequestBody Customer customer) {
        Customer responseCustomer = customerService.addCustomer(customer);
        return ResponseEntity.ok().body(responseCustomer);
    }

    @GetMapping(path = "/policy")
    public List<Policy> getPolicy() {
        return customerService.getPolicy();
    }

    @PostMapping(path = "/addpolicy")
    public ResponseEntity<Policy> newPolicy(@RequestBody AddPolicyForm form) {
        
        // form.getPolicy());
        // System.out.println(form.getPolicy().getEffectDate());
        Policy receivedPolicy = new Policy(form.getEffectDate(), form.getExpiDate());

        Policy responsePolicy = customerService.addPolicy(form.getAccountNum(),receivedPolicy);
        return ResponseEntity.ok().body(responsePolicy);
    }

    @GetMapping(path = "/polholder")
    public List<PolicyHolder> getPolHolder() {
        return customerService.getPolicyHolder();
    }

    @PostMapping(path = "/addpolholder")
    public ResponseEntity<PolicyHolder> newPolicyHolder(@RequestBody PolicyHolder polholder) {
        PolicyHolder responsePolHolder = customerService.addPolicyHolder(polholder);
        return ResponseEntity.ok().body(responsePolHolder);
    }

    @GetMapping(path = "/vehicle")
    public List<Vehicle> getVehicles() {
        return customerService.getVehicle();
    }

    @PostMapping(path = "/addvehicle")
    public ResponseEntity<Vehicle> newVehicle(@RequestBody Vehicle vehicle) {
        Vehicle responseVehicle = customerService.addVehicle(vehicle);
        return ResponseEntity.ok().body(responseVehicle);
    }

    @GetMapping(path = "/claims")
    public List<Claims> getClaims() {
        return customerService.getClaims();
    }

    // @GetMapping(path = "/claims")
    // public List<Claims> getClaims() {
    // return customerService.getClaims();
    // }

    // @PostMapping(path = "/addclaims")
    // public ResponseEntity<Claims> newClaims(@RequestBody Claims claims) {
    // Claims responseClaims = customerService.addClaims(claims);
    // return ResponseEntity.ok().body(responseClaims);
    // }

}

@Data
class AddPolicyForm {
    private String accountNum;
    private String effectDate;
    private String expiDate;
}
