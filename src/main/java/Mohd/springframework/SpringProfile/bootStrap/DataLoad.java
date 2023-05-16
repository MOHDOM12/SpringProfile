package Mohd.springframework.SpringProfile.bootStrap;

import Mohd.springframework.SpringProfile.model.MyProfile;
import Mohd.springframework.SpringProfile.service.MyProfileService;
import org.springframework.boot.CommandLineRunner;


public class DataLoad implements CommandLineRunner {
    private final MyProfileService myProfileService;


    public DataLoad(MyProfileService myProfileService)
    {
        this.myProfileService = myProfileService;
    }

    @Override
    public void run(String... args) throws Exception {
        MyProfile myProfile1 = new MyProfile();


        myProfile1.setEmail("M.alomran20@outlook.com");
        myProfile1.setPhone("590241122");
        myProfile1.setMyGithub("-------");

        myProfileService.save(myProfile1);
    }
}
