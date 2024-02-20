package com.donha.skewer.service;

import com.donha.skewer.models.Client;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Service
public class ClientService {

    private static final Logger LOGGER  = Logger.getLogger(ClientService.class.getName());

    public Client create(Client client) {
        LOGGER.info("creat Client!");
        return Client.builder().name("DINO").build();
    }

    public List<Client> findAll() {
        LOGGER.info("Finding all clients!");

        var clients = new ArrayList<Client>();
        for (int i = 0; i < 8; i++) {
            var person = mockPerson(i);
            clients.add(person);
        }

        return clients;
    }

    private Client mockPerson(int i) {
        return Client.builder()
                .name("Hiago" + i)
                .cpfCnpj("04695965411" + i)
                .adress("vila" + i)
                .email("hiago@gmail.com" + i)
                .phone("6282156587" + i)
                .build();
    }


    public Client findById(Long id) {
        LOGGER.info("Finding one client!");

        return Client.builder()
                .name("Rodrigao")
                .email("teste@gmail.com")
                .phone("62982527601")
                .cpfCnpj("04699592101")
                .build();
    }
}
