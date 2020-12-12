package com.redsocial.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.redsocial.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer> {

	@Query("Select c from curso c where c.nombre like :var_fil")
	public List<Curso> listaPorNombre(@Param("var_fil") String filtro);
	
	
}
