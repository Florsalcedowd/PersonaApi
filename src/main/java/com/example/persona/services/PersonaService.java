package com.example.persona.services;

import com.example.persona.entities.Persona;

import java.util.List;

public interface PersonaService extends BaseService<Persona, Long> {
    List<Persona> search(String filtro) throws Exception;
}
