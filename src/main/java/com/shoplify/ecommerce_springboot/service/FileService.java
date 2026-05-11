package com.shoplify.ecommerce_springboot.service;

import com.shoplify.ecommerce_springboot.model.ProductImage;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService<T, P> {
    T saveFile(P entity, MultipartFile file) throws IOException;
    void deleteFile(String filename, String subfolder);
}
