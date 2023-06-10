package com.ttice.icewkment.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * <p>
 *  返回本机ip地址和端口
 * </p>
 *
 * @author admin
 * @since 2022-02-19
 */
@Component
public class ServerConfig  implements ApplicationListener<WebServerInitializedEvent> {
    @Value("${myhost}")
    private String myHost;
    private Integer port;

    public String getUrl() {
        return myHost;
//        InetAddress address = null;
//        try {
//            address = InetAddress.getLocalHost();
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }
//        return "http://"+address.getHostAddress() +":"+"8181";
    }

    @Override
    public void onApplicationEvent(WebServerInitializedEvent webServerInitializedEvent) {
        this.port = webServerInitializedEvent.getWebServer().getPort();
    }

}
