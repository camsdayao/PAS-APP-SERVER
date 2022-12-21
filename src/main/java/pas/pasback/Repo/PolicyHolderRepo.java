package pas.pasback.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pas.pasback.Model.PolicyHolder;

@Repository
public interface PolicyHolderRepo extends JpaRepository<PolicyHolder, Integer> {
}
