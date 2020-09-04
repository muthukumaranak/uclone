package com.app.youtubeclone.controller;

import com.app.youtubeclone.entity.MediaFile;
import com.app.youtubeclone.repository.MediaFileRepo;
import com.app.youtubeclone.service.MediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private MediaService mediaService;

    @GetMapping("/")
    public String viewHomePage(Model model) {
        return findPage(1, "title", "asc","",model);
    }

    @GetMapping("/create")
    public String create() {
        return "create";
    }

    @GetMapping("/page/{pageNo}")
    public String findPage( @PathVariable(value = "pageNo") int pageNo, @RequestParam("sortField") String sortField, @RequestParam("sortDirection") String sortDirection, @RequestParam(value = "keyword", required = false) String keyword, Model model) {
        final int PAGE_SIZE = 2;
        Page<MediaFile> page = mediaService.findPage(pageNo, PAGE_SIZE, sortField, sortDirection,keyword);
        List<MediaFile> mediaFiles = page.getContent();
        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDirection", sortDirection);
        model.addAttribute("keyword",keyword);
        model.addAttribute("mediaFiles",mediaFiles);

        return "home";
    }
}