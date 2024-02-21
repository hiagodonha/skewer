package com.donha.skewer.dao;

import com.donha.skewer.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<Client, Long> {
}
