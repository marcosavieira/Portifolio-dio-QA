package com.github.devmarcosav.staties.repositories;

import com.github.devmarcosav.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
