package androidemailapi;


public class Email {

  private String API_KEY;
  private String SenderId;
  private String MobileNo;
  private String Message;
  private String Salt;

  

  public String getSalt() {
    return Salt;
  }

  public void setSalt(String salt) {
    this.Salt = salt;
  }

  public String getMessage() {
    return Message;
  }

  public void setMessage(String message) {
    this.Message = message;
  }

  public String getMobileNo() {
    return MobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.MobileNo = mobileNo;
  }

  public String getSenderId() {
    return SenderId;
  }

  public void setSenderId(String senderId) {
    this.SenderId = senderId;
  }

  public String getAPI_KEY() {
    return API_KEY;
  }

  public void setAPI_KEY(String key) {
    this.API_KEY = key;
    
  }

  public void send() {
     Sender sendsms = new Sender();
     sendsms.start();
    System.out.println("yo");
  }

  
}