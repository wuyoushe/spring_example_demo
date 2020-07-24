package com.springtoken.springboot_token.Data;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class AppInfo {
    /** App id */
    private String appId;
    /** API 秘钥 */
    private String key;

    public AppInfo(String appId, String key) {
        this.appId = appId;
        this.key = key;
    }

    public String getKey()
    {
       return null;
    }
}
