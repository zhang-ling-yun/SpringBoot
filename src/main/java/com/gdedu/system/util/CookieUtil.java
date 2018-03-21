package com.gdedu.system.util;

import com.gdedu.system.constant.CookieConstant;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieUtil {
    private static Cookie[] getCookies() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        Cookie[] cookies = request.getCookies();
        return cookies;
    }

    private static void setCookie(Cookie cookie) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletResponse response = attributes.getResponse();
        response.addCookie(cookie);
    }

    public static void saveCookie(String name, String value) {
        Cookie cookie = new Cookie(name, value);
        cookie.setPath(CookieConstant.PATH);
        cookie.setMaxAge(CookieConstant.EXPIRE);
        setCookie(cookie);
    }

    public static void removeCookie(String name) {
        Cookie[] cookies = getCookies();
        for (int i = 0; i < (cookies == null ? 0 : cookies.length); i++) {
            if ((name).equals(cookies[i].getName())) {
                Cookie cookie = new Cookie(name, "");
                cookie.setPath(CookieConstant.PATH);
                cookie.setMaxAge(0);
                saveCookie(name, "");
            }
        }
    }

    public static Cookie getCookie(String name) {
        Cookie[] cookies = getCookies();
        for (int i = 0; i < (cookies == null ? 0 : cookies.length); i++) {
            if (name.equals(cookies[i].getName())) return cookies[i];
        }
        return null;
    }
}
