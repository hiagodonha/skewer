package com.donha.skewer.dao;

import com.donha.skewer.models.First;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FirstDao extends JpaRepository<First, Long> {
}
