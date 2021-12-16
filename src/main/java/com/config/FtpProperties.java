package com.config;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FtpProperties {
    private String host = "8.141.64.204";
    private Integer port = 21;
    private String username ="root";
    private String password = "centOS8.";
    private String basePath = "/root/nginx/html/article";
    private String httpPath = "http://192.168.134.139";
}
