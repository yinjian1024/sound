package com.config;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FtpProperties {
    private String host;
    private Integer port;
    private String username;
    private String password;
    private String basePath;
    private String httpPath;
}
