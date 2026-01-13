package config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${type}.properties",
        "classpath:local.properties"
})
public interface WebConfig extends Config {

    @Key("browser")
    String browser();

    @Key("browserVersion")
    String browserVersion();

    @Key("isRemote")
    @DefaultValue("false")
    boolean isRemote();

    @Key("remoteUrl")
    String remoteUrl();
}