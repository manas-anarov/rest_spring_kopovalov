package com.appsdevelopersblog.app.ws.mobileapp.ws.controllers;


import com.appsdevelopersblog.app.ws.mobileapp.ws.model.UserRest;
import com.appsdevelopersblog.app.ws.mobileapp.ws.repository.UserJpaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserJpaRespository userJpaRespository;



    /**
     * Used to fetch all the users from DB
     *
     * @return list of {@link UserRest}
     */
    @GetMapping(value = "/all")
    public List<UserRest> findAll() {
        return userJpaRespository.findAll();
    }


    /**
     * Used to find and return a user by name
     *
     * @param name refers to the name of the user
     * @return {@link UserRest} object
     */
    @GetMapping(value = "/{name}")
    public UserRest findByName(@PathVariable final String name){
        return userJpaRespository.findByFirstName(name);
    }


    @PutMapping(value = "/{name}")
    public UserRest editByName(@PathVariable final String name, @RequestBody final UserRest users){
        UserRest user  = userJpaRespository.findByFirstName(name);
        user.setEmail(users.getEmail());
        user.setFirstName(users.getFirstName());
        user.setLastName(users.getLastName());
        userJpaRespository.save(user);
        return userJpaRespository.findByFirstName(name);
    }



//    @GetMapping
//    public String getUsers(@RequestParam(value="page") int page,
//                           @RequestParam(value="limit") int limit){
//        return "User page " + page +" Limit " +limit;
//    }


//    @GetMapping (path = "/{userId}")
//    public ResponseEntity<UserRest> getUser(@PathVariable String userId){
//
//        UserRest userModel = new UserRest();
//        userModel.setEmail("sadasd");
//        userModel.setFirstName("Sergey");
//        userModel.setLastName("Kargopolov");
//
////        return "User id" + userId;
//        return new ResponseEntity<UserRest>(userModel, HttpStatus.OK);
//    }



//    @GetMapping (path = "/{userId}",
//            produces = {
//                    MediaType.APPLICATION_XML_VALUE,
//                    MediaType.APPLICATION_JSON_VALUE
//            })
//    @ResponseBody
//    public UserRest getUser(@PathVariable String userId){
//
//        UserRest userModel = new UserRest();
//        userModel.setEmail("sadasd");
//        userModel.setFirstName("Sergey");
//        userModel.setLastName("Kargopolov");
//
////        return "User id" + userId;
//        return userModel;
//
//    }



//    @GetMapping (path = "/{userId}",
////            produces = {
////                MediaType.APPLICATION_XML_VALUE,
////                MediaType.APPLICATION_JSON_VALUE
////            }
//            produces={ "application/json"}
//            )
//    @ResponseBody
//    public ResponseEntity<UserRest> getUser(@PathVariable String userId){
//
//        UserRest userModel = new UserRest();
//        userModel.setEmail("sadasd");
//        userModel.setFirstName("Sergey");
//        userModel.setLastName("Kargopolov");
//
////        return "User id" + userId;
//        return new ResponseEntity<UserRest>(userModel, HttpStatus.OK);
//
//    }

    /**
     * Used to create a User in the DB
     *
     * @param users refers to the User needs to be saved
     * @return the {@link UserRest} created
     */
    @PostMapping(value = "/load")
    public UserRest load(@RequestBody final UserRest users) {
        userJpaRespository.save(users);
        return userJpaRespository.findByFirstName(users.getFirstName());
    }


//    @RequestMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

}
