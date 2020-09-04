package com.app.youtubeclone.controller;

<<<<<<< HEAD
import com.app.youtubeclone.entity.MediaFile;
import com.app.youtubeclone.repository.MediaFileRepo;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
import com.app.youtubeclone.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
>>>>>>> cb0ed0478b0d66792ff456f96a5ee2959526d038
=======
>>>>>>> 3221d561c4d60f96ca4ae72780b965ba6a2729a9
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

<<<<<<< HEAD
    @Autowired
<<<<<<< HEAD
    MediaFileRepo mediaFileRepo;
=======
    private MediaService mediaService;
>>>>>>> cb0ed0478b0d66792ff456f96a5ee2959526d038

=======
>>>>>>> 3221d561c4d60f96ca4ae72780b965ba6a2729a9
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/create")
    public String create(){
        return "create";
    }

    @GetMapping("/userRegistration")
    public String userRegistration(){
        return "userRegistration";
    }

    @GetMapping("/channelRegistration")
    public String channelRegistration(){
        return "channelRegistration";
    }
<<<<<<< HEAD
<<<<<<< HEAD

    @GetMapping("/getall")
    public void get(){
        List<MediaFile> list = mediaFileRepo.findAll();

    }
}
=======
}
>>>>>>> cb0ed0478b0d66792ff456f96a5ee2959526d038
=======
}
>>>>>>> 3221d561c4d60f96ca4ae72780b965ba6a2729a9
