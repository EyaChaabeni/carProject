package net.javaguides.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.Model.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long>{

}
