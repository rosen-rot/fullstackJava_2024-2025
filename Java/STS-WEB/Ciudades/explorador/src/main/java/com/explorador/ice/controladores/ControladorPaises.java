package com.explorador.ice.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.HashMap;

@Controller
public class ControladorPaises {

    private static HashMap<String, String> listaPaises = new HashMap<>();

    // Constructor que llena la lista de países
    public ControladorPaises() {
        listaPaises.put("México", "Ciudad de México");
        listaPaises.put("Paraguay", "Asunción");
        listaPaises.put("Perú", "Lima");
        listaPaises.put("Costa Rica", "San José");
        listaPaises.put("Chile", "Santiago");
    }

    // Método que envía la lista de países al JSP
    @GetMapping("/paises")
    public String obtenerTodosLosPaises(Model model) {
        model.addAttribute("paises", listaPaises);
        return "paises.jsp";  // Redirige a paises.jsp
    }

    // Método que obtiene la capital de un país específico
    @GetMapping("/paises/{pais}")
    public String obtenerCapital(@PathVariable String pais, Model model) {
        if (listaPaises.containsKey(pais)) {
            model.addAttribute("pais", pais);
            model.addAttribute("capital", listaPaises.get(pais));
        } else {
            model.addAttribute("mensaje", "País no encontrado");
        }
        return "capitales.jsp";  // Redirige a capitales.jsp
    }
}
