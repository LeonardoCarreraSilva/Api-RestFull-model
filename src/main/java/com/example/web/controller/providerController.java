package com.example.web.controller;

import com.example.repository.providerRepository;
import com.example.web.domain.models.tb_fornecedor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/provider")
@RestController
public class providerController {

    @Autowired
    private providerRepository providerRepository;

    @GetMapping
    public List findAll(){
        return providerRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity findById(@PathVariable Integer id) {
        return providerRepository.findById(id)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public tb_fornecedor create(@RequestBody tb_fornecedor tbFornecedores) {
        return providerRepository.save(tbFornecedores);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity upDate(@PathVariable("id") Integer id, @RequestBody tb_fornecedor tbFornecedores) {
        return providerRepository.findById(id).map(record ->{
            record.setNome(tbFornecedores.getNome());
            record.setCnpj(tbFornecedores.getCnpj());
            record.setEmail(tbFornecedores.getEmail());
            record.setTelefone(tbFornecedores.getTelefone());
            record.setCelular(tbFornecedores.getCelular());
            record.setEndereco(tbFornecedores.getEndereco());
            record.setNumero(tbFornecedores.getNumero());
            record.setComplemento(tbFornecedores.getComplemento());
            record.setBairro(tbFornecedores.getBairro());
            record.setCidade(tbFornecedores.getCidade());
            record.setEstado(tbFornecedores.getEstado());
            tb_fornecedor upDated = providerRepository.save(record);
            return ResponseEntity.ok().body(upDated);
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return providerRepository.findById(id)
                .map(record -> {
                    providerRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }

}
