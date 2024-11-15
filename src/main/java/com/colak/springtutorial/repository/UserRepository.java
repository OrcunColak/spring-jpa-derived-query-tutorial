package com.colak.springtutorial.repository;

import com.colak.springtutorial.jpa.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    // Find by equal examples
    List<User> findByFirstName(String firstName);

    List<User> findByCity(String city);

    // Find by condition examples
    List<User> findByBirthDateBefore(LocalDate date);
    List<User> findByBirthDateAfter(LocalDate date);
    List<User> findByFirstNameStartingWith(String prefix);
    List<User> findByCityContaining(String fragment);

    // Find by with boolean logic examples
    List<User> findByFirstNameAndCity(String firstName, String city);
    List<User> findByFirstNameStartingWithAndBirthDateAfter(String prefix, LocalDate date);

    // Count examples
    long countByCity(String city);

    boolean existsByFirstName(String firstName);

    void deleteByCity(String city);
}
