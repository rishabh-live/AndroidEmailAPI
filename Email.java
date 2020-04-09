public class Email {

    String emailid = "blank";
    String emailpassword = "blank";
    String emailmessage = "blank";
    String toemail = "blank";
    String htmlMail = "notavailable";
    String sendotp = "no";
    String subject = "blank";

    public String EmailId(final String email) {

        this.emailid;
        // return password;

    }

    public String Password(final String password) {
        emailpassword = password;
        return emailpassword;
    }



    public String SimpleMail(final String message){
        emailmessage = message;
        return emailmessage;
    }

    public String ToEmail(final String to){
        toemail = to;
        return toemail;


    public String HtmlMail(final String htmlmail){
      htmlMail = htmlmail;
      return htmlMail;
    }

    public String SendOtp(String send){
      sendotp = send;
      return sendotp;
    }

    public String Subject(String subj){
      Subject = subj;
      return Subject;
    }

    public void execute()
    {
      if (emailid.equals("blank")) {
        System.out.println("Error 4041: Email ID not found.");
        System.exit(0);
      }
      if (password.equals("blank")) {
        System.out.println("Error 4042: Password not found.");
        System.exit(0);
      }
      if (toemail.equals("blank")) {
        System.out.printnl("Error 4043: Reciptent not found");
        System.exit(0);
      }
      if (subject.equals("blank")) {
        System.out.println("Error 4044: Subject not found");
        System.exit(0);
      }
      if (emailmessage.equals("blank")) {
        System.out.println("Error 4045: Message not found");
        System.exit(0);
      }
    }

}
