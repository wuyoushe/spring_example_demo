package com.springtoken.springboot_token.Data;

import java.util.Date;

//@Data
//@AllArgsConstructor
public class AccessToken {
    /** token */
    private String token;

    /** 失效时间 */
    private Date expireTime;

    public AccessToken(String token,Date expireTime) {
        this.token = token;
        this.expireTime = expireTime;
    }
}
