package backend.experimentoocrjava.Controllers;

import backend.experimentoocrjava.Error.ResourceNotFoundException;
import backend.experimentoocrjava.Models.Usuarios;
import backend.experimentoocrjava.Models.repository.UsuarioRepository;
import backend.experimentoocrjava.Models.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("usuarios")
public class UsuarioController {

    private final UsuarioRepository usuariosDAO;

    @Autowired
    public UsuarioController(UsuarioRepository usuariosDAO) {
        this.usuariosDAO = usuariosDAO;
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> listarTodas() {
        return new ResponseEntity<>(usuariosDAO.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getUsuarioById(@PathVariable("id") Long id) {
        verificarSeUsuarioExiste(id);
        Optional<Usuarios> usuario = usuariosDAO.findById(id);
        return new ResponseEntity<>(usuario,HttpStatus.OK);
    }
      
    @PostMapping
    public ResponseEntity<?> saveUsuario(@RequestBody Usuarios usuario) {
        return new ResponseEntity<>(usuariosDAO.save(usuario),HttpStatus.OK);
    }
    
    @DeleteMapping
    public ResponseEntity<?> deleteUsuario(@RequestBody Usuarios usuario) {
        verificarSeUsuarioExiste(usuario.getId());
        usuariosDAO.delete(usuario);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateUsuario(@RequestBody Usuarios usuario) {
        verificarSeUsuarioExiste(usuario.getId());
        usuariosDAO.save(usuario);
        return new ResponseEntity<>(usuario,HttpStatus.OK);
    }

    private void verificarSeUsuarioExiste(Long id){
        if(usuariosDAO.findById(id) == null)
            throw new ResourceNotFoundException("Usuario não encontrada para o ID:" + id);
    }
}