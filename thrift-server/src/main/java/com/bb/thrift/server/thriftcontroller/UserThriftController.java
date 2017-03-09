package com.bb.thrift.server.thriftcontroller;

import bb.spring.boot.thrift.server.annotation.ThriftController;
import cloud.simple.interfaces.UserDto;
import cloud.simple.interfaces.UserService;
import org.apache.thrift.TException;


/**
 * Created by bob on 17/1/11.
 */
@ThriftController(value = "/hello2")
public class UserThriftController implements UserService.Iface {


    @Override
    public UserDto getUser() throws TException
    {
        UserDto user = new UserDto(1000,"david");
        return user;
    }

}