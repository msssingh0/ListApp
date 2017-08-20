//bean class for shared list

package com.family_synergy.bean;

import java.util.ArrayList;

public class UserGroup {

	private ArrayList<User> memberUsers=new ArrayList<>();
	private String groupName;
	private int memberCount;
	
	public int getMemberCount() {
		return memberCount;
	}
	public void setMemberCount(int memberCount) {
		this.memberCount = memberUsers.size();
	}
	public ArrayList<User> getMemberUsers() {
		return memberUsers;
	}
	public void setMemberUsers(ArrayList<User> memberUsers) {
		this.memberUsers = memberUsers;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	
	//Method to show result of user add operation
	public boolean addUser()
	{
		return true;
	}
}
