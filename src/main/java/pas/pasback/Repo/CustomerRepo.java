package pas.pasback.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pas.pasback.Model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
    Customer findByAccountNum(String accountNum);
}
