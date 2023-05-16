package Mohd.springframework.SpringProfile.service.map;

import Mohd.springframework.SpringProfile.model.MyProfile;
import Mohd.springframework.SpringProfile.service.MyProfileService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MyProfileMapService extends AbstractMapService<MyProfile,Long> implements MyProfileService {

    @Override
    public Set<MyProfile> findAll() {
        return super.findAll();
    }
    @Override
    public MyProfile findByFullName(String fullName) {
        return this.findByFullName(fullName);
    }

    @Override
    public MyProfile findById(Long Id) {
        return this.findById(Id);
    }

    @Override
    public MyProfile save(MyProfile myProfile) {
        return this.save(myProfile);
    }

    @Override
    public void delete(MyProfile object) {
        this.delete(object);
    }

    @Override
    public void deleteById(Long Id) {
        this.deleteById(Id);
    }
}
