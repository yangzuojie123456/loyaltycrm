package org.loyalty.crm.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by yangzuojie on 2017/3/16.
 */
@Configuration
@PropertySource("classpath:file.properties")
@ConfigurationProperties(prefix="fileurl")
public class FilesSettings {
    private String headurl;

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }
}
