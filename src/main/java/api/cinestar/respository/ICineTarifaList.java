package api.cinestar.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.cinestar.model.CineTarifaList;

@Repository
public interface ICineTarifaList extends JpaRepository<CineTarifaList, Integer>{
@Query (value = "{call sp_getCineTarifas(:id)}", nativeQuery = true)
List<CineTarifaList> getCineTarifaList(int id);
}
