package com.portal.common.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    // cấu hình kết noois tới csdl
    private  static SessionFactory  sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            return  new Configuration().configure().buildSessionFactory();
        }catch (Throwable ex){
            System.err.println(" lỗi: "+ex);
            //ExceptionInInitializerError: khởi tạo k thành công
            throw new ExceptionInInitializerError(ex);
        }
    }
    public  static SessionFactory getSessionFactory(){
        return  sessionFactory;
    }
}
