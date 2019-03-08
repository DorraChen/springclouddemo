package com.example.springcloud.eurekazuulclient;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;

import javax.servlet.http.HttpServletRequest;

import java.io.IOException;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * @author clz
 * @date 2019/03/08 10:14
 */
@Component
public class MyFilter extends ZuulFilter {
    private static Logger logger = LoggerFactory.getLogger(MyFilter.class);
    @Override
    public String filterType() {
        // 过滤器的类型
        return PRE_TYPE;
    }
    @Override
    public int filterOrder() {
        // 过滤顺序,值越小越先执行过滤器
        return 0;
    }
    @Override
    public boolean shouldFilter() {
        // 过滤器是否过滤逻辑,如果为true则执行run();如果为false则不执行run()方法
        return true;
    }
    @Override
    public Object run() { // 过滤逻辑
        RequestContext ctx = RequestContext.getCurrentContext();
        // 获取request
        HttpServletRequest request = ctx.getRequest();
        logger.info("send {} request to {}", request.getMethod(), request.getRequestURL().toString());
        Object accessToken = request.getParameter("token");

        if (accessToken == null || "".equals(accessToken.toString().trim())){
            logger.warn("token is empty!");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty!");
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }
        logger.info("OK!");
        return null;
    }/* 检查请求的参数中是否传了token这个参数 */


}
