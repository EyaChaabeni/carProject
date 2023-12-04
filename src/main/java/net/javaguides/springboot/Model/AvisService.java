package net.javaguides.springboot.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.Repository.AvisRepository;

import java.util.List;

@Service
public class AvisService {

    @Autowired
    private AvisRepository avisRepository;

    public List<Avis> getAllAvis() {
        return avisRepository.findAll();
    }

    public Avis getAvisById(Long id) {
        return avisRepository.findById(id).orElse(null);
    }

    public void saveAvis(Avis avis) {
        avisRepository.save(avis);
    }

    public void deleteAvis(Long id) {
        avisRepository.deleteById(id);
    }
}
