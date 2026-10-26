package com.fernandoancioto.projetomvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController{

    @GetMapping("/")
    public String index(Model model){
        model.addAttribute(
                "Nome do sistema",
                "Locadora DriveNow"
        );
        model.addAttribute(
                "mensagemBoasVindas",
                "Gestão de frota e locações!"
        );

        return "index"; // -> templates/index.html
    }
}
