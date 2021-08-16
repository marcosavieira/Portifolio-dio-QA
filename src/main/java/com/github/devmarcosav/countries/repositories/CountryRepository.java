package com.github.devmarcosav.countries.repositories;

import com.github.devmarcosav.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
