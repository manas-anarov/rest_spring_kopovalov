package com.appsdevelopersblog.app.ws.mobileapp.ws.repository;


import com.appsdevelopersblog.app.ws.mobileapp.ws.model.UserRest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;



@Component
public interface UserJpaRespository extends JpaRepository<UserRest, Long> {

    UserRest findByFirstName(String FirstName);
}
