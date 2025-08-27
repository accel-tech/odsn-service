package heritage.africa.odsn_service.controller;


import heritage.africa.odsn_service.entity.Plainte;
import heritage.africa.odsn_service.repository.PlainteRepository;
import heritage.africa.odsn_service.service.PlainteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/odsn/plaintes")
@CrossOrigin("*")
public class PlainteController {

    @Autowired
    private PlainteService plainteService;




    @PostMapping
    public  Plainte ceatePlainte(@RequestBody Plainte plainte){

        return plainteService.createPlainte(plainte);

    }

    @GetMapping
    public  List<Plainte> getPlainte(){

        return plainteService.getPlaintes();

    }




//    @GetMapping("/filter")
//    public List<Plainte> filtrerPlaintes(
//            @RequestParam(required = false) String region,
//            @RequestParam(required = false) String urgence,
//            @RequestParam(required = false) String plaignant) {
//        return plainteService.filtrerPlaintes(region, urgence, plaignant);
//
//    }





}
