package mapper;

import entity.UserEntity;

import java.util.List;

public interface UserMapper {
	
	List<UserEntity> getAll();
	
	UserEntity getOne(Long id);

	UserEntity getOneByName(String userName);

	void insert(UserEntity user);

	void update(UserEntity user);

	void delete(Long id);



}