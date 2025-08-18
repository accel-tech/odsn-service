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

        return plainteRepository.save(plainte);
    }



//    public List<Plainte> filtrerPlaintes(String statut, String priorite, String categorie, String region,
//                                         String urgence, String canal, String type, String recherche) {
//        return plainteRepository.filtrer(statut, priorite, categorie, region, urgence, canal, type);
//    }


    public List<Plainte> filtrerPlaintes(String region, String urgence, String plaignant) {
        return plainteRepository.filtrerIgnoreCase(region, urgence, plaignant);
    }

    public List<Plainte> getPlaintes(){

        return plainteRepository.findAll();
    }
}
