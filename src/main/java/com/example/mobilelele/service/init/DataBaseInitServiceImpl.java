package com.example.mobilelele.service.init;

import com.example.mobilelele.service.userRole.UserRoleService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;

public class DataBaseInitServiceImpl implements DataBaseInitService{
    private final UserRoleService userRoleService;

    @Autowired
    public DataBaseInitServiceImpl(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }
    @PostConstruct
    public void postConstruct(){
        dbInit();
    }

    @Override
    public void dbInit() {
        if(isDbInit()){
            this.userRoleService.dbInit();
        }


    }

    @Override
    public boolean isDbInit() {
      return this.userRoleService.isDbInit();
    }
}
