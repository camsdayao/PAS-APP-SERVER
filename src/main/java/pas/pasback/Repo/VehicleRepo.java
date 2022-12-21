package pas.pasback.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pas.pasback.Model.Vehicle;

@Repository
public interface VehicleRepo extends JpaRepository<Vehicle, Integer> {

}
