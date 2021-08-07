package ClientSide;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;


import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

import BigBlueButton.api.*;
import BigBlueButton.impl.*;


/**
 * 
 * A java program that creates a meeting on a server with BBB API
 * 
 */
public class Connector {

	static BaseBBBAPI base;
	
	static String serverUrl = "https://bozdomain.de/bigbluebutton";
	
	static String salt = "8888";
	
	static BBBMeeting meeting;
	
	static String meetingID = "8888";
	
	
	public static void main(String[] args) throws IOException {
		
		try {
			base = new BaseBBBAPI(serverUrl, salt);
			meeting = base.createMeeting(meetingID);
			
			System.out.println("");
			System.out.println(base.getAccessUrl());
			Thread.sleep(900000);
			base.endMeeting(meeting);
		} catch (BBBException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
}
