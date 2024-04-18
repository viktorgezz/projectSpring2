package ru.viktorgezz.springproject.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.viktorgezz.springproject.model.People;

@Repository
public interface PeopleRepository extends JpaRepository<People, Integer> {

}
