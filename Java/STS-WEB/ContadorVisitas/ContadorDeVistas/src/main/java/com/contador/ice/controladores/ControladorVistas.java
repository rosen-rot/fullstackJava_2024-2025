package com.contador.ice.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class ControladorVistas {

	@GetMapping("/visitas")
	public String visitas(HttpSession sesion, Model model) {
		Integer numVisitas = (Integer) sesion.getAttribute("numVisitas");
		if(numVisitas == null) {
			numVisitas = 1;
		}else {
			numVisitas++;
		}
		
		sesion.setAttribute("numVisitas", numVisitas);
		model.addAttribute("numVisitas", numVisitas);
		
		return "visitas";
	}
	
	@PostMapping("/visitas/agregar")
	public String agregaVisitaManualmente(HttpSession sesion) {
		Integer numVisitas = (Integer) sesion.getAttribute("numVisitas");
        if (numVisitas == null) {
            numVisitas = 1;
        } else {
        	numVisitas++;
        }
        sesion.setAttribute("numVisitas", numVisitas);
		return "redirect:/visitas";
	}
}
