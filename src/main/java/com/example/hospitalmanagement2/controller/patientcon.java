package com.example.hospitalmanagement2.controller;

import com.example.hospitalmanagement2.entiy.patient;
import com.example.hospitalmanagement2.service.patientser;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
@RequiredArgsConstructor
public class patientcon {
    private final patientser con;

    @GetMapping("/getall")
    public List<patient>getAll(){
        return con.getAll();

    }
    @GetMapping("/getById/{id}")
    public patient getById(@PathVariable Long id){
        return con.getById(id);
    }
    @PostMapping("/add")
    public patient add(@RequestBody patient data){
        return con.add(data);
    }
    @PutMapping("/update")
    public patient update(@RequestBody patient new_data,@PathVariable Long id){
        return con.update(id,new_data);
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable Long id){
        con.delete(id);
    }


}