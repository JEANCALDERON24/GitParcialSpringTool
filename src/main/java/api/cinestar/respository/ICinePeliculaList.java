package api.cinestar.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import api.cinestar.model.CinePeliculaList;

@Repository
public interface ICinePeliculaList extends JpaRepository<CinePeliculaList, Integer>{
@Query (value = "{call sp_getCinePeliculas(:id)}", nativeQuery = true)
List<CinePeliculaList> getCinePeliculaList(int id);  
}
