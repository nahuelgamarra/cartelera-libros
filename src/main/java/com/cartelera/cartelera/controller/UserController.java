package com.cartelera.cartelera.controller;
import com.cartelera.cartelera.model.User;
import com.cartelera.cartelera.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {
   private UserServiceImp userServiceImp;
   @Autowired
   public UserController(UserServiceImp userServiceImp){
       this.userServiceImp=userServiceImp;
   }
    @GetMapping("")
   public ResponseEntity getAll(){
       try {
           return ResponseEntity.status(HttpStatus.OK).body(userServiceImp.findAll());
       } catch (Exception e) {
         return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
       }
   }
    @GetMapping("/{id}")
   public ResponseEntity <?> getOne(@PathVariable  Long id){
       try {
           return ResponseEntity.status(HttpStatus.OK).body(userServiceImp.findByID(id));
       } catch (Exception e) {
           return  ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error por favor intente mas tarde.\"}");
       }
   }

   @PostMapping("")
   public ResponseEntity<?> save(@RequestBody  User user){
       try {
           return ResponseEntity.status(HttpStatus.OK).body(userServiceImp.save(user));
       } catch (Exception e) {
           return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente mas tarde.\"}");
       }
   }
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id,@RequestBody User user){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(userServiceImp.update(id, user));
        } catch (Exception e) {
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente mas tarde.\"}");
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        try {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(userServiceImp.delete(id));
        } catch (Exception e) {
            return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"error\":\"Error por favor intente mas tarde.\"}");
        }
    }


}
