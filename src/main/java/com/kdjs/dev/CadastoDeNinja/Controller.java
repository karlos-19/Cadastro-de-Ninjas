package com.kdjs.dev.CadastoDeNinja;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping
public class Controller {

    @GetMapping("/PrimeroRunDoPrograma")
    public String run(){
        return "Rodando pela primeira vez, o programa";
    }
}
