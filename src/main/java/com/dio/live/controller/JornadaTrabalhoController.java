package com.dio.live.controller;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepository;
import com.dio.live.service.JornadaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/jornada") // encontrar endpoint
public class JornadaTrabalhoController {

    JornadaService jornadaService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return jornadaService.findAll();
    }

    @GetMapping("/{idJornada}")
//    public JornadaTrabalho getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception {
//        return jornadaService.getById(idJornada).orElseThrow(() ->  new Exception("jornada não encontrada"));
//    }

    public ResponseEntity<JornadaTrabalho> getJornadaByID(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaService.getById(idJornada).orElseThrow(() ->  new Exception("jornada não encontrada")));
    }

}

