package com.OCR.Reader.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

@Data
public class OCRRequestDTO {

    private MultipartFile imageFile;

}
