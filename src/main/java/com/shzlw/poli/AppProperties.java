package com.shzlw.poli;
;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "poli")
public class AppProperties {

    Integer datasourceMaximumPoolSize;

    Integer maximumQueryRecords;

    String localeLanguage;

    public AppProperties() {
        datasourceMaximumPoolSize = 50;
        maximumQueryRecords = 1000;
        localeLanguage = "en";
    }

    public Integer getDatasourceMaximumPoolSize() {
        return datasourceMaximumPoolSize;
    }

    public void setDatasourceMaximumPoolSize(Integer datasourceMaximumPoolSize) {
        this.datasourceMaximumPoolSize = datasourceMaximumPoolSize;
    }

    public Integer getMaximumQueryRecords() {
        return maximumQueryRecords;
    }

    public void setMaximumQueryRecords(Integer maximumQueryRecords) {
        this.maximumQueryRecords = maximumQueryRecords;
    }

    public String getLocaleLanguage() {
        return localeLanguage;
    }

    public void setLocaleLanguage(String localeLanguage) {
        this.localeLanguage = localeLanguage;
    }
}
