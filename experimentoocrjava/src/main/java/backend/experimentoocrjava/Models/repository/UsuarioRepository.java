package backend.experimentoocrjava.Models.repository;

import backend.experimentoocrjava.Models.Usuarios;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuarios,Long>{
}