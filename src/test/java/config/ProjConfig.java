package config;

import org.aeonbits.owner.Config;

@Config.Sources("classpath:config/${env}.properties")
public interface ProjConfig extends Config {
    String first_name();
    String last_name();
}
