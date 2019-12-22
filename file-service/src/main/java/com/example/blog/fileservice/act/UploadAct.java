package com.example.blog.fileservice.act;

import com.example.blog.fileservice.utils.FastdfsUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class UploadAct {

    @Value("${hello}")
    private String hello = "123";

    @GetMapping("/file/hello")
    public String hello(){
        return hello;
    }

    @PostMapping("/file/upload")
    public String upload(MultipartFile file) throws Exception{
        String confUrl=this.getClass().getClassLoader().getResource("/fdfs_client.properties").getPath();
        FastdfsUtils fastDFSClient=new FastdfsUtils(confUrl);
        return "12345";
    }
}
