//package com.spring.hack.mongoauth.repository;
//
//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
//
//import com.spring.hack.mongoauth.domain.User;
//
//
//public interface UserRepository extends MongoRepository<User, String> {
//
//    @Query("{username:'?0'}")
//    User findUserByUsername(String username);
//
//}
