package com.example.homework5;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import io.reactivex.Single;

@Dao
public interface UserDao {

    @Query("SELECT * FROM table_users")
    Single<List<User>> getAll();

    @Query("SELECT * FROM table_users")
    List<User> getList();

    @Insert
    Single<Long> insert (User user);

    @Insert
    Single<List<Long>> insertList(List<User> usersList);

    @Delete
    Single<Integer> delete(User user);

    @Update
    Single<Integer> update(User user);

}
