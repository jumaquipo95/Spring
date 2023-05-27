package com.example.eccomerce_deport.mapper;


import com.example.eccomerce_deport.model.UserRecord;
import com.example.eccomerce_deport.request.UserCreateRequest;

public class UserMapper {

    public static UserRecord mapToSave(UserCreateRequest user, String password){
        UserRecord userRecord = new UserRecord();
        userRecord.setFirstName(user.getFirstName());
        userRecord.setLastName(user.getLastName());
        userRecord.setEmail(user.getEmail());
        userRecord.setPassword(user.getPassword());
        userRecord.setDocument(user.getDocument());
        userRecord.setPhone(user.getPhone());
        userRecord.setPassword(password);
        userRecord.setStatus(true);
        return userRecord;
    }
}
