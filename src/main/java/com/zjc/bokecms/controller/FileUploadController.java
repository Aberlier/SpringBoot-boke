package com.zjc.bokecms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * @program: bokecms
 * @description: 上传文件
 * @author: zjc
 * @create: 2020-06-01 21:03
 **/
@RestController
public class FileUploadController {

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");
    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest request){
        String realPath=
                request.getSession().getServletContext().getRealPath("/uploadFile/");
        String format =sdf.format(new Date());
        File folder=new File(realPath + format);
        if(!folder.isDirectory()){
            folder.mkdir();
        }
        String oldName=uploadFile.getOriginalFilename();
        String newName=UUID.randomUUID().toString();
        oldName.substring(oldName.lastIndexOf("."),oldName.length());
        System.out.println("截取的字符串为："+oldName.substring(oldName.lastIndexOf("."),oldName.length()));
        try {
            uploadFile.transferTo(new File(folder,newName));
            String filePath=request.getScheme() + "://" + request.getServerName() + ":" +request.getServerPort()
                + "/uploadFile" +format + newName;
            return filePath;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }
}
