package com.dueeeke.dkplayer.bean;

/**
 * Created by Devlin_n on 2017/6/1.
 */

public class VideoBean {

    private String title;
    private String url;
    private String thumb;
    private boolean isGif = false;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public boolean isGif() { return isGif; }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public void setGif(boolean gif) {
        isGif = gif;
    }

    public VideoBean(String title, String thumb, String url, boolean isGif) {
        this.title = title;
        this.url = url;
        this.thumb = thumb;
        this.isGif = isGif;
    }
}
