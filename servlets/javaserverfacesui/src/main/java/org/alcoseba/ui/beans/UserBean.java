package org.alcoseba.ui.beans;

import java.io.Serializable;

public class UserBean implements Serializable {

	private static final long serialVersionUID = -1316387916988047277L;

	private String firstName;
	private String lastName;
	private String output;

	public void save() {
		output = "You submitted: " + firstName;
		System.out.println("SAVED");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
}
