package pl.mpas.myspringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping({"/", "/home"})
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/me")
    public String me(Model model){
        model.addAttribute("name", "Jarek");
        model.addAttribute("surname", "K.");


        return "me";
    }

    @GetMapping("/car")
    public String myFavoriteCar(Model model){
        model.addAttribute("brand", "FSO");
        model.addAttribute("names","Warszawa");
        return "car";
    }
}
