package login_Macmillan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class splitfunction {

	
	public static void main(String a[]) throws FileNotFoundException
	{
		String filepath = "/home/navendushukla/workspace_OLD/MacmillanQPV2/src/test/resources/loginpage.txt";
		
		
		String elementName="Enter_email";
	        
	        BufferedReader br = null;
	        String matchingLine = "";
	        try {
	        	
	        	File f = new File(filepath);
	        	if(!f.exists()) { 
	        		//System.out.println("WARNING : '" + tier + "/" + pageName + ".txt' file not found");
	        	}else {
	                br = new BufferedReader(new FileReader(filepath));
	                String line = br.readLine();
	                while (line != null) {
	                    if (line.split(":", 3)[0].equalsIgnoreCase(elementName)) {
	                        matchingLine = line;
	                        break;
	                    }
	                    line = br.readLine();
	                }
	        	}
	        } catch (IOException ioe) {
	            ioe.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	        String S[]= new String[2];
	        S[0] =matchingLine.split(":", 3)[2];
	        S[1] =matchingLine.split(":", 3)[1];
	        //return S;
	        // TODO: Handle Arrayoutofbounds and Filenotfound exceptions gracefully.
	  System.out.println(S[0]);
		}
}
