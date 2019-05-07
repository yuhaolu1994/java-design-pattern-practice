package com.yuhao.design.pattern.creational.simplefactory;

public class VideoFactory {
    public Video getVideo(Class c) {
        Video video = null;
        try {
            // use java reflection
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }
}
