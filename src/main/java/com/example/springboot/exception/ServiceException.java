package com.example.springboot.exception;

/**
 * 功能：
 * 作者：俞凌志
 * 日期： ServiceException ServiceException
 */
public class ServiceException extends RuntimeException{

     public ServiceException(String msg) {
         super(msg);
     }
}
