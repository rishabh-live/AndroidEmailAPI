package androidemailapi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;




public class Sender extends Thread {

    public final static String USER_AGENT = "Mozilla/5.0";

    public final static String GET_URL = "http://covid19.languagenectar.com";

   // public final String POST_URL = "http://localhost";

    public final String POST_PARAMS = "userName=Pankaj";

    public void run() {

        try {
            sendGET();
        } catch (final IOException e) {
            
            e.printStackTrace();
        }
        System.out.println("GET DONE");
        // sendPOST();
        // System.out.println("POST DONE");
    }

    private static void sendGET() throws IOException {
        final URL obj = new URL(GET_URL);
        final HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);
        final int responseCode = con.getResponseCode();
        System.out.println("GET Response Code :: " + responseCode);
        if (responseCode == HttpURLConnection.HTTP_OK) { // success
            final BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            final StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();

			// print result
			//System.out.println(response.toString());
		} else {
			System.out.println("GET request not worked");
		}

	}
}

