/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package due.gruppo.Crudcondbserver.controller;

import due.gruppo.Crudcondbserver.dto.ListaProdottiDto;
import due.gruppo.Crudcondbserver.dto.ProdottoDto;
import due.gruppo.Crudcondbserver.dto.CriterioDiRicercaDto;
import due.gruppo.Crudcondbserver.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class CrudController {

    @Autowired
    CrudService crudService;

    @RequestMapping("/rimuovi")
    @ResponseBody
    public ListaProdottiDto rimuoviProdotto(@RequestBody ProdottoDto dto) {
        return crudService.rimuovi(dto.getProdotto());
    }

    @RequestMapping("/conferma")
    @ResponseBody
    public ListaProdottiDto confermaProdotto(@RequestBody ProdottoDto dto) {
        return crudService.conferma(dto.getProdotto());
    }

    @RequestMapping("/cerca")
    @ResponseBody
    public ListaProdottiDto cercaProdotto(@RequestBody CriterioDiRicercaDto dto) {
        return crudService.cerca(dto.getCriterio());

    }

    @RequestMapping("/aggiorna-lista")
    @ResponseBody
    public ListaProdottiDto aggiornaListaProdotti() {
        return crudService.aggiornaLista();
    }
}
