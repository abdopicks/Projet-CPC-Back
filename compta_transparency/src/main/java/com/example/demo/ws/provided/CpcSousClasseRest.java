package com.example.demo.ws.provided;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.CpcSousClasse;
import com.example.demo.service.facade.CpcSousClasseService;

@RestController
@RequestMapping("/ProjetCpc/CpcSousClasse")
@CrossOrigin(origins = { "http://localhost:4200" })
public class CpcSousClasseRest {

	@Autowired
	private CpcSousClasseService cpcSousClasseService;

    @PostMapping("/")
    public CpcSousClasse save(@RequestBody CpcSousClasse cpcSousClasse) {
        return cpcSousClasseService.save(cpcSousClasse);
    }

    @DeleteMapping("/id/{id}")
    public void deleteById(@PathVariable Long id) {
        cpcSousClasseService.deleteById(id);
    }

    @GetMapping("/")
    public List<CpcSousClasse> findAll() {
        return cpcSousClasseService.findAll();
    }

}