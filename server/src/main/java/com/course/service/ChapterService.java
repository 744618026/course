package com.course.service;



import com.course.domain.Chapter;
import com.course.domain.ChapterExample;
import com.course.dto.ChapterDto;
import com.course.mapper.ChapterMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterService {
    @Resource
    private ChapterMapper chapterMapper;
    public List<ChapterDto> list(){
        ChapterExample chapterExample = new ChapterExample();
        List<Chapter> chapters =  chapterMapper.selectByExample(chapterExample);
        List<ChapterDto> chapterDtos = new ArrayList<>();
        for(Chapter chapter:chapters){
            ChapterDto chapterDto = new ChapterDto();
            BeanUtils.copyProperties(chapter,chapterDto);
            chapterDtos.add(chapterDto);
        }
        return chapterDtos;
    }
}
