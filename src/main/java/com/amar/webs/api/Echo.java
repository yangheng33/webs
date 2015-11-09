/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.amar.webs.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author amar
 */
public class Echo<T> {

    public static String SUCCESS = "success";
    public static String FAIL = "fail";
    /**
     * 错误信息，如果status等于fail才会有值
     */
    public static final String ERROR = "error";
    public static final String STATUS = "status";
    private static final String INFO = "info";
    
    //@JsonProperty(STATUS)
    private String status;
    //@JsonProperty(ERROR)
    private String error;
    //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    //@JsonSerialize(contentUsing = GrantedAuthoritySerializer.class)
    //@JsonDeserialize(contentUsing = GrantedAuthorityDeserializer.class)
    //@JsonProperty(INFO)
    private List<T> info;

    public Echo() {
	info = new ArrayList<>();
    }

    public Echo putSuccess(T t) {
        return put(SUCCESS, t, "");
    }

    public Echo putFail(String error) {
        return put(FAIL, null, error);
    }

    
    public Echo put(String status, T t, String error) {
        this.status = status;
        this.info.add(t)  ;
        this.error = error;
        return this;
    }
}
