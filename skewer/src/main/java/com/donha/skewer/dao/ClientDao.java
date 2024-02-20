package com.donha.skewer.dao;

import com.donha.skewer.models.First;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientDao extends JpaRepository<First, Long> {
}
