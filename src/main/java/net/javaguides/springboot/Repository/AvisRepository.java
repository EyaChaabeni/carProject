package net.javaguides.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.Model.Avis;

public interface AvisRepository extends JpaRepository<Avis, Long> {
}