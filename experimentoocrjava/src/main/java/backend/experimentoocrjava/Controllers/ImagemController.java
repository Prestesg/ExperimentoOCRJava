package backend.experimentoocrjava.Controllers;

import backend.experimentoocrjava.Error.ResourceNotFoundException;
import backend.experimentoocrjava.Models.Imagens;
import backend.experimentoocrjava.Models.ImagensTexto;
import backend.experimentoocrjava.Models.repository.ImagensRepository;
import backend.experimentoocrjava.Models.repository.ImagensTextoRepository;

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
@RequestMapping("imagens")
public class ImagemController {

    private final ImagensRepository imagemDAO;

    @Autowired
    public ImagemController(ImagensRepository imagemDAO,ImagensTextoRepository imagem_textoDAO) {
        this.imagemDAO = imagemDAO;
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> listarTodas() {
        return new ResponseEntity<>(imagemDAO.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getImagemById(@PathVariable("id") Long id) {
        verificarSeImagemExiste(id);
        Optional<Imagens> imagem = imagemDAO.findById(id);
        return new ResponseEntity<>(imagem,HttpStatus.OK);
    }
      
    @PostMapping
    public ResponseEntity<?> saveImagem(@RequestBody Imagens imagem) {
        return new ResponseEntity<>(imagemDAO.save(imagem),HttpStatus.OK);
    }
    
    @DeleteMapping
    public ResponseEntity<?> deleteImagem(@RequestBody Imagens imagem) {
        verificarSeImagemExiste(imagem.getId());
        imagemDAO.delete(imagem);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> updateImagem(@RequestBody Imagens imagem) {
        verificarSeImagemExiste(imagem.getId());
        imagemDAO.save(imagem);
        return new ResponseEntity<>(imagem,HttpStatus.OK);
    }

    private void verificarSeImagemExiste(Long id){
        if(imagemDAO.findById(id) == null)
            throw new ResourceNotFoundException("Imagem não encontrada para o ID:" + id);
    }
}