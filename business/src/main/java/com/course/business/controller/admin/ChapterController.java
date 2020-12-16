package com.course.business.controller.admin;

import com.course.domain.Chapter;
import com.course.dto.ChapterDto;
import com.course.service.ChapterService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class ChapterController {
        @Resource
        private ChapterService chapterService;
        @GetMapping("/chapter")
        public List<ChapterDto> chapter(){
            return chapterService.list();
        }
}
