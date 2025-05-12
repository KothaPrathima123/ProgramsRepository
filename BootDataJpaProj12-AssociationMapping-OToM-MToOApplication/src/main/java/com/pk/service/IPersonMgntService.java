package com.pk.service;

public interface IPersonMgntService {
	public void saveDataUsingParent();
	public void saveDataUsingChild();
	public void loadDataUsingParent();
	public void loadDataUsingChild();
	public String deleteByParent(int pid);
	public String deleteAllChildsOfAParent(int pid);
}
