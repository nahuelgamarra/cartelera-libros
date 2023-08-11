package com.cartelera.cartelera.controller;
import com.cartelera.cartelera.model.User;
import com.cartelera.cartelera.service.UserService;
import com.cartelera.cartelera.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/users")
public class UserController extends BaseControllerImpl<User, UserServiceImp> {

}
