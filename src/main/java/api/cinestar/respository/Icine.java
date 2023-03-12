package api.cinestar.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.cinestar.model.Cine;

@Repository
public interface Icine extends JpaRepository<Cine, Integer> {
	@Query (value = "{call sp_getCine(:id)}", nativeQuery = true)
	Cine getCine(int id);

}
