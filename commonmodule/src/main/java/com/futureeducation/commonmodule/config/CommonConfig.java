package com.futureeducation.commonmodule.config;


import com.futureeducation.commonmodule.application.CommonApplication;
import com.futureeducation.commonmodule.utill.FileUtils;
import com.yanzhenjie.kalle.util.IOUtils;

import java.io.File;

/**
 * Created by ${zhou}.
 * User: Administrator
 * Date: 2019/4/29
 * Time: 17:55
 * 基础配置
 */
public class CommonConfig {
    private static CommonConfig sInstance;

    public static CommonConfig getInstance() {
        if (sInstance == null)
            synchronized (CommonConfig.class) {
                if (sInstance == null)
                    sInstance = new CommonConfig();
            }
        return sInstance;
    }


    /**
     * App root path.
     */
    public final String PATH_APP_ROOT;
    /**
     * Download.
     */
    public final String PATH_APP_DOWNLOAD;
    /**
     * Images.
     */
    public final String PATH_APP_IMAGE;
    /**
     * Cache root path.
     */
    public final String PATH_APP_CACHE;

    private CommonConfig() {
        this.PATH_APP_ROOT = FileUtils.getAppRootPath(CommonApplication.Companion.getInstance()).getAbsolutePath() + File.separator + "futureeducation";
        this.PATH_APP_DOWNLOAD = PATH_APP_ROOT + File.separator + "Download";
        this.PATH_APP_IMAGE = PATH_APP_ROOT + File.separator + "Images";
        this.PATH_APP_CACHE = PATH_APP_ROOT + File.separator + "Cache";

    }

    /**
     * Initialize file system for app.
     */
    public void initFileDir() {
        IOUtils.createFolder(PATH_APP_ROOT);
        IOUtils.createFolder(PATH_APP_DOWNLOAD);
        IOUtils.createFolder(PATH_APP_IMAGE);
        IOUtils.createFolder(PATH_APP_CACHE);

    }
}