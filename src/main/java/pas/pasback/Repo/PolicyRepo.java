package pas.pasback.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pas.pasback.Model.Policy;

@Repository
public interface PolicyRepo extends JpaRepository<Policy, Integer> {
    Optional<Policy> findByPolNum(String polNum);
}
