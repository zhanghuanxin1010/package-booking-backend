package tws.entity;

import java.sql.Date;

import org.springframework.stereotype.Component;
@Component
public class Packagess {
private String  id;
private String clientName;
private String phone;
private String status;
private String weight;
private String appointmentTime;
public String getWeight() {
	return weight;
}
public void setWeight(String weight) {
	this.weight = weight;
}

public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getClientName() {
	return clientName;
}
public void setClientName(String clientName) {
	this.clientName = clientName;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getAppointmentTime() {
	return appointmentTime;
}
public void setAppointmentTime(String appointmentTime) {
	this.appointmentTime = appointmentTime;
}
public Packagess(String id, String clientName, String phone, String status, String appointmentTime) {
	super();
	this.id = id;
	this.clientName = clientName;
	this.phone = phone;
	this.status = status;
	this.appointmentTime = appointmentTime;
}
public Packagess() {
	super();
}



}
