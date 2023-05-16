package Mohd.springframework.SpringProfile.service;

import Mohd.springframework.SpringProfile.model.MyProfile;

import java.util.Set;

public interface MyProfileService{
    MyProfile findByFullName(String fullName);

    MyProfile findById(Long Id);

    MyProfile save(MyProfile myProfile);

    Set<MyProfile> findAll();

}
