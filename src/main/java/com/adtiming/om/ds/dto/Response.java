// Copyright 2020 ADTIMING TECHNOLOGY COMPANY LIMITED
// Licensed under the GNU Lesser General Public License Version 3

package com.adtiming.om.ds.dto;


import com.alibaba.fastjson.JSONObject;

public class Response {

    public static final int SUCCESS_CODE = 0;

    public static final String STATUS_ENABLE = "enable";

    public static final String STATUS_DISABLE = "disable";

    public static final int CODE_RES_UNAUTHORIZED = 1000;

    public static final int CODE_RES_FAILED = 1001;

    public static final int CODE_DATABASE_ERROR = 1003;

    public static final int CODE_PARAMETER_ERROR = 1004;

    public static final int CODE_RES_DATA_EXISTED = 1005;
    public static final Response RES_UNAUTHORIZED = new Response(CODE_RES_UNAUTHORIZED, STATUS_DISABLE, "Insufficient authority");
    public static final Response RES_FAILED = new Response(CODE_RES_FAILED, STATUS_DISABLE, "Request failed");
    public static final Response RES_DATA_DOES_NOT_EXISTED = new Response(1002, STATUS_DISABLE, "Data does not existed");
    public static final Response RES_DB_ERROR = new Response(CODE_DATABASE_ERROR, STATUS_DISABLE, "Database error");
    public static final Response RES_PARAMETER_ERROR = new Response(CODE_PARAMETER_ERROR, STATUS_DISABLE, "Parameter error");
    public static final Response RES_DATA_EXISTED = new Response(CODE_RES_DATA_EXISTED, STATUS_DISABLE, "Data does existed");
    public static final Response RES_PUBLISHER_NOT_EXISTED = new Response(1006, STATUS_DISABLE, "Publisher does existed");
    public static final Response RES_PUBLISHER_APP_NOT_EXISTED = new Response(1007, STATUS_DISABLE, "Publisher APP does existed");
    private int code;
    private String status;
    private String msg;
    private Object data;

    public Response() {
    }

    public Response(int code, String status, String msg) {
        this.code = code;
        this.status = status;
        this.msg = msg;
    }

    public Response(int code, String status, String msg, Object data) {
        this.code = code;
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static Response buildSuccess(Object data) {
        Response response = build();
        response.code = 0;
        response.data(data);
        return response;
    }

    public static Response failure(int code, String msg) {
        Response response = build();
        response.code = code;
        response.msg(msg);
        return response;
    }

    public static Response build(int code, String status, String msg) {
        return new Response(code, status, msg);
    }

    public static Response build() {
        return new Response(0, STATUS_ENABLE, "OK");
    }

    public Response code(int code) {
        this.code = code;
        return this;
    }

    public Response stats(String stats) {
        this.status = stats;
        return this;
    }

    public Response msg(String msg) {
        this.msg = msg;
        return this;
    }

    public Response data(Object data) {
        this.data = data;
        return this;
    }

    public int getCode() {
        return code;
    }

    public String getStatus() {
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }

}
