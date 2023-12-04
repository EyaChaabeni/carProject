package net.javaguides.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import net.javaguides.springboot.Model.Avis;
import net.javaguides.springboot.Model.AvisService;

import java.util.List;

@RestController
@RequestMapping("/api/avis")
public class AvisController {

    @Autowired
    private AvisService avisService;

    @GetMapping
    public List<Avis> getAllAvis() {
        return avisService.getAllAvis();
    }

    @GetMapping("/{id}")
    public Avis getAvisById(@PathVariable Long id) {
        return avisService.getAvisById(id);
    }

    @PostMapping
    public void saveAvis(@RequestBody Avis avis) {
        avisService.saveAvis(avis);
    }

    @PutMapping("/{id}")
    public void updateAvis(@PathVariable Long id, @RequestBody Avis updatedAvis) {
        Avis existingAvis = avisService.getAvisById(id);
        if (existingAvis != null) {
            existingAvis.setNote(updatedAvis.getNote());
            existingAvis.setContenu(updatedAvis.getContenu());
            existingAvis.setId_user(updatedAvis.getId_user());
            avisService.saveAvis(existingAvis);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteAvis(@PathVariable Long id) {
        avisService.deleteAvis(id);
    }
}

