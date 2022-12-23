package com.example.websocketi.service;

import com.example.websocketi.model.Mona;
import com.example.websocketi.repository.MonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MonaService {

    @Autowired
    private MonaRepository monaRepository;

    public List<Mona> getAll() {
        return monaRepository.getAll();
    }

    public Optional<Mona> getMona(int idMona) {
        return monaRepository.getMona(idMona);
    }

    public List<Mona> getMonas(String team) {
        return monaRepository.getMonas(team);
    }

    public Mona save(Mona mona) {
        if (mona.getIdMessage() == null) {
            return monaRepository.save(mona);
        } else {
            Optional<Mona> e = monaRepository.getMona(mona.getIdMessage());
            if (!e.isPresent()) {
                return monaRepository.save(mona);
            } else {
                return mona;
            }
        }
    }

    public Mona update(Mona client) {
        if (client.getIdMessage() != null) {
            Optional<Mona> e = monaRepository.getMona(client.getIdMessage());
            if (e.isPresent()) {

                monaRepository.save(e.get());
                return e.get();
            } else {
                return client;
            }
        } else {
            return client;
        }
    }

    public boolean deleteClient(int messageId) {
        Boolean aBoolean = getMona(messageId).map(message -> {
            monaRepository.delete(message);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
