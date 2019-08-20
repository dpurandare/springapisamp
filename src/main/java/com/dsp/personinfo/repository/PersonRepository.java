package com.dsp.personinfo.repository;

import com.dsp.personinfo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Deepak on 8/17/19.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}
