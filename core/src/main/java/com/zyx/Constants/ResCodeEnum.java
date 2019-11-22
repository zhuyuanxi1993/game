package com.zyx.Constants;

public enum ResCodeEnum {
    // 成功
    SUCCESS("SSSSSS","成功"),
    // 用户名为空
    ERROR_USERNAME_PARAM_NULL("E00001","用户名为空"),
    // 密码为空
    ERROR_PASSWORD_PARAM_NULL("E00002","密码为空"),
    // 查询Key为空
    ERROR_QUERY_KEY_PARAM_NULL("E00003","查询Key为空"),
    // 查询Key为空
    ERROR_QUERY_FAILED("E00004","查询失败");

    ResCodeEnum(String resCode, String resMsg){
        this.resCode = resCode;
        this.resMsg = resMsg;
    }

    public static final String RESCODE = "resCode";
    public static final String RESMSG = "resMsg";

    private String resCode;
    private String resMsg;

    public String getResCode() {
        return resCode;
    }

    public void setResCode(String resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }
}
