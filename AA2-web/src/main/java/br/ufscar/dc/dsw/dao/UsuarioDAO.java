package br.ufscar.dc.dsw.dao;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.ufscar.dc.dsw.domain.Profissional;
import br.ufscar.dc.dsw.domain.Usuario;

@SuppressWarnings("unchecked")
public interface UsuarioDAO extends CrudRepository<Usuario, Long>{

	Usuario findById(long id);
	
	Usuario findByEmail(String email);

	List<Usuario> findAll();
		
	Usuario save(Usuario usuario);
		
	void deleteById(Long id);
		
    @Query("SELECT u FROM Usuario u WHERE u.email = :email")
    public Usuario getUsuarioByEmail(@Param("email") String email);
	    
}
