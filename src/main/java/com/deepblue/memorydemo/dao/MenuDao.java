package com.deepblue.memorydemo.dao;

import com.deepblue.memorydemo.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    public List<MainMenu> getMenus();
}
