package com.brunoserafini.workshopmongo.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.brunoserafini.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
