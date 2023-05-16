package Mohd.springframework.SpringProfile.controller;

import Mohd.springframework.SpringProfile.service.MyProfileService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/myProfiles")
@Controller
public class MyProfileController {
    private final MyProfileService myProfileService;

    public MyProfileController(MyProfileService myProfileService) {
        this.myProfileService = myProfileService;
    }

    @RequestMapping({"","/","/index", "/index.html"})
    public String ListProfile(Model model)
    {
        model.addAttribute("myProfiles", myProfileService.findAll());
        return "myProfiles/index";
    }

}
