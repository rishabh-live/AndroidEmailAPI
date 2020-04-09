package androidemailapi;

public class Main{
public static void main(String[] args) {


 Email mail = new Email();
 mail.setAPI_KEY("key");
 mail.setSalt("salt");
 mail.setSenderId("GOPRO");
 mail.setMobileNo("9999999999999");
 mail.setMessage("Test SMS");
 mail.send();
    
}
}