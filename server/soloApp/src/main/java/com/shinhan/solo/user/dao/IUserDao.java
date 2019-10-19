package com.shinhan.solo.user.dao;

import java.util.List;

import com.shinhan.solo.user.User;

public interface IUserDao {
	int userInsert(User user);
	User userSelect(String uuid); //ȸ�� ���� ���� �Ǻ�
	User userSelect(String name, String idNum); // ���� ���� �ɻ�
	int userUpdate(String password, String idNum);
	int userDelete(String idNum);
	List<User> userAllSelect();
}