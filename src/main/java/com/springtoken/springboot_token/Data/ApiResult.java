package com.springtoken.springboot_token.Data;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class ApiResult {

    /** 代码 */
    private String code;

    /** 结果 */
    private String msg;

    public ApiResult(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
