package com.board.user.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.menus.domain.MenuVo;
import com.board.user.domain.UserVo;

@Mapper
public interface UserMapper {

	List<UserVo> getUserList();

	void insertUser(UserVo userVo);

	//UserVo getUser(UserVo userVo);
	
	HashMap<String,	Object> getUser(UserVo userVo);

	void updateUser(UserVo userVo);

	void delete(UserVo userVo);
}
