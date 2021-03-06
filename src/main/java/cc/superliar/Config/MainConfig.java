package cc.superliar.Config;

import me.chanjar.weixin.mp.api.WxMpConfigStorage;
import me.chanjar.weixin.mp.api.WxMpInMemoryConfigStorage;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.api.impl.WxMpServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by FirenzesEagle on 2016/5/30 0030.
 * Email:liumingbo2008@gmail.com
 */
@Configuration
public class MainConfig {

    //TODO 填写公众号开发信息
    //商站宝测试公众号 APP_ID
    protected static final String APP_ID = "wxa2e22be671c6774b";
    //商站宝测试公众号 APP_SECRET
    protected static final String APP_SECRET = "2833fb4fa09b18f4218661131b95c0f2";
    //商站宝测试公众号 TOKEN
    protected static final String TOKEN = "weixin";
    //商站宝测试公众号 AES_KEY
    protected static final String AES_KEY = "";



    @Bean
    public WxMpConfigStorage wxMpConfigStorage() {
        WxMpInMemoryConfigStorage configStorage = new WxMpInMemoryConfigStorage();
        configStorage.setAppId(MainConfig.APP_ID);
        configStorage.setSecret(MainConfig.APP_SECRET);
        configStorage.setToken(MainConfig.TOKEN);
        configStorage.setAesKey(MainConfig.AES_KEY);
        return configStorage;
    }

    @Bean
    public WxMpService wxMpService() {
        WxMpService wxMpService = new WxMpServiceImpl();
        wxMpService.setWxMpConfigStorage(wxMpConfigStorage());
        return wxMpService;
    }

}
