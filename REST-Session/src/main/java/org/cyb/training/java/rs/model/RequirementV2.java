package org.cyb.training.java.rs.model;

import javax.xml.bind.annotation.XmlRootElement;

import org.cyb.training.java.rs.utils.Constants;
import org.cyb.training.java.rs.utils.Constants.ReqState;


@XmlRootElement
public class RequirementV2 {
	int id;
	String title;
	String description;
	private double estimate;
	private double efforts;
	private User owner;
	private Constants.ReqState reqstate;
	
	
	
	public RequirementV2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RequirementV2(int id, String title, String description,
			double estimate, double efforts, User owner, ReqState reqstate) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.estimate = estimate;
		this.efforts = efforts;
		this.owner = owner;
		this.reqstate = reqstate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getEstimate() {
		return estimate;
	}
	public void setEstimate(double estimate) {
		this.estimate = estimate;
	}
	public double getEfforts() {
		return efforts;
	}
	public void setEfforts(double efforts) {
		this.efforts = efforts;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public Constants.ReqState getReqstate() {
		return reqstate;
	}
	public void setReqstate(Constants.ReqState reqstate) {
		this.reqstate = reqstate;
	}
	
}
