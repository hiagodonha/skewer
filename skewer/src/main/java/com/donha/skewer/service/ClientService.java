package com.donha.skewer.service;

import com.donha.skewer.dao.ClientDao;
import com.donha.skewer.exceptions.ResourceNotFoundException;
import com.donha.skewer.models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

@Service
public class ClientService {

    @Autowired
    ClientDao dao;

    private static final Logger LOGGER  = Logger.getLogger(ClientService.class.getName());

    public Client create(Client client) {
        LOGGER.info("creat Client!");
        return dao.save(client);
    }

    public List<Client> findAll() {
        LOGGER.info("Finding all clients!");
        return dao.findAll();
    }


    public Client findById(Long id) {
        LOGGER.info("Finding one client!");
        return dao.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found!"));
    }

    public Client update(Client client) {
        LOGGER.info("Updated Client!");

        var entity = dao.findById(client.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found!"));

        client = entity;

        return dao.save(client);
    }

    public void delete(Long id) {
        LOGGER.info("Deleted Client!");

        dao.deleteById(id);
    }

}
