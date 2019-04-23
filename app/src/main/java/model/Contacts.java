package model;

public class Contacts {
    private String name;
    private String phoneNo;
    private String address;
    private String email;
    private  int imageId;

    public Contacts(String name, String phoneNo, String address, String email, int imageId) {
        this.name = name;
        this.phoneNo = phoneNo;
        this.address = address;
        this.email = email;
        this.imageId = imageId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
