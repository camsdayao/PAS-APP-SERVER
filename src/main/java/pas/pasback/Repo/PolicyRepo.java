package pas.pasback.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pas.pasback.Model.Policy;

public interface PolicyRepo extends JpaRepository<Policy, Integer> {

}
