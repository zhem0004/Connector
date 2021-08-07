package BigBlueButton.api;

import java.util.Map;
import java.util.Date;
import java.util.HashMap;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Object for a BigBlueButton meeting.
 * @author Adrian Fish
 * Based on: https://github.com/sakaicontrib/bbb-tool/blob/master/api/src/java/org/sakaiproject/bbb/api/BBBMeeting.java
 * 
 * Last modified by Yunkai Wang
 */
@Getter @Setter @ToString
public class BBBMeeting {
	private String name = null;
	private String meetingID;
	private String attendeePW = null;
	private String moderatorPW = null;
	private String dialNumber = null;
	private String voiceBridge = null;
	private String webVoice = null;
	private String logoutURL = null;
	private Boolean record = null;
	private Long duration = null;
	
	// user cannot directly modify this field
	@Setter (AccessLevel.NONE)
	private Map<String, String> meta = new HashMap<String, String>();
	private String moderatorOnlyMessage = null;
	private Boolean autoStartRecording = null;
	private Boolean allowStartStopRecording = null;
	private Boolean webcamsOnlyForModerator = null;
	private String logo = null;
	private String copyright = null;
	private Boolean muteOnStart = null;
	private String welcome = null;
	private Date startDate = null;
	private Date endDate = null;
	
	public BBBMeeting(String meetingID) {
		this.meetingID = meetingID;
	}
	
	public void addMeta(String key, String value) {
		meta.put(key, value);
	}
	
	public void removeMeta(String key) {
		if (meta.containsKey(key))
			meta.remove(key);
	}
	
	//-----------------------------------

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMeetingID() {
		return meetingID;
	}

	public void setMeetingID(String meetingID) {
		this.meetingID = meetingID;
	}

	public String getAttendeePW() {
		return attendeePW;
	}

	public void setAttendeePW(String attendeePW) {
		this.attendeePW = attendeePW;
	}

	public String getModeratorPW() {
		return moderatorPW;
	}

	public void setModeratorPW(String moderatorPW) {
		this.moderatorPW = moderatorPW;
	}

	public String getDialNumber() {
		return dialNumber;
	}

	public void setDialNumber(String dialNumber) {
		this.dialNumber = dialNumber;
	}

	public String getVoiceBridge() {
		return voiceBridge;
	}

	public void setVoiceBridge(String voiceBridge) {
		this.voiceBridge = voiceBridge;
	}

	public String getWebVoice() {
		return webVoice;
	}

	public void setWebVoice(String webVoice) {
		this.webVoice = webVoice;
	}

	public String getLogoutURL() {
		return logoutURL;
	}

	public void setLogoutURL(String logoutURL) {
		this.logoutURL = logoutURL;
	}

	public Boolean getRecord() {
		return record;
	}

	public void setRecord(Boolean record) {
		this.record = record;
	}

	public Long getDuration() {
		return duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public Map<String, String> getMeta() {
		return meta;
	}

	public void setMeta(Map<String, String> meta) {
		this.meta = meta;
	}

	public String getModeratorOnlyMessage() {
		return moderatorOnlyMessage;
	}

	public void setModeratorOnlyMessage(String moderatorOnlyMessage) {
		this.moderatorOnlyMessage = moderatorOnlyMessage;
	}

	public Boolean getAutoStartRecording() {
		return autoStartRecording;
	}

	public void setAutoStartRecording(Boolean autoStartRecording) {
		this.autoStartRecording = autoStartRecording;
	}

	public Boolean getAllowStartStopRecording() {
		return allowStartStopRecording;
	}

	public void setAllowStartStopRecording(Boolean allowStartStopRecording) {
		this.allowStartStopRecording = allowStartStopRecording;
	}

	public Boolean getWebcamsOnlyForModerator() {
		return webcamsOnlyForModerator;
	}

	public void setWebcamsOnlyForModerator(Boolean webcamsOnlyForModerator) {
		this.webcamsOnlyForModerator = webcamsOnlyForModerator;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public Boolean getMuteOnStart() {
		return muteOnStart;
	}

	public void setMuteOnStart(Boolean muteOnStart) {
		this.muteOnStart = muteOnStart;
	}

	public String getWelcome() {
		return welcome;
	}

	public void setWelcome(String welcome) {
		this.welcome = welcome;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	
	
}
