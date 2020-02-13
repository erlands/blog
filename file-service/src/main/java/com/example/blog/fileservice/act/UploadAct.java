package com.example.blog.fileservice.act;

import com.github.tobato.fastdfs.domain.fdfs.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;


@RestController
public class UploadAct {

    @Value("${hello}")
    private String hello = "123";

    @Autowired
    private FastFileStorageClient client;

    private String fileserver = "http://r.tohsaka.top/";

    @PostMapping("/file/upload")
    public String upload(MultipartFile file) throws Exception{
        if(file.isEmpty()){
            return null;
        }
        String filename = file.getOriginalFilename();
        String ext;
        int i = filename.lastIndexOf(".");
        if(i == -1){
            ext = "png";
        }else if(i != filename.length()-1){
            ext = filename.substring(i+1);
        }else{
            ext = "png";
        }
        StorePath path = client.uploadFile(file.getInputStream(), file.getSize(), ext, null);
        return fileserver + path.getFullPath();
    }
}
