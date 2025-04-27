package com.pk.beans;

import java.util.Date;

public class ScheduleReminder{
	private Date date;
	public void setDate(Date date) {
		this.date=date;
	}
	public String toString() {
		return "ScheduleReminder[date="+date+"]";
	}
}
