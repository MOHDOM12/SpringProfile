package Mohd.springframework.SpringProfile.model;



public class MyProfile{

    private String FullName;
    private Long Id;
    private String phone;
    private String Email;
    private String myGithub;

    public MyProfile(String fullName, Long id, String phone, String email, String myGithub) {
        this.FullName = fullName;
        this.Id = id;
        this.phone = phone;
        this.Email = email;
        this.myGithub = myGithub;
    }

    public MyProfile() {

    }


    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getMyGithub() {
        return myGithub;
    }

    public void setMyGithub(String myGithub) {
        this.myGithub = myGithub;
    }
}
