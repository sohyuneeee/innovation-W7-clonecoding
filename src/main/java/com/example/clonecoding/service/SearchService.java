package com.example.clonecoding.service;

import com.example.clonecoding.model.Lecture;
import com.example.clonecoding.repository.LectureRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class SearchService {

    private final LectureRepository lectureRepository;


    public List<Lecture> searchLecture(String keyword) {
        List<Lecture> lectures = lectureRepository.findByTitleContaining(keyword);
        return lectures;
    }


}
