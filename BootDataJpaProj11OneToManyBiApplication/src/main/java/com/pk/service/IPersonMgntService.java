package com.pk.service;

import java.util.List;

public interface IPersonMgntService {
	public List<Object[]> fetchDataByJoinsUsingParent();
	public List<Object[]> fetchChildToParentJoinsData();
}
