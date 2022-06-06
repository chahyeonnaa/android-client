package com.example.myapplication.Book.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MajorCreateDto {
    String name;
    MajorCollegeCreateDto majorCollegeCreateDto;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MajorCollegeCreateDto getMajorCollegeCreateDto() {
        return majorCollegeCreateDto;
    }

    public void setMajorCollegeCreateDto(MajorCollegeCreateDto majorCollegeCreateDto) {
        this.majorCollegeCreateDto = majorCollegeCreateDto;
    }
}
