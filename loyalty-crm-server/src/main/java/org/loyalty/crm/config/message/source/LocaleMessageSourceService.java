package org.loyalty.crm.config.message.source;


import java.util.Locale;
import javax.annotation.Resource;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

/**
 * 国际化
 *
 * 在这个代码中我封装了3个常用的方法，那么应该怎么调用呢？也很简单，在需要的地方使用如下代码进行注入：

    @Resource
    private LocaleMessageSourceService localeMessageSourceService;

    在需要的地方使用如下代码进行调用：

    String msg3 = localeMessageSourceService.getMessage("welcome");
 */
@Component
public class LocaleMessageSourceService {

    @Resource
    private MessageSource messageSource;

    /**
     * @param code ：对应messages配置的key.
     * @return
     */
    public String getMessage(String code){
        return getMessage(code,null);
    }

    /**
     *
     * @param code ：对应messages配置的key.
     * @param args : 数组参数.
     * @return
     */
    public String getMessage(String code,Object[] args){
        return getMessage(code, args,"");
    }


    /**
     *
     * @param code ：对应messages配置的key.
     * @param args : 数组参数.
     * @param defaultMessage : 没有设置key的时候的默认值.
     * @return
     */
    public String getMessage(String code,Object[] args,String defaultMessage){
        //这里使用比较方便的方法，不依赖request.
        Locale locale = LocaleContextHolder.getLocale();
        return messageSource.getMessage(code, args, defaultMessage, locale);
    }

}
