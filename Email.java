public class Email{

  String API_KEY;
  String SenderId;
  String MobileNo;
  String Message;

  public void theAPI(String key, String salt){
    this.API_KEY = key;
  }

  public void theSender(String id){
    this.SenderId = id;
  }

  public void theReceiver(String no){
    this.MobileNo = no;
  }

  
}