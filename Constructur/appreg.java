package Constructur;
class  appreg {
    String username;
    String email;
    String password;
    long phone;

    appreg(String arg1,String arg2,String arg3,long arg4) {
        username=arg1;
        email=arg2;
        password=arg3;
        phone=arg4;
    }

    appreg(String arg1,String arg2,String arg3) {
        username=arg1;
        email=arg2;
        password=arg3;
    }
    appreg(String arg1,String arg3,long arg4) {
        username=arg1;
        email=arg3;
        phone=arg4;
    }
    void details(){
        System.out.println("Username: "+username+"\nEmail: "+email+"\nPassword: "+password+"\nPhone: "+phone);
    }
}
