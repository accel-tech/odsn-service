package heritage.africa.odsn_service.service;

import heritage.africa.odsn_service.entity.Plainte;
import heritage.africa.odsn_service.repository.PlainteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlainteService {

    @Autowired
    private PlainteRepository plainteRepository;

    public Plainte createPlainte(Plainte plainte){

        plainte.setStatut("En cours de traitement");
        plainte.setPriorite("Critique");
        plainte.setCategorie("Fraude");
        return plainteRepository.save(plainte);
    }





    public List<Plainte> getPlaintes(){

        return plainteRepository.findAll();
    }
}
