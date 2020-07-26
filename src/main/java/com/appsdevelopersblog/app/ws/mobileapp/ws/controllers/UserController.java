package com.appsdevelopersblog.app.ws.mobileapp.ws.controllers;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public String getUsers(@RequestParam(value="page") int page,
                           @RequestParam(value="limit") int limit){
        return "User page " + page +" Limit " +limit;
    }


    @GetMapping (path = "/{userId}")
    public String getUser(@PathVariable String userId){

//        UserRest userModel = new UserRest();
//        userModel.setEmail("sadasd");
//        userModel.setFirstName("Sergey");
//        userModel.setLastName("Kargopolov");

        return "User id" + userId;
//        return new ResponseEntity<UserRest>(HttpStatus.BAD_REQUEST);
    }


//    @GetMapping (path = "/{userId}", produces = {
//                MediaType.APPLICATION_XML_VALUE,
//                MediaType.APPLICATION_JSON_VALUE
//        })
//    public ResponseEntity<UserRest> getUser(@PathVariable String userId){
//
//        UserRest userModel = new UserRest();
//        userModel.setEmail("sadasd");
//        userModel.setFirstName("Sergey");
//        userModel.setLastName("Kargopolov");
//
////        return "User id" + userId;
//        return new ResponseEntity<UserRest>(HttpStatus.BAD_REQUEST);
//    }


//    @RequestMapping("/")
//    public String index() {
//        return "Greetings from Spring Boot!";
//    }

}
