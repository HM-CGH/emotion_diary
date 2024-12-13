package stepup.emotiondiary.dto;

import org.springframework.stereotype.Component;

@Component
public class CalendarDTO {

	private int calendar_no;
	private String calendar_title;
	private String calendar_memo;
	private String calendar_start;
	private String calendar_end;
	
	
	
	public int getCalendar_no() {
		return calendar_no;
	}
	public void setCalendar_no(int calendar_no) {
		this.calendar_no = calendar_no;
	}
	public String getCalendar_title() {
		return calendar_title;
	}
	public void setCalendar_title(String calendar_title) {
		this.calendar_title = calendar_title;
	}
	public String getCalendar_memo() {
		return calendar_memo;
	}
	public void setCalendar_memo(String calendar_memo) {
		this.calendar_memo = calendar_memo;
	}
	public String getCalendar_start() {
		return calendar_start;
	}
	public void setCalendar_start(String calendar_start) {
		this.calendar_start = calendar_start;
	}
	public String getCalendar_end() {
		return calendar_end;
	}
	public void setCalendar_end(String calendar_end) {
		this.calendar_end = calendar_end;
	}
	
	
	
	
	
	
	
	
	
}
