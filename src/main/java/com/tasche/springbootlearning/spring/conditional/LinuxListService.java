package com.tasche.springbootlearning.spring.conditional;

public class LinuxListService implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
