package com.itjiayan.model;

import lombok.Data;

import java.util.List;

@Data
public class NoteVO {

    private Integer current;
    private Integer size;
    private Long total;
    private List<Note> noteList;


}
