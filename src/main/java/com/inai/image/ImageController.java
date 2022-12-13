package com.inai.image;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/images")
public class ImageController {

    private final ImageService imageService;


    @GetMapping("/change-color")
    public ResponseEntity<String> changeColor(@RequestPart MultipartFile multipartFile) throws IOException {
        return ResponseEntity.ok(imageService.changeColor(multipartFile));
    }

    @GetMapping("/get-urls")
    public ResponseEntity<List<String>> getUrls() {
        return ResponseEntity.ok(imageService.getUrls());
    }

}
