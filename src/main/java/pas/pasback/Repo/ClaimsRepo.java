package pas.pasback.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pas.pasback.Model.Claims;

@Repository
public interface ClaimsRepo extends JpaRepository<Claims, Integer> {

}
